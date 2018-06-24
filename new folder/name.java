import java.util.Scanner;

public class name {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
	//	System.out.println("n");
		String arr[]=n.split(" ",3);
		//for(int i=0;i<arr.length-1;i++)
	//	{
	//		System.out.print(arr[i].charAt(0)+ " ");
	//	}
	//.out.println(arr[arr.length-1]);
		System.out.println(arr[0].charAt(0)+ "."+arr[1].charAt(0)+"."+arr[2]);
		
		
	}

}