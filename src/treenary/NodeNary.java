package treenary;

import java.util.ArrayList;
import java.util.List;

/***
 * Created By Marco Mendez.
 */
public class NodeNary {

    public String value;
    public List<NodeNary> Children;

    /**
     * Constructor.
     * @param value - value.
     */
    public NodeNary(String value) {
        this.value = value;
        Children = new ArrayList<>();
    }
}
