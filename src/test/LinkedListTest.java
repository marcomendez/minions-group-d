package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import simple.CustomList;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LinkedListTest {

    private CustomList customList;

    @Before
    public void ini() {
        customList = new CustomList();
    }

    @Test
    public void addTest() {
        customList.add(2);
        customList.add(3);
        customList.add(4);
        int actualResult = customList.getSize();
        int expectResult = 3;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void addInPositionTest() {
        customList.add(2);
        customList.add(3);
        customList.add(5);
        customList.add(2, 4);
        int actualResult = customList.getSize();
        int expectResult = 4;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void addFistTest() {
        customList.add(2);
        customList.add(3);
        customList.add(4);
        customList.addFirst(1);
        int actualResult = customList.getSize();
        int expectResult = 4;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void removeTest() {
        customList.add(2);
        customList.add(3);
        customList.add(4);
        customList.remove(1);
        int actualResult = customList.getSize();
        int expectResult = 2;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void removeFirstTest() {
        customList.add(2);
        customList.add(3);
        customList.add(4);
        customList.removeFirst();
        int actualResult = customList.getSize();
        int expectResult = 2;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void removeLastTest() {
        customList.add(2);
        customList.add(3);
        customList.add(4);
        customList.removeLast();
        int actualResult = customList.getSize();
        int expectResult = 2;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void getValueTest() {
        customList.add(2);
        customList.add(3);
        customList.add(4);
        customList.removeLast();
        int actualResult = customList.getValue(2);
        int expectResult = 3;
        Assert.assertEquals(actualResult, expectResult);
    }
}
