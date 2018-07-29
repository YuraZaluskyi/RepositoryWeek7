package myLinkedList;


public class MyLinkedList<T> {

    private Node<T> first;
    private Node<T> last;

    int size;

    private class Node<T> {
        Node<T> next;
        Node<T> previous;
        T value;

        public Node() {
        }

        public Node(Node<T> next, Node<T> previous, T value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }
    }

//    Methods____________________________________________________________________________________________________

    //   1. Add to linkedList
    public void add(T value) {
        if (size == 0) {
            Node<T> tNode = new Node<>(null, null, value);
            first = tNode;
            last = tNode;
            size++;
            return;
        }

        Node<T> tNode = new Node<>(null, last, value);
        last.next = tNode;
        last = tNode;
        size++;
    }

    //    2. add en element prepend to linkedList
    public void addPrepend(T value) {
        if (size == 0) {
            Node<T> tNode = new Node<>(null, null, value);
            first = tNode;
            last = tNode;
            size++;
            return;
        }

        Node<T> tNode = new Node<>(first, null, value);
        first.previous = tNode;
        first = tNode;
        size++;
    }

    //    3. toString linkedList
    public String toStringLinkedList() {
        Node<T> temp = first;
        StringBuilder b = new StringBuilder();
        b.append("[ ");
        while (temp.next != null) {
            b.append(String.valueOf(temp.value));
            temp = temp.next;
            b.append(" ");
        }
        b.append(String.valueOf(last.value));
        return b.append(" ]").toString();
    }

    //    4. get an element from linkedList by index
    public T getIndex(int index) {
        int i = 0;
        Node<T> temp = first;
        while (i != index) {
            temp = temp.next;
            i++;
        }
        return temp.value;
    }

    //    5. add an element to linkedList by index
    public void addByIndex(int index, T value) {
        if (size == 0) {
            Node<T> tNode = new Node<>(null, null, value);
            first = tNode;
            last = tNode;
            size++;
            return;
        }
        Node<T> temp = first;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        Node<T> after = temp.next;
        Node<T> tNode = new Node<>(null, null, value);
        tNode.next = after;
        tNode.previous = temp;
        temp.next = tNode;
        size++;
    }

    //    6. set an element to linkedList by index
    public void setByIndex(int index, T value) {
        Node<T> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.value = value;
    }

    //    7. remove by index from linkedList
    public void removeByIndex(int index) {
        Node<T> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node<T> after = temp.next;
        Node<T> anterior = temp.previous;
        anterior.next = after;
        after.previous = anterior;
        size--;
    }

    //    8. remove by value from linkedList
    public void removeByValue(T value) {
        Node<T> temp = first;
        for (int i = 0; i < size; i++) {
            if (temp.value.equals(value)) {
                removeByIndex(i);
                break;
            }
            temp = temp.next;
        }
    }

    //    9. remove an element from start of the linkedList
    public void removeFromStart() {
        first = first.next;
        first.previous = null;
    }

    //    10. remove an element from end of the linkedList
    public void removeFromEnd() {
        last = last.previous;
        last.next = null;
    }

}
