package trees;

import interfaces.ITree;

/**
 * Created by Marco Mendez.
 *
 * @param <T>
 */
public class CustomTree<T> implements ITree {

    private Node root;

    /**
     * Adds Recursive node.
     *
     * @param newNode    - new Node to add.
     * @param customRoot - CustomRoot.
     */
    private void addRecursive(Node newNode, Node customRoot) {
        if (customRoot == null) {
            this.root = newNode;
        } else {
            if (newNode.value <= customRoot.value) {
                addLeft(newNode, customRoot);
            } else {
                addRight(newNode, customRoot);
            }
        }
    }

    /**
     * Adds Node to left.
     *
     * @param newNode    - new Node to add.
     * @param customRoot - customNode.
     */
    private void addLeft(Node newNode, Node customRoot) {
        if (customRoot.left == null) {
            customRoot.left = newNode;
        } else {
            addRecursive(newNode, customRoot.left);
        }
    }

    /**
     * Adds Node to left.
     *
     * @param newNode    - new Node to add.
     * @param customRoot - customNode.
     */
    private void addRight(Node newNode, Node customRoot) {
        if (customRoot.right == null) {
            customRoot.right = newNode;
        } else {
            addRecursive(newNode, customRoot.right);
        }
    }

    /**
     * @param customRoot
     */
    public void preOrder(Node customRoot) {
        if (customRoot != null) {
            System.out.printf("%d ", customRoot.value);
            preOrder(customRoot.left);
            preOrder(customRoot.right);

        }
    }

    /**
     * Print tree values.
     */
    public void print() {
        preOrder(root);
    }

    /**
     * Adds new value to tree.
     *
     * @param value value to add.
     */
    @Override
    public void add(int value) {
        Node newNode = new Node(value);
        addRecursive(newNode, this.root);
    }
}
