//Write a Java program to print factorial of a number.

import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		int n,i,fact=1;
	    
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the number :");
		n=s.nextInt();
		
		for(i=1;i<=n;i++){
			fact=fact*i;
		}
		
			System.out.print("Factorial of "+n+" is: "+fact);
		
	}
}
		