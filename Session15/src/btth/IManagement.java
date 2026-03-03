package btth;

public interface IManagement<T> {

    void add(T obj);

    void display();

    T search(String keyword);

    void sort();
}