package simple;

public interface IList {

    void addStart(int value);
    void add(int value);
    void addEnd(int value);
    void add(int index, int value);
    void printList();
    void remove();
    void remove(int index);
}
