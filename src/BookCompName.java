import java.util.Comparator;

public class BookCompName implements Comparator<Book> {
    public BookCompName(){}
    public int compare(Book b1, Book b2){
        return b1.getName().compareTo(b2.getName());
    }
}
