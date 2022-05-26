import java.util.Scanner;

public class Guess_Number{
    public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int myNumber = (int)(Math.random()*100);
	int userNumber = 0;
	
	do{
		System.out.print("Guess my number(1-100) : ");
		userNumber = sc.nextInt();
		
		if(userNumber == myNumber){
			System.out.println("woohoo...CORRECT NUMBER !!!");
			break;
		}
		else if(userNumber > myNumber){
			System.out.println("your number is too large");
		}
		else{
			System.out.println("your number is too small");
		}
	}
	while(userNumber >= 0);
	
	System.out.print("My number was : "+myNumber);
	
}
}