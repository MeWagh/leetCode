import javax.lang.model.util.ElementScanner6;

public class sinleLinkedList 
{
    public static node linkedList;
    public static void main(String[] args)
    {
        sinleLinkedList sl = new sinleLinkedList();

        for(int i=0;i<10;i++)
        {
            sl.push_front(i);
        }
        // sl.print(linkedList);
         System.out.println("front "+ sl.get_front());
         System.out.println("front "+ sl.get_back(linkedList));
         sl.insert_at(5,0,555,linkedList);
         sl.print(linkedList);

    }
    public void insert_at(int index,int count,int value,node head)
    {
        if(head.nextNode == null)
        {
            node new_node = new node();
            new_node.value = value;
            head.nextNode = new_node;
            return;
        }
        if(index == count)
        {
            System.out.println(head.value);

            node temp_node = new node();
            temp_node = head.nextNode;

            node new_node = new node();
            new_node.value = value;
            head.nextNode = new_node;
            head.nextNode.nextNode  = temp_node;
            return;
        }
        count++;
        insert_at(index,count,value,head.nextNode);

    }
    public int get_back(node root)
    {
        if(root.nextNode == null)
            return root.value;
        else
            return get_back(root.nextNode);

    }
    public int get_front()
    {
        return linkedList.value;

    }
    public void pop_back(node root) 
    {
        if(root == null)
            return;
        if(root.nextNode != null && root.nextNode.nextNode == null )
            root.nextNode = null;
        else
            pop_back(root.nextNode);

    }
    public void push_back(node root,int value) 
    {
        if(root.nextNode == null)
        {
            node new_node = new node();
            new_node.value = value;
            root.nextNode = new_node;
        }
        else
            push_back(root.nextNode,value);
    }
    public void pop_front()
    {
        if(linkedList != null)
        {
            if(linkedList.nextNode != null)
                linkedList = linkedList.nextNode;
            else
            {
                linkedList = null;
            }
        }
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
class node
{
    public node nextNode;
    public int value;
}