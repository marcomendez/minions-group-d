package simple;

/**
 * Created By Marco Mendez.
 */
public interface IList {

    void addFirst(int value);
    void add(int value);
    void addLast(int value);
    void add(int index, int value);
    void printList();
    void remove(int index);
    void removeFirst();
    void removeLast();
    int getValue(int index);
    int getSize();
}
