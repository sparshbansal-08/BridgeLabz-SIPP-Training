// Interface for event management by Admin
interface EventManager {
    void addEvent(Event event);
    void removeEvent(String eventId);
}

// Event class
class Event {
    private String eventId;
    private String eventName;

    public Event(String eventId, String eventName) {
        this.eventId = eventId;
        this.eventName = eventName;
    }

    public String getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public Ticket registerUser(User user) {
        System.out.println(user.getName() + " registered for " + eventName);
        return new Ticket(user, this); // Object interaction
    }
}

// Ticket class
class Ticket {
    private User user;
    private Event event;

    // Parameterized constructor
    public Ticket(User user, Event event) {
        this.user = user;
        this.event = event;
        System.out.println("Ticket generated for " + user.getName() + " to attend " + event.getEventName());
    }

    public void printTicketDetails() {
        System.out.println("Ticket: " + user.getName() + " → " + event.getEventName());
    }
}

// User class
class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Ticket registerForEvent(Event event) {
        return event.registerUser(this); // Sequence: User → Event → Ticket
    }

    public String getName() {
        return name;
    }
}

// Admin class implements EventManager interface
class Admin implements EventManager {
    @Override
    public void addEvent(Event event) {
        System.out.println("Event added: " + event.getEventName());
    }

    @Override
    public void removeEvent(String eventId) {
        System.out.println("Event removed: ID = " + eventId);
    }
}

// Main class
public class EventHiveApp {
    public static void main(String[] args) {
        Admin admin = new Admin();

        Event event1 = new Event("EV001", "TechTalk 2025");
        admin.addEvent(event1);

        User user1 = new User("Sparsh", "sparsh@example.com");
        Ticket ticket = user1.registerForEvent(event1);

        System.out.println();
        ticket.printTicketDetails();

        admin.removeEvent("EV001");
    }
}
