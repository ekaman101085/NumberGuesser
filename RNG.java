package self;

/** 
*The purpose of this class is to model a television
*Ernest Simon Kamanda 09/28/2020
*/
import java.util.*;
public class RNG {
	 private int count=0;
	 private int lowGuess=0;
	 private int highGuess=99;
	 private int randNum=RNG.rand(100);
	   Scanner key= new Scanner(System.in);

	//Randon function to generate random a number
	   public static int rand(int num)
	   {
	       int randNum = 1 + (int)(num* Math.random());
	       return randNum;
	   }


	   public void resetCount()
	   {
	       count=0;
	   }


	   public int getCount()
	   {
	       count++;
	       return count;
	   }

	//validation method
	   public void inputValidation(int guess, String name)
	   {
	       System.out.println("Number of guesses is : "+getCount());
	       while(guess!=randNum)
	       {
	           if(guess<randNum)
	           {
	               System.out.println("Your guess is too low");
	               lowGuess=guess;
	               System.out.println("Enter your next guess between "+guess+" and "+highGuess);
	               inputValidation(key.nextInt(),name);
	               break;
	           }
	           else if(guess>randNum)
	           {
	               System.out.println("Your guess is too high");
	               highGuess=guess;
	               System.out.println("Enter your next guess between "+lowGuess+" and "+guess);
	               inputValidation(key.nextInt(), name);
	               break;
	           }
	       }
	       if(guess == randNum )
	       {  
	               System.out.println("Congragulations "+name+", you guessed correctly");
	               System.out.println("Try again? (yes or no)");
	               String str = key.next();
	               if(str.equals("YES") || str.equals("yes"))
	               {
	                   resetCount();
	                   lowGuess=0;
	                   highGuess=99;
	                   RandomNumberGuesser.main(null);
	               }
	               else if(str.equals("NO") || str.equals("no"))
	               {
	                   System.out.println("Thanks for playing "+name);
	                   resetCount();
	                   lowGuess=0;
	                   highGuess=99;
	                  
	               }
	       }
	   }
	


}
