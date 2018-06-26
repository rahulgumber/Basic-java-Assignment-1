package test;

import java.util.Scanner;

public class seperatezeroes {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("eNTER THE SIZE OF array");
		int n=sc.nextInt();
		int[] a = new int[n];
		int length = a.length;
		System.out.println(length);
		for(int i=0;i<length-1;i++)
		{
			 a[i]=sc.nextInt();
		}
		int i=0;
	    int j=a.length-1;
	    while(i<j){
	        if(a[i]==0 && a[j]!=0){
	            int temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	            i++;j--;
	        }
	        else{
	            if(a[i]!=0)
	                i++;
	            if(a[j]==0)
	                j--;
	        }
	    }
	    for(int b=0;i<a.length;b++)
	        System.out.print(a[b]+" ");
	    
	   
		
			
		}

	}
	


