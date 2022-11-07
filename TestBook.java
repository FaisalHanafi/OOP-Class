import java.util.Scanner;
public class TestBook{
    public static void main(String args[])
    {
        Book b1 = new Book("Upin Ipin",430,"Fantasy");
        Book b2 = new Book("Moby Dick",534,"Fiction");
        Book b3 = new Book("Naruto",873,"Manga");
        
        System.out.println("There are two types of output: ");
        System.out.println("1)  Individually data fields output");
        System.out.println("Title: " + b1.gettitle());
        System.out.println("Pages: " + b1.getpages());
        System.out.println("Genre: " + b1.getgenre());
        System.out.println("2) Using toString() method "+b2.toString());
        System.out.println(b3.toString());
        
    }
}