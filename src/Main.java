import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import jdk.internal.org.objectweb.asm.TypeReference;

import java.io.File;
import java.io.FileOutputStream;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class Main {


    public static void main(String[] args) throws Exception {
        int n=0;
        Scanner sc=new Scanner(System.in);
        Arrays[] arr=new Arrays[n];
     Book a=new Book("A", "B");
     Book b2=new Book("B2", "J");
     Book y=new Book("Y", "A");
     Book y2=new Book("Y2", "A");
   //  Book tmp=new Book("Y", "A");
     BookShelf shel=new BookShelf();
     shel.add(a);
     shel.add(b2);
     shel.add(y);  shel.add(y2);
     Collections.sort(shel.shelf, (Book b1, Book b) -> {
                return b1.author.compareTo(b.author);
     }); //лямбда выражение
        // shel.print_book();
       // System.out.println( shel.AuthorBooks("A"));
        //shel.Print_Groups_Of_Author();
       ObjectMapper objectMapper= new ObjectMapper();
       objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        FileOutputStream fout = new FileOutputStream("book.json");
        objectMapper.writeValue(fout, shel);

        String json2=objectMapper.writeValueAsString(shel);
        //String json=objectMapper.writeValueAsString(new Book("Harry Potter", "Joan R"));
      //System.out.println(json2);
      //  System.out.println(json);

   //   Map<String, Object> b= objectMapper.readValue(new File("book.json"), Map.class);
        // List <Book> books_from_shelf= objectMapper.readValue(json2, new TypeReference<ArrayList<Book>>(){});4
        BookShelf books_from_shelf = objectMapper.readValue(new File("book.json"), BookShelf.class);
        books_from_shelf.print_book();
    }

}