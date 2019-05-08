package simple;

public class CustomList implements IList {

    private Node head;
    private Node tail;

    @Override
    public void addStart(int value) {

    }

    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    @Override
    public void addEnd(int value) {

    }

    @Override
    public void add(int index, int value) {

    }

    @Override
    public void printList() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void remove(int index) {

    }
}
