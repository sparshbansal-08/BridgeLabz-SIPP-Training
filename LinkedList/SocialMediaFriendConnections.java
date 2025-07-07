import java.util.*;

class User {
    int id;
    String name;
    int age;
    List<Integer> friends;
    User next;
    User(int id, String name, int age) {
        this.id = id; this.name = name; this.age = age;
        friends = new ArrayList<>();
    }
}

class SocialNetwork {
    User head;

    void addUser(int id, String name, int age) {
        User u = new User(id, name, age);
        u.next = head;
        head = u;
    }

    User getUser(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    void addFriend(int id1, int id2) {
        User u1 = getUser(id1);
        User u2 = getUser(id2);
        if (u1 != null && u2 != null && !u1.friends.contains(id2)) {
            u1.friends.add(id2);
            u2.friends.add(id1);
        }
    }

    void removeFriend(int id1, int id2) {
        User u1 = getUser(id1);
        User u2 = getUser(id2);
        if (u1 != null && u2 != null) {
            u1.friends.remove(Integer.valueOf(id2));
            u2.friends.remove(Integer.valueOf(id1));
        }
    }

    void mutualFriends(int id1, int id2) {
        User u1 = getUser(id1);
        User u2 = getUser(id2);
        if (u1 != null && u2 != null) {
            Set<Integer> set = new HashSet<>(u1.friends);
            for (int f : u2.friends) {
                if (set.contains(f)) System.out.println("Mutual: " + f);
            }
        }
    }

    void displayFriends(int id) {
        User u = getUser(id);
        if (u != null) {
            for (int f : u.friends) System.out.println("Friend ID: " + f);
        }
    }

    void searchUser(String key) {
        User temp = head;
        while (temp != null) {
            if (String.valueOf(temp.id).equals(key) || temp.name.equals(key)) {
                System.out.println(temp.id + " " + temp.name);
            }
            temp = temp.next;
        }
    }

    void countFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friends.size() + " friends");
            temp = temp.next;
        }
    }
}