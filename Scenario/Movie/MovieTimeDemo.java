import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

class Show {
    String movieName;
    LocalTime showTime;

    public Show(String movieName, LocalTime showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return movieName + " at " + showTime.format(formatter);
    }
}

class MovieTime {
    private ArrayList<Show> shows;

    public MovieTime() {
        shows = new ArrayList<>();
    }

    // Insert a new show using Insertion Sort
    public void addShow(String movieName, LocalTime showTime) {
        Show newShow = new Show(movieName, showTime);
        int i = shows.size() - 1;

        // Add to the end first
        shows.add(newShow);

        // Shift elements to maintain sorted order
        while (i >= 0 && shows.get(i).showTime.isAfter(showTime)) {
            shows.set(i + 1, shows.get(i));
            i--;
        }
        shows.set(i + 1, newShow);

        System.out.println("Added: " + newShow);
    }

    // Display all shows
    public void displayShows() {
        if (shows.isEmpty()) {
            System.out.println("No shows scheduled!");
            return;
        }
        System.out.println("Upcoming shows:");
        for (Show show : shows) {
            System.out.println("  " + show);
        }
    }
}

public class MovieTimeDemo {
    public static void main(String[] args) {
        MovieTime theater = new MovieTime();

        // Add shows with different times
        theater.addShow("Avengers", LocalTime.of(10, 30));
        theater.addShow("Inception", LocalTime.of(12, 15));
        theater.addShow("Titanic", LocalTime.of(9, 45));
        theater.addShow("Matrix", LocalTime.of(11, 0));
        theater.addShow("Interstellar", LocalTime.of(14, 30));

        // Display sorted shows
        theater.displayShows();
    }
}