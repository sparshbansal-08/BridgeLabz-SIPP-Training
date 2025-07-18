import java.util.LinkedList;
import java.util.Scanner;

// Abstract Task class
abstract class Task {
    protected String title;
    protected String time;

    public Task(String title, String time) {
        this.title = title;
        this.time = time;
    }

    public abstract void execute();

    public String getTitle() {
        return title;
    }
}

// Meeting subclass
class Meeting extends Task {
    public Meeting(String title, String time) {
        super(title, time);
    }

    @Override
    public void execute() {
        System.out.println("Attend meeting: " + title + " at " + time);
    }
}

// Workout subclass
class Workout extends Task {
    public Workout(String title, String time) {
        super(title, time);
    }

    @Override
    public void execute() {
        System.out.println("Workout session: " + title + " at " + time);
    }
}

// CodingSession subclass
class CodingSession extends Task {
    public CodingSession(String title, String time) {
        super(title, time);
    }

    @Override
    public void execute() {
        System.out.println("Coding session: " + title + " at " + time);
    }
}

// Planner application
public class DailyTaskPlanner {
    private LinkedList<Task> taskList = new LinkedList<>();

    // Add task to the list
    public void addTask(Task task) {
        taskList.add(task);
    }

    // Linear Search for a task by keyword
    public void searchTask(String keyword) {
        boolean found = false;
        for (Task task : taskList) {
            if (task.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Found task: " + task.getTitle());
                task.execute();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No task found with keyword: " + keyword);
        }
    }

    // Execute all tasks
    public void executeAll() {
        for (Task task : taskList) {
            task.execute();
        }
    }

    // Main method
    public static void main(String[] args) {
        DailyTaskPlanner planner = new DailyTaskPlanner();

        // Adding tasks
        planner.addTask(new Meeting("Project Review", "10:00 AM"));
        planner.addTask(new Workout("Morning Cardio", "7:00 AM"));
        planner.addTask(new CodingSession("Build Java Project", "2:00 PM"));

        System.out.println("=== All Tasks ===");
        planner.executeAll();

        // Search
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nSearch for a task by keyword: ");
        String keyword = scanner.nextLine();
        planner.searchTask(keyword);

        scanner.close();
    }
}
