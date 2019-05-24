package test;

import interfaces.IStack;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import stacks.Stack;

public class StackTest {

    private IStack<Integer> stack;

    @Before
    public void ini() {
        stack = new Stack<Integer>();
    }

    @Test
    public void pushTest() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int actualResult = stack.getSize();
        int expectResult = 3;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void peekTest() {
        stack.push(1);
        stack.push(2);
        stack.push(4);
        int actualResult = stack.peek();
        int expectResult = 4;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void popTest() {
        stack.push(1);
        stack.push(2);
        stack.push(4);
        int actualResult = stack.pop();
        int expectResult = 4;
        Assert.assertEquals(actualResult, expectResult);
    }
}
