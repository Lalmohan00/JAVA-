//Write a java Program to check the number is Prime or not.

//import java.util.Scanner;
//calss Prime
import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number :");
		n = s.nextInt();
		
		if(n%2==0 || n%3==0 || n==2 ||n==3){
			
			System.out.print("This is not prime number");
		}
		
		else{
			System.out.print("This is prime number");
		}
	}
}
		