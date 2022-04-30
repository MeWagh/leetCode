

public class removeNthFromLast 
{
    public static node linkedList;
    public static void main(String[] args)
    {
        removeNthFromLast sl = new removeNthFromLast();

        for(int i=0;i<10;i++)
        {
            sl.push_front(i);
        }
        sl.print(linkedList);
        linkedList = sl.removenth(linkedList,5);
         System.out.println();
         sl.print(linkedList);

    }
    public node removenth(node head,int n)
    {
        node dummy_node = new node();    
        dummy_node.nextNode = head;
        
        node slow  = dummy_node;
        node fast  = dummy_node;
        
        for(int i=1;i<=n+1;i++)
        {
            fast = fast.nextNode;
        }
        
        while(fast != null)
        {
            slow = slow.nextNode;
            fast = fast.nextNode;
        }
        
        slow.nextNode = slow.nextNode.nextNode;
         return dummy_node.nextNode ;
    }
    public void print(node root)
    {
        if(root == null)
        return;
        System.out.print(" "+root.value);
        if(root.nextNode == null)
            return;
        else
            print(root.nextNode);
    }
    public void push_front(int value)
    {
        node new_node = new node();
        new_node.value = value;
        node temp_node = linkedList;
        linkedList = new_node;
        linkedList.nextNode = temp_node;
    }
}
// class node
// {
//     public node nextNode;
//     public int value;
// }