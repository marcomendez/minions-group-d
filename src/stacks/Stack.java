package stacks;

import interfaces.IList;
import interfaces.IStack;
import linkedlistsimple.CustomList;

public class Stack<T> implements IStack {

    private IList<T> stack ;

    /**
     * Constructor.
     */
    public Stack()
    {
        stack = new CustomList<>();
    }

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @return Top value;
     */
    @Override
    public Object pop() {
        Object value =  stack.getValue(stack.getSize());
        stack.removeLast();
        return value;
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     * @return Top value.
     */
    @Override
    public Object peek() {
        return stack.getValue(stack.getSize());
    }

    /**
     * Get size.
     * @return int with size.
     */
    @Override
    public int getSize() {
        return stack.getSize();
    }

    /**
     * print stack values.
     */
    @Override
    public void print() {
        stack.printList();
    }

    /**
     * Pushes an item into the top of this stack.
     * @param value value to add.
     */
    @Override
    public void push(Object value) {
        stack.add((T) value);
    }

}
