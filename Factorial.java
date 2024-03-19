import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();

		int prod=1;
		int sum=0;

		for(int i=num; i>0; i--)
		{
			prod=prod*i;
			sum=sum+i;
		}
		System.out.println("sum of factorial number is:"+sum);
		System.out.println("product of factorial number is: "+prod);

		if(sum==prod)
		{
			System.out.println("sum of factorial of a number and product of factorial number are same"); 
		}
		else
		{
			System.out.println("sum of factorial of a number and product of factorial number are not same");
		}
	}
}