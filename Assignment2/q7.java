class Stack
{
    int arr[];
    int top;
    final int SIZE;
    public Stack(int size)
    {
        SIZE=size;
        arr=new int[SIZE];
        top=-1;
    }

    public boolean isEmpty()
    {
        return(top==-1);

    }
    public boolean isFull()
    {
        return(top==SIZE-1);
    }

    public void pushEle(int val)
    {
        if(isFull())
        {
            System.out.println("stack is full");
        }
        else{
           top++;
           arr[top]=val;
        }
    }


    public int popele()
    {
        if(isEmpty())
        {
            return -1;
        }
        int ret=arr[top];
       // arr[top]=0;
        top--;

        return ret;
    }
     
    public void printStack()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
public class q7 {
   public static void main(String[] args) {
    Stack s=new Stack(7);
    int arr[]={2,3,4,6,4,3,8};
    int reverse[]=new int [arr.length];
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]+" ");
    }
    for(int i=0;i<arr.length;i++)
    {
        s.pushEle(arr[i]);
    }
   System.out.println("reversed array: ");
   for(int i=0;i<arr.length;i++)
   {
    System.out.print(reverse[i]=s.popele());
    System.out.print(" ");
   }
    s.printStack();
   }
}


