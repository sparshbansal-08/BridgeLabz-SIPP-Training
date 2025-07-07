class Task {
    int id;
    String name;
    int priority;
    String dueDate;
    Task next;
    Task(int id, String name, int priority, String dueDate) {
        this.id = id; this.name = name; this.priority = priority; this.dueDate = dueDate;
    }
}

class TaskScheduler {
    Task head = null;

    void addAtEnd(int id, String name, int priority, String dueDate) {
        Task t = new Task(id, name, priority, dueDate);
        if (head == null) { head = t; head.next = head; return; }
        Task temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = t; t.next = head;
    }

    void addAtBeginning(int id, String name, int priority, String dueDate) {
        Task t = new Task(id, name, priority, dueDate);
        if (head == null) { head = t; head.next = head; return; }
        Task temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = t; t.next = head; head = t;
    }

    void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos <= 0 || head == null) { addAtBeginning(id, name, priority, dueDate); return; }
        Task temp = head;
        for (int i = 1; i < pos && temp.next != head; i++) temp = temp.next;
        Task t = new Task(id, name, priority, dueDate);
        t.next = temp.next;
        temp.next = t;
    }

    void deleteById(int id) {
        if (head == null) return;
        if (head.id == id && head.next == head) { head = null; return; }
        Task curr = head, prev = null;
        do {
            if (curr.id == id) {
                if (curr == head) {
                    Task temp = head;
                    while (temp.next != head) temp = temp.next;
                    head = head.next;
                    temp.next = head;
                } else prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    Task current = null;

    void viewCurrentAndMoveNext() {
        if (current == null) current = head;
        if (current != null) {
            System.out.println(current.id + " " + current.name);
            current = current.next;
        }
    }

    void displayAll() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == priority) System.out.println(temp.name);
            temp = temp.next;
        } while (temp != head);
    }
}