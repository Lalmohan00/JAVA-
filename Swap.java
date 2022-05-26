import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner swap=new Scanner(System.in);
		System.out.print("the value of a= ");
		a=swap.nextInt();
		System.out.print("the value of b= ");
		b=swap.nextInt();
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("swap value is a="+a+",b="+b);
	}
}
