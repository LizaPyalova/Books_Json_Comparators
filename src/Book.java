public class Book implements Comparable<Book>{
    private
    String name;
    String author;
    Book(){
        name="";
        author="";
    }

    public Book(String _name, String _author){
        name=_name;
        author=_author;
    }


    @Override
    public int compareTo(Book b2){
        return this.name.compareTo(b2.name);
    }

    @Override
    public String toString(){
    return "name: "+name+" author: "+author;
    }


    public boolean equals(Book b2){
        if(name.equals(b2.name) && author.equals(b2.author)) return true;
        else return false;
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }

}
