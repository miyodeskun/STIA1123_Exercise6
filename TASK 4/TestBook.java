
package exercise6;
import java.util.Scanner;
/**
 *
 * @author Amirul Luqman
 */
public class TestBook {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        double price, highP = 0;
        String title, expensiveBook = null;
        
        System.out.print("Number of books: ");
        n = sc.nextInt();
        Book [] myLibrary = new Book[n];
        
        for (int i = 0; i<n; i++){
            sc.nextLine();
            System.out.print("Book's " + (i+1) + " Title: ");
            title = sc.nextLine();
            System.out.print("Book's " + (i+1) + " Price: ");
            price = sc.nextDouble();
            
            myLibrary[i] = new Book(title, price);
            
            if (myLibrary[i].getPrice()>highP){
                highP = myLibrary[i].getPrice();
                expensiveBook = myLibrary[i].getTitle();
            }
        }
        System.out.printf("The book \"%s\" is the highest price with RM %.2f.\n", 
                expensiveBook, highP);
        
        System.out.println("Books that contain term \"Java\" in their title: ");
        for (int i=0; i<n; i++){
            if (myLibrary[i].getTitle().indexOf("Java")!=-1){
                System.out.println(myLibrary[i].getTitle());
            }      
        }
    }
}
