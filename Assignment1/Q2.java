package Assignment1;

import java.util.Iterator;

public class Question2 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,2,1,3};
		
		System.out.println(lastIndex(arr , 2));
	}
	
	public static int lastIndex(int[] arr , int key) {
		
		for (int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] == key)
			{
				return i;
			}
		}
		
		return -1;
	}
}
