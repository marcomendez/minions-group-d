package test;

import org.junit.Test;
import treenary.TreeNary;

public class TreeNarioTest {

    @Test
    public void Test()
    {
        TreeNary treeNary = new TreeNary();

        treeNary.addRoot( "0");

        treeNary.add("0", "1");
        treeNary.add("0", "2");
        treeNary.add("0", "3");

        treeNary.add("1", "1.1");
        treeNary.add("1", "1.2");

        treeNary.add("2", "2.1");

        treeNary.add("3", "3.1");
        treeNary.add("3", "3.2");
        treeNary.add("3", "3.3");
        treeNary.add("3", "3.4");

        treeNary.add("0", "4");

        treeNary.print();
    }
}
