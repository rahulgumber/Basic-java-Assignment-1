package test;

import java.util.Scanner;

public class Missingnumber {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("eNTER THE SIZE OF array");
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n-1;i++)
		{
			 arr[i]=sc.nextInt();
		}
		int sum=n*(n+1)/2;
		int restSum=0;
		for (int i = 0; i < n-1; i++) {
			restSum+=arr[i];
		}
		int missingNumber=sum-restSum;
		System.out.println("Missing number is"+missingNumber);
	}
	}
