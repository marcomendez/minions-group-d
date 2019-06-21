package test;

import org.junit.Before;
import org.junit.Test;
import trees.CustomTree;

/**
 * Created by Marco Mendez.
 */
public class TreeTest {

    private CustomTree customTree;

    @Before
    public void ini() {
        customTree = new CustomTree();
    }

     @Test
    public void addTest() {
        customTree.add(1);
        customTree.add(2);
        customTree.add(3);
        customTree.add(4);

        customTree.delete(3);
        customTree.print();
    }
}
