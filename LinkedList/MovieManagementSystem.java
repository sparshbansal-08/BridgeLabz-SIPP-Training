class Movie {
    String title, director;
    int year;
    double rating;
    Movie prev, next;
    Movie(String title, String director, int year, double rating) {
        this.title = title; this.director = director;
        this.year = year; this.rating = rating;
    }
}

class MovieList {
    Movie head, tail;

    void addAtBeginning(String title, String dir, int year, double rating) {
        Movie m = new Movie(title, dir, year, rating);
        if (head == null) { head = tail = m; return; }
        m.next = head;
        head.prev = m;
        head = m;
    }

    void addAtEnd(String title, String dir, int year, double rating) {
        Movie m = new Movie(title, dir, year, rating);
        if (head == null) { head = tail = m; return; }
        tail.next = m; m.prev = tail; tail = m;
    }

    void addAtPosition(int pos, String title, String dir, int year, double rating) {
        if (pos <= 0 || head == null) {
            addAtBeginning(title, dir, year, rating);
            return;
        }
        Movie temp = head;
        for (int i = 1; i < pos && temp.next != null; i++) temp = temp.next;
        Movie m = new Movie(title, dir, year, rating);
        m.next = temp.next;
        m.prev = temp;
        if (temp.next != null) temp.next.prev = m;
        temp.next = m;
        if (m.next == null) tail = m;
    }

    void removeByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    void searchByDirector(String dir) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equals(dir)) System.out.println(temp.title);
            temp = temp.next;
        }
    }

    void searchByRating(double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.rating == rating) System.out.println(temp.title);
            temp = temp.next;
        }
    }

    void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) { temp.rating = newRating; return; }
            temp = temp.next;
        }
    }

    void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " by " + temp.director);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " by " + temp.director);
            temp = temp.prev;
        }
    }
}
