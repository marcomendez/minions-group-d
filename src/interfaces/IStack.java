package interfaces;

public interface IStack<T> {
    T pop();
    void push(T value);
    T peek();
    int getSize();
    void print();
}
