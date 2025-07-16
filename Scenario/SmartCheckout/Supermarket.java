import java.util.*;

class Item {
    String name;
    double price;
    int stock;

    public Item(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

class Customer {
    String id;
    List<String> items;

    public Customer(String id, List<String> items) {
        this.id = id;
        this.items = new ArrayList<>(items);
    }

    @Override
    public String toString() {
        return "Customer{id='" + id + "', items=" + items + "}";
    }
}

class SmartCheckout {
    private Queue<Customer> checkoutQueue;
    private HashMap<String, Item> inventory;

    public SmartCheckout() {
        checkoutQueue = new LinkedList<>();
        inventory = new HashMap<>();
    }

    // Add item to inventory
    public void addItemToInventory(String name, double price, int stock) {
        inventory.put(name, new Item(name, price, stock));
        System.out.println("Added item: " + name + ", Price: $" + price + ", Stock: " + stock);
    }

    // Add customer to queue
    public void addCustomer(String id, List<String> items) {
        Customer customer = new Customer(id, items);
        checkoutQueue.offer(customer);
        System.out.println("Added to queue: " + customer);
    }

    // Process next customer in queue
    public boolean processNextCustomer() {
        Customer customer = checkoutQueue.poll();
        if (customer == null) {
            System.out.println("No customers in queue!");
            return false;
        }

        double total = 0.0;
        boolean canProcess = true;

        // Check stock for all items
        for (String itemName : customer.items) {
            Item item = inventory.get(itemName);
            if (item == null) {
                System.out.println("Item " + itemName + " not found in inventory for " + customer.id);
                canProcess = false;
                break;
            }
            if (item.stock <= 0) {
                System.out.println("Item " + itemName + " out of stock for " + customer.id);
                canProcess = false;
                break;
            }
            total += item.price;
        }

        // If all items are available, update stock
        if (canProcess) {
            for (String itemName : customer.items) {
                Item item = inventory.get(itemName);
                item.stock--;
                System.out.println("Processed item: " + itemName + ", New stock: " + item.stock);
            }
            System.out.println("Processed " + customer.id + ", Total: $" + total);
        } else {
            // Re-add customer to queue if processing failed
            checkoutQueue.offer(customer);
            System.out.println("Failed to process " + customer.id + ", re-added to queue");
        }
        return canProcess;
    }

    // Display current queue
    public void displayQueue() {
        if (checkoutQueue.isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Current queue:");
        for (Customer customer : checkoutQueue) {
            System.out.println("  " + customer);
        }
    }

    // Display inventory
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }
        System.out.println("Current inventory:");
        for (Item item : inventory.values()) {
            System.out.println("  Item: " + item.name + ", Price: $" + item.price + ", Stock: " + item.stock);
        }
    }
}

public class Supermarket {
    public static void main(String[] args) {
        SmartCheckout checkout = new SmartCheckout();

        // Add items to inventory
        checkout.addItemToInventory("Apple", 0.5, 10);
        checkout.addItemToInventory("Bread", 2.0, 5);
        checkout.addItemToInventory("Milk", 3.0, 3);

        // Add customers to queue
        checkout.addCustomer("C001", Arrays.asList("Apple", "Bread"));
        checkout.addCustomer("C002", Arrays.asList("Milk", "Apple"));
        checkout.addCustomer("C003", Arrays.asList("Bread", "Milk", "Orange")); // Orange not in inventory

        // Display initial state
        checkout.displayQueue();
        checkout.displayInventory();

        // Process customers
        System.out.println("\nProcessing customers:");
        checkout.processNextCustomer(); // C001
        checkout.processNextCustomer(); // C002
        checkout.processNextCustomer(); // C003 (will fail due to Orange)

        // Display final state
        System.out.println("\nFinal state:");
        checkout.displayQueue();
        checkout.displayInventory();
    }
}