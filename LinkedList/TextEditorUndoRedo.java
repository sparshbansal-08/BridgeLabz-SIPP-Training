class TextState {
    String content;
    TextState prev, next;
    TextState(String content) {
        this.content = content;
    }
}

class TextEditor {
    TextState current;
    int size = 0;

    void addState(String content) {
        TextState state = new TextState(content);
        if (current != null) {
            current.next = state;
            state.prev = current;
        }
        current = state;
        while (current.prev != null && size >= 10) {
            current.prev.prev = null;
            current.prev = current.prev.prev;
            size--;
        }
        size++;
    }

    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    void displayCurrent() {
        if (current != null) {
            System.out.println(current.content);
        }
    }
}
