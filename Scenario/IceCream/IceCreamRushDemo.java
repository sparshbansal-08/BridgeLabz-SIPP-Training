import java.util.*;

class Flavor {
    String name;
    int salesCount;

    public Flavor(String name, int salesCount) {
        this.name = name;
        this.salesCount = salesCount;
    }

    @Override
    public String toString() {
        return name + " (" + salesCount + " sold)";
    }
}

class IceCreamRush {
    private Flavor[] flavors;

    public IceCreamRush(Flavor[] flavors) {
        this.flavors = flavors;
    }

    // Bubble Sort to sort flavors by sales count (descending)
    public void sortFlavorsByPopularity() {
        int n = flavors.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent flavors and swap if left flavor has fewer sales
                if (flavors[j].salesCount < flavors[j + 1].salesCount) {
                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }

    // Display sorted flavors
    public void displayFlavors() {
        System.out.println("Flavors sorted by popularity:");
        for (Flavor flavor : flavors) {
            System.out.println("  " + flavor);
        }
    }
}

public class IceCreamRushDemo {
    public static void main(String[] args) {
        // Initialize 8 ice cream flavors with their weekly sales
        Flavor[] flavors = {
            new Flavor("Vanilla", 45),
            new Flavor("Chocolate", 60),
            new Flavor("Strawberry", 30),
            new Flavor("Mint Chip", 25),
            new Flavor("Cookie Dough", 50),
            new Flavor("Mango", 20),
            new Flavor("Pistachio", 15),
            new Flavor("Caramel Swirl", 35)
        };

        IceCreamRush shop = new IceCreamRush(flavors);

        // Display unsorted flavors
        System.out.println("Flavors before sorting:");
        for (Flavor flavor : flavors) {
            System.out.println("  " + flavor);
        }

        // Sort flavors using Bubble Sort
        shop.sortFlavorsByPopularity();

        // Display sorted flavors
        System.out.println("\nAfter sorting:");
        shop.displayFlavors();
    }
}