import java.util.Scanner;
class Largest
{
	public static void main(String arg[])
	{
		int a,b,c;
		Scanner larg=new Scanner(System.in);
		
		System.out.print("enter the 1st number a=");
		a=larg.nextInt();
		System.out.print("enter the 2nd number b=");
		b=larg.nextInt();
		System.out.print("enter the 3rd number c=");
		c=larg.nextInt();
		
		if(a>b){
			System.out.println("1st number is largest a="+a);
			if(b>c){
				System.out.println("b="+b);
				System.out.println("c="+c);
			}
			else if(c>b){
				System.out.println("c="+c);
				System.out.println("b="+b);
			}
		}
		else if(b>c){
		    System.out.println("2nd number is largest b="+b);
		}
		else {
		System.out.println("3rd number is largest c="+c);
		}
	}
}
