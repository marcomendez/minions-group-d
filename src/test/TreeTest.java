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
        customTree.add(50);
        customTree.add(40);
        customTree.add(80);
        customTree.add(60);
        customTree.print();
    }
}
