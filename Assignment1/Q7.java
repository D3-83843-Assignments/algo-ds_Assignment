
public class Q7 {
//	. find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Output: 3

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		System.out.println(nonRepeating(x));
	}
	public static int nonRepeating(int[] arr) {
		
		int x =0;
		for (int i =1; i < arr.length; i++) {
			int count=0;
			if(arr[x] == arr[i]) {
				x++;
				i=x+1;
			}
			if (i == arr.length-1) {
				break;
			}	
		}
		
		return arr[x];
	}
}
