//Write a Java program to print star pattern.

import java.util.Scanner;
class Star_pattern
{
	public static void main(String args[])
	{
		int n,i,j;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter star number :");
		n=s.nextInt();
		
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
			
		