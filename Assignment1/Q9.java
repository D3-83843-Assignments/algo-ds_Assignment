import java.util.Arrays;

public class q9 {
	//9. Write a selection sort function to sort array and returns no of comparisions.
	public static int selectionComparisons(int arr[])
	{int comp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				comp++;
				if(arr[i]>=arr[j])
				{
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return comp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={ 10, 20, 15, 3, 4, 4, 1 };
		int comp=selectionComparisons(arr);
		System.out.println("Number of comparisons are : "+ comp);
	}

}
