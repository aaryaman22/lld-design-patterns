package iteratorpattern;

// Aggregate interface
public interface BookCollection {

    Iterator<Book> createIterator();

    Iterator<Book> createReverseIterator();
}