
package exercise6;

/**
 *
 * @author Amirul Luqman
 */
public class Book {
 private String title;      //book’s title
 private double price;      //book’s price

 public Book(String t, double p) {
   title = t;
   price = p;
 }
 public String getTitle() {
   return title;
 }

 public double getPrice() {
   return price;
 }
}

