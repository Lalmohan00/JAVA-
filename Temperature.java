import java.util.Scanner;
class Temperature
{
	public static void main(String arg[])
	{
		Scanner tem=new Scanner(System.in);
		
		System.out.print("enter the temperature :");
	float	f=tem.nextFloat();
		
		float c=((f-32)*5)/9;
		
		System.out.println("temperature in celsius ="+c);
	}
}