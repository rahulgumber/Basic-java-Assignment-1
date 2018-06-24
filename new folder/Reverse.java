import java.util.Scanner;

public class Reverse {
	public static void main(name [] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int innumber= sc.nextInt();
		reverseandadd(innumber);
		
	//	System.out.println("hello");
	}
	public static int reversenumber(int number)
	{	int reverse=0,rem=0;
		while(number!=0)
		{
			rem=number%10;
			reverse=(reverse*10)+rem;
			number=number/10;
		}
		return reverse;
		
	}
	public static boolean check(int number)
	{
		int reverse=reversenumber(number);
		if (reverse==number)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void reverseandadd(int number)
	{
		if(check(number))
		{
			System.out.println("number is aleady palindrome");
		}
		else
		{
			while(!check(number))
			{
				int reverse=reversenumber(number);
				int sum=number+reverse;
				System.out.println(number+" + "+reverse+" = "+sum);
				number=sum;
			}
		}
	}

}
