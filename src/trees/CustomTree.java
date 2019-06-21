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

        if (getFE(root.left) - getFE(root.right) == -2) {
            customRoot = rotateLeft(customRoot);
            addRecursive(newNode, customRoot);
        } else {
            if (getFE(root.left) - getFE(root.right) == 2) {
                customRoot = rotateRight(customRoot);
                addRecursive(newNode, customRoot);
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

    public void deleteNode(Node node, int value) {
        if (root.value >= node.value) {
            deleteNode(root.left, value);
        } else if (root.value < node.value)
            deleteNode(root.right, value);

        else {
            if ((node.left == null) || (node.right == null)) {
                Node temp = null;
                if (temp == root.left) {
                    temp = root.right;
                } else {
                    temp = root.left;
                }
                if (temp == null) {
                    temp = root;
                    root = null;
                } else
                    root = temp;
            } else {
                Node temp = minValueNode(node.right);
                node.value = temp.value;
                deleteNode(root.right, temp.value);
            }
        }
    }

    private Node minValueNode(Node node) {
        Node current = node;

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    private int getFE(Node current) {
        if (current == null) {
            return 0;
        } else {
            return current.fe;
        }
    }

    public Node rotateRight(Node current) {
        Node aux = current.right;
        current.right = aux.left;
        aux.left = current;
        current.fe = Math.max(getFE(current.left), getFE(current.right)) + 1;
        aux.fe = Math.max(getFE(aux.left), getFE(aux.right)) + 1;

        return aux;
    }

    public Node rotateLeft(Node current) {
        Node aux = current.left;
        current.left = aux.right;
        aux.right = current;
        current.fe = Math.max(getFE(current.left), getFE(current.right)) + 1;
        aux.fe = Math.max(getFE(aux.left), getFE(aux.right)) + 1;
        return aux;
    }

    public void delete(int value) {
        this.deleteNode(this.root, value);
    }
}
