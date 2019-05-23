package interfaces;

/**
 * Created By Marco Mendez.
 */
public interface IList<T> {
    void addFirst(T value);
    void add(T value);
    void addLast(T value);
    void add(int index, T value);
    void printList();
    void remove(int index);
    void removeFirst();
    void removeLast();
    T getValue(int index);
    int getSize();
}
