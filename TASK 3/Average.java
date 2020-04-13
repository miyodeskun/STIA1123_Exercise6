
package exercise6;
import java.util.Scanner;
/**
 *
 * @author Amirul Luqman
 */
public class Average {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int w, x, y;
        
        System.out.print("Input 1st Integer: ");
        w = sc.nextInt();
        System.out.print("Input 2nd Integer: ");
        x = sc.nextInt();
        System.out.print("Input 3rd Integer: ");
        y = sc.nextInt();
        
        System.out.println("Average for 3 integers above: " + average(w,x,y));
        
        int z;
        System.out.print("Input another Integer: ");
        z = sc.nextInt();
        
        System.out.println("Average for 4 integers above: " + average(w,x,y,z));
    }
    public static double average(int w, int x, int y){
        double avg;
        avg = (double)(w+x+y)/3;
        return avg;
    }
    public static double average(int w, int x, int y, int z){
        double avg;
        avg = (double)(w+x+y+z)/4;
        return avg;
    }
}
