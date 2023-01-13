import java.util.*;
import java.util.stream.Collectors;

public class BookShelf  {
  public  ArrayList<Book> shelf=new ArrayList<Book>();
public void add(Book b){
    shelf.add(b);
}
public void sort_athor() {
        Collections.sort(shelf, new BookComparator());
    }
    public void sort_name() {
        Collections.sort(shelf);
    }
    public String AuthorBooks(String author_){
        List<Book> books = shelf.stream().filter(book -> book.getAuthor().equals(author_)).collect(Collectors.toList());
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        String s="Number of books of author "+ author_+" = "+books.size();
        return s;
    }

    public void Print_Groups_Of_Author(){
    Set <String> authors = new HashSet<>();
    for(int i=0; i<shelf.size(); i++){
        authors.add(shelf.get(i).getAuthor());
    }
    for(String s:authors){
        System.out.println(AuthorBooks(s));
    }
    }

    public void sort() {
        Collections.sort(shelf);
    }

    public String get_Athor(int index){
    return shelf.get(index).getAuthor();
    }

    public String get_Name(int index){
        return shelf.get(index).getName();
    }

    public int binarySearch_Athor(Book b){
    return Collections.binarySearch(shelf, b, new BookComparator());
    }

    public int binarySearch_Name(Book b){
        return Collections.binarySearch(shelf, b);
    }
    public void print_book(){
    for(int i=0; i< shelf.size(); i++) {
        System.out.println(shelf.get(i).toString());
    }
    }

}
