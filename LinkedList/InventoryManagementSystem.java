class Item {
    String name;
    int id;
    int quantity;
    double price;
    Item next;
    Item(String name, int id, int quantity, double price) {
        this.name = name; this.id = id; this.quantity = quantity; this.price = price;
    }
}

class Inventory {
    Item head;

    void addAtBeginning(String name, int id, int quantity, double price) {
        Item i = new Item(name, id, quantity, price);
        i.next = head;
        head = i;
    }

    void addAtEnd(String name, int id, int quantity, double price) {
        Item i = new Item(name, id, quantity, price);
        if (head == null) { head = i; return; }
        Item temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = i;
    }

    void addAtPosition(int pos, String name, int id, int quantity, double price) {
        if (pos <= 0 || head == null) { addAtBeginning(name, id, quantity, price); return; }
        Item temp = head;
        for (int i = 1; i < pos && temp.next != null; i++) temp = temp.next;
        Item it = new Item(name, id, quantity, price);
        it.next = temp.next;
        temp.next = it;
    }

    void deleteById(int id) {
        if (head == null) return;
        if (head.id == id) { head = head.next; return; }
        Item temp = head;
        while (temp.next != null && temp.next.id != id) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    void updateQuantity(int id, int qty) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) { temp.quantity = qty; return; }
            temp = temp.next;
        }
    }

    void searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) System.out.println(temp.name);
            temp = temp.next;
        }
    }

    void searchByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) System.out.println(temp.id);
            temp = temp.next;
        }
    }

    void calculateTotalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    void displayAll() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.name + " " + temp.id + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }
}
