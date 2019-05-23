package queues;

import interfaces.IQueuse;
import linkedlistsimple.CustomList;
import interfaces.IList;

public class Queue<T> implements IQueuse {

    private IList<T> queue;

    /**
     * Constructor.
     */
    public Queue() {
        queue = new CustomList<T>();
    }

    /**
     * Adds a new element.
     * @param value value to add.
     */
    @Override
    public void add(Object value) {
        queue.add((T) value);
    }

    /**
     * Get the first value.
     * @return first value.
     */
    @Override
    public Object peek() {
        return queue.getValue(1);
    }

    /**
     * Removes the first value.
     */
    @Override
    public void remove() {
        queue.removeFirst();
    }

    /**
     * Gets size of queue.
     * @return
     */
    @Override
    public int getSize() {
        return queue.getSize();
    }

    /**
     * Prints all the Queue.
     */
    @Override
    public void print() {
        queue.printList();
    }
}
