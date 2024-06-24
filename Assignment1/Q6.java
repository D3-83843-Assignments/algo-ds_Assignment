package Assignment1;

import java.util.Scanner;

public class Question6 {
	public static int sort(int arr[],int occ,int key)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				count++;
			}
		}
		if(count==occ)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
	public static void main(String[] args) {
		
		int arr[]= {3,2,1,3,5,7,9,7,5,4,3,4,6,7,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of occurance:");
		int occ=sc.nextInt();
		System.out.println("Enter the key:");
		int key=sc.nextInt();
		int value=sort(arr,occ,key);
		if(value==1)
		{System.out.println(occ+"of occurances of "+key+" are present in array");}
		else
		{
			System.out.println(occ+"of occurances of "+key+" are not present in array");
		}
		
	}

}
