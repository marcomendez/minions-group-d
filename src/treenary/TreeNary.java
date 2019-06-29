/***
 * Created by Marco Mendez.
 */
public class TreeNary {

    private NodeNary root;

    /**
     * Adds value to root.
     *
     * @param value - value to set root.
     */
    public void addRoot(String value) {
        root = new NodeNary(value);
    }

    /**
     * Adds new value to node existing.
     *
     * @param father - node existing.
     * @param value  -  value to add to node existing.
     */
    public void add(String father, String value) {
        addRecursive(root, father, value);
    }

    /**
     * Recursive Add node.
     *
     * @param customRoot - root.
     * @param father     - father value.
     * @param value      - new value to add to father.
     */
    private void addRecursive(NodeNary customRoot, String father, String value) {
        NodeNary newNode = new NodeNary(value);
        if (father == customRoot.value) {
            customRoot.Children.add(newNode);
            return;
        }
        for (NodeNary node : customRoot.Children) {
            if (node.value == value) {
                node.Children.add(newNode);
                continue;
            }
            addRecursive(node, father, value);
        }
    }

    /**
     * Prints all the values.
     */
    public void print() {
        print(root);
    }

    /**
     * Prints all the values
     *
     * @param customRoot - root from start the tree.
     */
    private void print(NodeNary customRoot) {
        System.out.print(customRoot.value + " , ");
        for (NodeNary node : customRoot.Children) {
            print(node);
        }
    }
}
