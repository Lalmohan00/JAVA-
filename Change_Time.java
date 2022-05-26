import java.util.Scanner;
class Change_Time
{
	public static void main (String args[])
	{
		Scanner tim = new Scanner(System.in);
		
		System.out.print("Enter the input in day :");
		int da = tim.nextInt();
		
		
		int di=da*24;
		int hour=di*60;
		int minute=hour*60;

		System.out.print("output in second :"+minute);
	}
}

		