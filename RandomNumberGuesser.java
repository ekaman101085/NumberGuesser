package self;

/**
 * @Ernest Simon
 * 10/11/2020
 */
import self.RNG;
import java.util.Scanner;
public class RandomNumberGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key= new Scanner(System.in); // create Scanner for input
		
	       System.out.println("Enter player name :");
	       String name = key.next();// get name from user
	       
	       // get numer from user and compare to RNG class random number
	       System.out.println("Enter your first guess : ");
	       RNG rng = new RNG();
	       rng.inputValidation(key.nextInt(), name);
	      

	}

}
