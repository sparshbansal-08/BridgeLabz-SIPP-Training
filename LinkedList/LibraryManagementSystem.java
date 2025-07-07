class Book {
    String title, author, genre;
    int id;
    boolean available;
    Book prev, next;
    Book(String title, String author, String genre, int id, boolean available) {
        this.title = title; this.author = author; this.genre = genre;
        this.id = id; this.available = available;
    }
}

class Library {
    Book head, tail;

    void addAtBeginning(String title, String author, String genre, int id, boolean available) {
        Book b = new Book(title, author, genre, id, available);
        if (head == null) { head = tail = b; return; }
        b.next = head;
        head.prev = b;
        head = b;
    }

    void addAtEnd(String title, String author, String genre, int id, boolean available) {
        Book b = new Book(title, author, genre, id, available);
        if (head == null) { head = tail = b; return; }
        tail.next = b;
        b.prev = tail;
        tail = b;
    }

    void addAtPosition(int pos, String title, String author, String genre, int id, boolean available) {
        if (pos <= 0 || head == null) { addAtBeginning(title, author, genre, id, available); return; }
        Book temp = head;
        for (int i = 1; i < pos && temp.next != null; i++) temp = temp.next;
        Book b = new Book(title, author, genre, id, available);
        b.next = temp.next;
        b.prev = temp;
        if (temp.next != null) temp.next.prev = b;
        temp.next = b;
        if (b.next == null) tail = b;
    }

    void removeById(int id) {
        Book temp = head;
        while (temp != null) {
            if (temp.id == id) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    void searchByTitleOrAuthor(String key) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equals(key) || temp.author.equals(key)) {
                System.out.println(temp.title + " by " + temp.author);
            }
            temp = temp.next;
        }
    }

    void updateAvailability(int id, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.id == id) { temp.available = status; return; }
            temp = temp.next;
        }
    }

    void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.author + " " + temp.available);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.author + " " + temp.available);
            temp = temp.prev;
        }
    }

    void countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total books: " + count);
    }
}