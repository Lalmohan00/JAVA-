import java.util.Scanner;
class Marksheet
{
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.print("enter the name :");
		String name=in.nextLine();
		System.out.print("enter the roll no :");
		int roll_no=in.nextInt();
		System.out.print("enter the DELD marks :");
		int DELD=in.nextInt();
		System.out.print("enter the JAVA marks :");
		int JAVA=in.nextInt();
		System.out.print("enter the MATH marks :");
		int MATH=in.nextInt();
		int total_marks=(DELD+JAVA+MATH);
		System.out.println(name+" "+roll_no);
		System.out.println("total marks ="+total_marks);
		
	}
}
		
		