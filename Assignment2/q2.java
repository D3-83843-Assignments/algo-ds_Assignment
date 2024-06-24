import java.lang.reflect.Array;
import java.util.Arrays;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,4,6,7,2,4,5};
		insertion(arr);

	}
	public static void insertion(int arr[])
	{int comp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{comp++;
				if(arr[j]>arr[j-1])
				{
					
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(comp);
	}

}
