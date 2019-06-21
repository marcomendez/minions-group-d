package trees;

/**
 * Created By Marco Mendez.
 *
 */
public class Node {

    public int value;
    public int fe;
    public Node left;
    public Node right;

    /**
     * Constructor.
     * @param value - value to add.
     */
    public Node(int value) {
        this.value = value;
        right = null;
        left = null;
        fe = 1;
    }
}
