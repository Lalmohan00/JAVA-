import java.util.Scanner;
class Cheak_Equal
{
	public static void main(String arg[])
	{
		int a,b;
		Scanner odd=new Scanner(System.in);
		System.out.print("enter the first number :");
		a=odd.nextInt();
		System.out.print("enter the second number :");
		b=odd.nextInt();
		
		if(a>b){
			System.out.println("first number is greater than second number");
		}
		
		else if(a==b){
			System.out.println("both number are same");
		}
		
		
		else{
			System.out.println("second number is greater than first number");
		}
	}
}
			
		