import java.util.Scanner;
class If1
{
	public static void main(String[] args)
	{
		Scanner dc=new Scanner(System.in);
		System.out.println("are you a paid student or not:");
		

		boolean ip=dc.nextBoolean();

		if(ip==true)
		{
			System.out.println("please pay the fees:"+36950.0);
		}
		
		System.out.println("Attend the class");
	}
}