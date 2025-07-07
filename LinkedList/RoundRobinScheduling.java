class Process {
    int id, burst, priority, remaining;
    Process next;
    Process(int id, int burst, int priority) {
        this.id = id; this.burst = burst; this.priority = priority; this.remaining = burst;
    }
}

class Scheduler {
    Process head, current;
    int quantum;

    Scheduler(int quantum) {
        this.quantum = quantum;
    }

    void addProcess(int id, int burst, int priority) {
        Process p = new Process(id, burst, priority);
        if (head == null) { head = p; p.next = head; current = head; return; }
        Process temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = p;
        p.next = head;
    }

    void removeProcess(int id) {
        if (head == null) return;
        if (head.id == id && head.next == head) { head = null; current = null; return; }
        Process temp = head;
        if (head.id == id) {
            while (temp.next != head) temp = temp.next;
            temp.next = head.next;
            head = head.next;
            return;
        }
        while (temp.next != head && temp.next.id != id) temp = temp.next;
        if (temp.next.id == id) temp.next = temp.next.next;
    }

    void simulate() {
        int time = 0, count = 0, totalWaiting = 0, totalTurnaround = 0;
        Process temp = head;
        do { count++; temp = temp.next; } while (temp != head);
        while (head != null) {
            if (current.remaining <= quantum) {
                time += current.remaining;
                totalTurnaround += time;
                totalWaiting += time - current.burst;
                removeProcess(current.id);
                current = current == null ? null : current.next;
            } else {
                time += quantum;
                current.remaining -= quantum;
                current = current.next;
            }
            displayProcesses();
        }
        System.out.println("Average Waiting Time: " + (double) totalWaiting / count);
        System.out.println("Average Turnaround Time: " + (double) totalTurnaround / count);
    }

    void displayProcesses() {
        if (head == null) return;
        Process temp = head;
        do {
            System.out.println("Process " + temp.id + " Remaining: " + temp.remaining);
            temp = temp.next;
        } while (temp != head);
    }
}