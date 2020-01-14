package Classes;

public class Book {
   public int YearOfPublishing;
   public int ISBN;
   public String Title;
   public String Author;
   public String Publisher;


   public Book(String title, String author, String publisher, int yearOfPublishing, int isbn){
       Title = title;
       YearOfPublishing = yearOfPublishing;
       Author = author;
       Publisher  = publisher;
       YearOfPublishing = yearOfPublishing;
       ISBN = isbn;
   }

   public String GetBook(){
       return String.format("%s \n %s \n, %s, \n, %s, \n, %s, \n", Title,  Author, Publisher, YearOfPublishing, ISBN);
   }
}
