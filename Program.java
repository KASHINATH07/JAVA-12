import java.util.Scanner;
class  Program
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=scan.nextInt();
		if (num>0)
		{
			if (num%3==0&&num%5==0)
			{
				System.out.println("+ve FizzBuzz");
			}
			else if (num%3==0)
			{
				System.out.println("+ve Fizz");
			}
			else if(num%5==0) 
			{
				System.out.println("+ve Buzz");
			}
		}
		else if(num<0)
		{
			if (num%3==0&&num%5==0)
			{
				System.out.println("-ve FizzBuzz");
			}
			else if (num%3==0)
			{
				System.out.println("-ve Fizz");
			}
			else if(num%5==0) 
			{
				System.out.println("-\ve Buzz");
			}
		}
	}
}
