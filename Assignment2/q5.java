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

    public void push(int val)
    {
        if(isFull())
        {
            System.out.println("stack is full");
        }
        else{
            int i=top;
            while(i>=0 && arr[i]<val)
            {
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=val;
            top++;
        }
    }

    public int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        int ret=arr[top];
        arr[top]=0;
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
public class q5 {
   public static void main(String[] args) {
    Stack s=new Stack(4);
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(5);
    s.printStack();
    
   }
}
