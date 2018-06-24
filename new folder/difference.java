import java.util.Scanner;

public class difference {
	public static void main(String [] args)
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want in array");
		int n=sc.nextInt();
		float[] arr=new float[n];
		System.out.println("Enter all the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextFloat();
		}
		float first,second;
		first= second = Float.MAX_VALUE;
        for (int i = 0; i < n; i ++)
        {
            if (arr[i] < first)
            {
                second = first;
                first = arr[i];
            }
            else if (arr[i] < second&& arr[i] != first)
                second = arr[i];
        }
        if (second== Float.MAX_VALUE)
            System.out.println("No second smallest element.");
        else
            System.out.println("The smallest element is " +
                               first + " and second Smallest  element is " + second +".");
        float difference=second-first;
        System.out.println("The difference between the first and second"+ difference);
      
    }
}