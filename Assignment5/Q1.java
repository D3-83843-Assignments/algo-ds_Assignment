class BStree
{
    class Node{
        int value;
        Node left;
        Node right;
        public Node(int data)
        {
            value=data;
            left=null;
            right=null;
        }
    }
        Node root;
        public BStree()
        {
        root=null;
        
        }

        public boolean isEmpty()
        {
            return (root==null);

        }
        public void addNode(Node trav,int value )
        {
            if(isEmpty())
            {
                root=new Node(value);
            }
            else{
                if(value<trav.value)
                {
                    if(trav.left==null)
                    {
                        trav.left=new Node(value);
                        return;
                    }
                    else{
                        addNode(trav.left,value);
                    }
                }else
                {
                    if(trav.right==null)
                     {

                        trav.right=new Node(value);
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
                root=new Node(value);
            }
            else{
                addNode(root,value);
            }
        }

        public void inOrder(Node trav)
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
}

public class Q1{
    public static void main(String[] args) {
        BStree tree=new BStree();
        tree.addNode(10);
        tree.addNode(40);
        tree.addNode(5);
        tree.addNode(2);
        tree.inOrder();
        
    }
}