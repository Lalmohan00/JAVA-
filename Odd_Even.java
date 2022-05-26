import java.util.Scanner;
class Odd_Even
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("enter the number :");
		int a=s.nextInt();
		
		if(a%2==0)
			System.out.println("this is even number");
		
		else
			System.out.println("this is odd number");
	}
}