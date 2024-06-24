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
            if(top>=0 && val>=arr[top])
            {
                arr[top+1]=val;
                top++;
                
            }
            else if(top>=0 && val<arr[top])
            {
                arr[top+1]=arr[top];
                arr[top]=val;
                top++;
                
            }
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
public class q6 {
   public static void main(String[] args) {
    Stack s=new Stack(5);
    s.pushEle(10);
    s.pushEle(20);
    s.pushEle(30);
    s.pushEle(5);
    s.pushEle(15);
    s.printStack();
   System.out.println("Maximum element is: "+ s.popele());
    s.printStack();
   }
}
