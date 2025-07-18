import java.util.*;

// Attendee class with constructor overloading
class Attendee {
    private String name;
    private int age;
    private String email;

    // Constructor with email
    public Attendee(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Constructor without email
    public Attendee(String name, int age) {
        this(name, age, "N/A");
    }

    public String getName() {
        return name;
    }

    // Override toString() for clean output
    @Override
    public String toString() {
        return name + " (Age: " + age + ", Email: " + email + ")";
    }
}

// Ticketing system class
class EventTicketingSystem {
    private HashMap<String, Queue<Attendee>> eventMap;

    public EventTicketingSystem() {
        eventMap = new HashMap<>();
    }

    // Add a booking to an event
    public void bookTicket(String eventName, Attendee attendee) {
        eventMap.putIfAbsent(eventName, new LinkedList<>());
        eventMap.get(eventName).add(attendee);
        System.out.println(attendee.getName() + " booked for " + eventName);
    }

    // Show all attendees for an event
    public void showAttendees(String eventName) {
        if (!eventMap.containsKey(eventName)) {
            System.out.println("No such event found.");
            return;
        }

        Queue<Attendee> queue = eventMap.get(eventName);
        System.out.println("\nAttendees for event: " + eventName);
        for (Attendee a : queue) {
            System.out.println("- " + a);
        }
    }

    // Get position in the queue (linear search)
    public void getPosition(String eventName, String attendeeName) {
        if (!eventMap.containsKey(eventName)) {
            System.out.println("Event not found.");
            return;
        }

        Queue<Attendee> queue = eventMap.get(eventName);
        int position = 1;
        for (Attendee a : queue) {
            if (a.getName().equalsIgnoreCase(attendeeName)) {
                System.out.println(attendeeName + " is at position " + position + " in " + eventName + " queue.");
                return;
            }
            position++;
        }
        System.out.println(attendeeName + " not found in " + eventName + " queue.");
    }
}

// Main class
public class TicketingApp {
    public static void main(String[] args) {
        EventTicketingSystem system = new EventTicketingSystem();

        // Bookings
        system.bookTicket("Rock Concert", new Attendee("Sparsh", 22, "sparsh@example.com"));
        system.bookTicket("Rock Concert", new Attendee("Shatakshi", 20));
        system.bookTicket("Rock Concert", new Attendee("Aryan", 25, "aryan@mail.com"));

        system.bookTicket("Drama Play", new Attendee("Riya", 21));
        system.bookTicket("Drama Play", new Attendee("Rohan", 23, "rohan@gmail.com"));

        // Show attendees
        system.showAttendees("Rock Concert");
        system.showAttendees("Drama Play");

        // Position lookup
        System.out.println();
        system.getPosition("Rock Concert", "Shatakshi");
        system.getPosition("Drama Play", "Riya");
        system.getPosition("Drama Play", "SomeoneNotHere");
    }
}
