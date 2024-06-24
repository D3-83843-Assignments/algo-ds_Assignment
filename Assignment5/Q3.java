class BStree
{
    class Node2{
        int value;
        Node2 left;
        Node2 right;
        public Node2(int data)
        {
            value=data;
            left=null;
            right=null;
        }
    }
        Node2 root;
        public BStree()
        {
        root=null;
        
        }

        public boolean isEmpty()
        {
            return (root==null);

        }
        public void addNode(Node2 trav,int value )
        {
            if(isEmpty())
            {
                root=new Node2(value);
            }
            else{
                if(value<trav.value)
                {
                    if(trav.left==null)
                    {
                        trav.left=new Node2(value);
                        return;
                    }
                    else{
                        addNode(trav.left,value);
                    }
                }else
                {
                    if(trav.right==null)
                     {

                        trav.right=new Node2(value);
                        return;
                        
                     }  
                     else
                     {
                        addNode(trav.right,value);
                     }
        
                }
            }

        }

        public void addNode(int value)
        {
            if(root==null)
            {
                root=new Node2(value);
            }
            else{
                addNode(root,value);
            }
        }

        public void inOrder(Node2 trav)
        {
            if(trav==null)
            {
                return;
            }
            inOrder(trav.left);
            System.out.println(" "+trav.value);
            inOrder(trav.right);
        }
        public void inOrder()
        {
            if(root==null)
            {
                return;
            }
            else{
                inOrder(root);
            }
        }



        public Node2 Search(Node2 trav,int value)
        {

        if(trav!=null && trav.value==value)
            {
                return trav;
            }
         if(trav!=null && value<trav.value)
                {
                 return  Search(trav.left,value);
                    
                 }
        if(trav!=null && value>trav.value)
                {
                 return Search(trav.right,value);
                }
        return null;

        }

        public void Search(int value)
        {
            if(root==null)
            {
                System.out.println("empty");
            }
            else{
                
                if(Search(root,value)==null)
                {
                    System.out.println("value not present");
                }
                else{
                    System.out.println("value is present");
                }
                
            }

        }

        public void delete(int value)
        {
            Node2 ref=Search(root,value);
            if(ref.left!=null && ref.right!=null)
            {
                Node2 parent=ref;
                Node2 succ=parent.right;
                while(succ.left!=null)
                {
                    parent=succ;
                    succ=succ.left;
                }
                int temp=succ.value;
                ref.value=temp;
                if(parent.right==succ)
                {
                    parent.right=null;
                }
                else{
                    parent.left=null;
                }
            }
            else{
                System.out.println("Dont have 2 childs");
            }
        

        }
}

public class Q3{
    public static void main(String[] args) {
        BStree tree=new BStree();
        tree.addNode(10);
        tree.addNode(40);
        tree.addNode(5);
        tree.addNode(2);
        tree.addNode(30);

        tree.inOrder();
        //tree.Search(2);
System.out.println("after delete");
tree.delete(10);
tree.inOrder();        
    }
}