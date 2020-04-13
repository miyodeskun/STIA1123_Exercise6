
package exercise6;
import java.util.Scanner;
/**
 *
 * @author Amirul Luqman
 */
public class TestStudent {
    public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
        String matricNo;
	double test1,test2;
	
	Student [] studDegree = new Student[3];
	
        //complete your code here
        for ( int x = 0; x<3 ; x++){
            System.out.print("Matric No: ");
            matricNo = input.next();
            System.out.print("Test 1: ");
            test1 = input.nextDouble();
            System.out.print("Test 2: ");
            test2 = input.nextDouble();
            
            studDegree[x] = new Student(matricNo, test1, test2);
        }
        
        System.out.println("*****************************");
        System.out.printf("%24s\n","STUDENT INFORMATION");
        System.out.println("*****************************");
        System.out.println("Matric No\tAverageMark");
        for ( int y=0; y <3; y++){
            studDegree[y].calculateAverage();
            System.out.println(studDegree[y].getStudentInfo());
        }
    }
}
