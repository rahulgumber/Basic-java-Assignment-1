package test;

import java.util.Scanner;

public class name {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		String arr[]=n.split(" ");
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i].charAt(0)+ ".");
		}
			System.out.println(arr[arr.length-1]);
		
		
		
	}

}
