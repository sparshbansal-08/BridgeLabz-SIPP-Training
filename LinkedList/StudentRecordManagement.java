class Student {
    int roll;
    String name;
    int age;
    String grade;
    Student next;
    Student(int roll, String name, int age, String grade) {
        this.roll = roll; this.name = name; this.age = age; this.grade = grade;
    }
}

class StudentList {
    Student head;

    void addAtBeginning(int roll, String name, int age, String grade) {
        Student s = new Student(roll, name, age, grade);
        s.next = head;
        head = s;
    }

    void addAtEnd(int roll, String name, int age, String grade) {
        Student s = new Student(roll, name, age, grade);
        if (head == null) { head = s; return; }
        Student temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = s;
    }

    void addAtPosition(int pos, int roll, String name, int age, String grade) {
        if (pos <= 0 || head == null) { addAtBeginning(roll, name, age, grade); return; }
        Student temp = head;
        for (int i = 1; i < pos && temp.next != null; i++) temp = temp.next;
        Student s = new Student(roll, name, age, grade);
        s.next = temp.next;
        temp.next = s;
    }

    void deleteByRoll(int roll) {
        if (head == null) return;
        if (head.roll == roll) { head = head.next; return; }
        Student temp = head;
        while (temp.next != null && temp.next.roll != roll) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    Student searchByRoll(int roll) {
        Student temp = head;
        while (temp != null) {
            if (temp.roll == roll) return temp;
            temp = temp.next;
        }
        return null;
    }

    void updateGrade(int roll, String grade) {
        Student s = searchByRoll(roll);
        if (s != null) s.grade = grade;
    }

    void displayAll() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }
}