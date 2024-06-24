package Assignment1;

public class Question5 {

	public static int binarySearch(int arr[],int n,int key) {
		int left=0;
		int right=n-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(key==arr[mid])
			{
				return mid;
			}
			else if(key<arr[mid]) {
				left=mid+1;
			}
		   else
		   	{
			right=mid-1;
		   		}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,8,7,6,5,4,3,2,1};
		int var=binarySearch(arr,9,2);
		if(var!=-1)
		{
			System.out.println("The array is in descending order");
		}
		else
		{
			System.out.println("the array is not in descending order");
		}
	}

}
