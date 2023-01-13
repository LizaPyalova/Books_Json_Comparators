import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
public BookComparator(){

}
    public int compare(Book b1, Book b2){
        return b1.author.compareTo(b2.author);
    }
}
