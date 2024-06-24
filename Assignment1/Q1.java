package Assignment1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String - ");
		String str1 = sc.next();
		boolean flag = isPalindrome(str1);
		
		if(flag == true) {
			System.out.println("String is not Palindrome");
		}else {
			System.out.println("String is Palindrome");
		}
		
		
		System.out.println("Enter a Number - ");
		if(isPalindrome(sc.nextInt())) {
			System.out.println("Number is Palindrome...");
		}else {
			System.out.println("Number is Not Palindrome..");
		}

	}
	
	public static boolean isPalindrome(String str) {	
		char[] arr = str.toCharArray();
		int j = arr.length - 1;
		boolean flag = false;
		for(int i = 0 ; i <= (arr.length)/2 ; i++) {
			if(arr[i] == arr[j]) {
				j--;
				flag = false;
			}else {
				flag = true;
			}
		}
		return flag;
	}
	
	public static boolean isPalindrome(int num) {
		String str = String.valueOf(num);
		StringBuilder sb = new StringBuilder(str).reverse();
		return str.equals(sb.toString());
	}
}
