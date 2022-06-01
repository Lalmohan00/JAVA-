// Write a Java program to find simple Interest

import java.util.Scanner;
class Simple_interest
{
	public static void main(String args[])
	{
		float si,p,r,t;
		//si=simple interest,p=principal,r=rate,t=time
		Scanner s =new Scanner(System.in);
		
        System.out.print("Enter the principal amount :");
		p=s.nextFloat();
		System.out.print("Enter the rate :");
		r=s.nextFloat();
		System.out.print("Enter the time :");
		t=s.nextFloat();
		
		si=(p*r*t)/100;
		System.out.print("Simple Interest is :"+si);
	}
}
		
		