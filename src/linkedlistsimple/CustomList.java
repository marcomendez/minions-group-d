package linkedlistsimple;

import interfaces.IList;

/**
 * Created By Marco Mendez
 */
public class CustomList<T> implements IList {

    private Node head;
    private Node tail;
    private int size = 0;

    /**
     * Gets CustomList size.
     * @return integer with CustomList size.
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * Adds in first position.
     * @param value value to node add.
     */
    @Override
    public void addFirst(Object value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }

    /**
     * Adds in next position.
     * @param value value to node add.
     */
    @Override
    public void add(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    /**
     * Adds in Tail position.
     * @param value value to node value.
     */
    @Override
    public void addLast(Object value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    /**
     * Adds in index position.
     * @param index position
     * @param value node value.
     */
    @Override
    public void add(int index, Object value) {
        Node newNode = new Node(value);
        Node current = this.head;
        if (this.head != null && index <= this.size) {
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            this.size += 1;
        } else {
            System.out.println("Exceeded the linked list size. Current Size:");
        }
    }

    /**
     * Removes node in position.
     * @param index position.
     */
    @Override
    public void remove(int index) {
        if (index == 1) {
            removeFirst();
            return;
        }
        if (index <= this.size && this.head != null) {
            Node currentNode = this.head;
            Node prevNode = null;
            for (int i = 1; i < index; i++) {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            prevNode.next = currentNode.next;
            this.size--;
        } else {
            System.out.println(String.format("No node exist at location %s: ", index));
        }
    }

    /**
     * Removes first node.
     */
    @Override
    public void removeFirst() {
        if (head != null) {
            this.head = this.head.next;
            this.size--;
        } else {
            System.out.println("Linked list is empty");
        }
    }

    /**
     * Removes Last Node.
     */
    @Override
    public void removeLast() {
        Node currentNode = this.head;
        if (size == 1) {
            head = null;
            size = 0;
        } else {
            Node prevNode = null;
            while (currentNode.next != null) {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            prevNode.next = null;
            this.size--;
        }
    }

    /**
     * Prints all custom list nodes.
     */
    @Override
    public void printList() {
        if (this.size < 1)
            System.out.println("There are no nodes in the linked list.");
        else {
            Node current = this.head;
            for (int index = 1; index <= this.size; index++) {
                System.out.println(String.format("Node %s%s%S", current.getValue(), " is at location ", index));
                current = current.next;
            }
        }
    }

    /**
     * Gets node value.
     * @param index position.
     * @return Node value.
     */
    @Override
    public Object getValue(int index) {
        Object result = null;
        if (index <= this.size && this.head != null) {
            Node currentNode = this.head;
            for (int i = 1; i <= index; i++) {
                result = currentNode.getValue();
                currentNode = currentNode.next;
            }
            this.size--;
        } else {
            System.out.println(String.format("No node exist at location %s: ", index));
        }
        return result;
    }
}
