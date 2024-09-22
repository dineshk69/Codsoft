package task;
import java.util.Random;
import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
	Random random=new Random();
	int rand=random.nextInt(100)+1;
	System.out.println("welcome to the number guessing game");
	Scanner sc=new Scanner(System.in);
	int score=0;
	
	for(int i=1;i<=10;i++) {

		System.out.println("\nenter the guessing number:");
		
		int guessnumber=sc.nextInt();
		
		if(guessnumber==rand) 
		{
			
			System.out.println("you guess the correct number");
			break;
			
		}
		else if(guessnumber>rand)
		{
			
			System.out.println("you guess the big number ");
			
		}
		else
		{
			
			System.out.println("you guess the small number");
			
		}
		
		score=10-i;
		
		
	}
	
	System.out.println("your score is :"+score);
	
	System.out.print("Do you want to play again? (yes/no): ");
	
    String playAgain = sc.next();
    
    sc.close();

    if(playAgain.equalsIgnoreCase("yes")) 
    {
    	main(null);
    }
    else
    {
    	System.out.println("Thank you for playing");
    }
	
	}	
	
	
}
