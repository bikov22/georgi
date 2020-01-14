package Classes;

public class Test {
    public void TestCode(){
        Library library = new Library("Amazon");

        var book1 = new Book("Anna Karenina", "Stephen King", "Pergament", 1999, 12345512);
        var book2 = new Book("Madame", "Mark", "PenSoft", 1999, 12345512);
        var book3 = new Book("War", "Gustav", "List", 1999, 12345512);
        var book4 = new Book("Lolita", "Leo Tolstoy", "ERGO", 1999, 12345512);
        var book5 = new Book("Search", "Twain", "Kix", 1999, 12345512);
        var book6 = new Book("Hamlet", "Shekspeare", "Kasoro", 1999, 12345512);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        System.out.println(library.getAllBooks());

        System.out.println("Removing Stephen King");
        library.RemoveBookByAuthor("Stephen King");

        System.out.println(library.getAllBooks());
    }
}
