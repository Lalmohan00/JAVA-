import java.util.Scanner;
class Add
{
	public static void main(String args[])
	{
		Scanner add=new Scanner(System.in);
		
		System.out.print("enter the 1st number :");
		int a=add.nextInt();
		System.out.print("enter the 2nd number :");
		int b=add.nextInt();
		
		int sum=a+b;
		
		System.out.println("add of two number="+sum);
	}
}
		
		
		