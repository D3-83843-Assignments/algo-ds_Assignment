class Heap{
    private int size;
    public Heap()
    {
        size=0;
    }
    public void createheap(int arr[])
    {
        size++;
        int ci=size;
        int pi=size/2;

        while(pi>=1)
        {
            if(arr[pi]<=arr[ci])
            {
                break;
            }
            else{
                int temp=arr[ci];
                arr[ci]=arr[pi];
                arr[pi]=temp;
            }
            ci=pi;
            pi=ci/2;
        }
    }
    public int delete(int arr[])
    { 
        int temp=arr[1];
        arr[1]=arr[size];
        arr[size]=temp;

        int pi=1;
        int ci=2*pi;
         size--;
         while(ci<=size)
        {
         if((ci+1)<=size && arr[ci]>=arr[ci+1])
         {
            ci=ci+1;
         }
         if(arr[pi]>arr[ci])
         {
            int temp1=arr[pi];
            arr[pi]=arr[ci];
            arr[ci]=temp1;
         }
         pi=ci;
         ci=pi*2;
         
        }
        return temp;
    }
}

public class Q1{
    public static void main(String[] args) {
        int arr[]={0,6,14,3,26,8,18,21,9,5};
        Heap heap=new Heap();
       
        for(int i=1;i<arr.length;i++)
        {
            heap.createheap(arr);
        }
        System.out.println("before sort:");
        for(int i=1;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=1;i<arr.length;i++)
        {
            heap.delete(arr);
        }
        System.out.println(" ");
        System.out.println("After  min heap sort:");
        for(int i=1;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}