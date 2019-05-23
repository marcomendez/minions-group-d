package interfaces;

public interface IQueuse<T> {
    void add(T value);
    T peek();
    void remove();
    int getSize();
    void print();
}
