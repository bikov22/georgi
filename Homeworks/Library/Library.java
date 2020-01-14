package Classes;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Library {
    public String name;
    public ArrayList<Book> books = new ArrayList<>();

    public Library(String name){
        this.name = name;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public String getAllBooks(){
        String toReturn = "";
        for (Book book : books){
            toReturn += book.GetBook();
        }

        return toReturn;
    }

    public ArrayList<Book> findBookByAuthorName(String authorName){
       return books.stream().filter(x -> x.Author ==authorName).collect(Collectors.toCollection(ArrayList::new));
    }

    public Book findBookByISBN(int ISBN){
        return books.stream().filter(x -> x.ISBN == ISBN).findFirst().orElse(null);
    }

    public void removeBookByISBN(int ISBN){
        var book = books.stream().filter(x -> x.ISBN == ISBN).findFirst().orElse(null);
        if (book != null) books.remove(book);
    }

    public void RemoveBookByAuthor(String authorName){
        var book = books.stream().filter(x -> x.Author == authorName).findFirst().orElse(null);
        if (book != null) books.remove(book);
    }
}
