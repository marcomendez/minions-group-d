package simple;

/**
 * Create by Marco Mendez.
 * Date: 05/07/2019
 */
public class Node {

    private int value;
    public Node next;

    /**
     * Constructor of Node.
     * @param value
     */
    public Node(int value) {
        this.value = value;
        next = null;
    }

    /**
     * Gets Node value.
     * @return node value.
     */
    public int getValue()
    {
        return value;
    }
}
