package iteratorpattern;

import java.util.List;

// Concrete Iterator - Reverse
public class ReverseLibraryIterator implements Iterator<Book> {

    private final List<Book> books;

    private int position;

    public ReverseLibraryIterator(List<Book> books) {
        this.books = books;
        this.position = books.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return position >= 0 && books.get(position) != null;
    }

    @Override
    public Book next() {

        if (!hasNext()) {
            return null;
        }

        // Return current book and move backward
        return books.get(position--);
    }
}