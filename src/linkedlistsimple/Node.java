package linkedlistsimple;

/**
 * Create by Marco Mendez.
 * Date: 05/07/2019
 */
public class Node<T>{

    private T value;
    public Node next;

    /**
     * Constructor of Node.
     * @param value
     */
    public Node(T value) {
        this.value = value;
        next = null;
    }

    /**
     * Gets Node value.
     * @return node value.
     */
    public T getValue()
    {
        return value;
    }
}
