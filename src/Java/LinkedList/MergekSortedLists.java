import java.util.Arrays;

import java.lang.reflect.Array;

public class MergekSortedLists 
{
    public static node[] linkedList = new node[3];
    public static void main(String[] args)
    {
        MergekSortedLists sl = new MergekSortedLists();
        
        for(int i=0;i<3;i++)
        {
            node new_node = new node();
            new_node.value = (int)(Math.random()*(20-1+1)+1);
            for(int j=1;j<10;j++)
            {
                int b = (int)(Math.random()*(20-(-11)+1)+(-11));  
                new_node = sl.push_front(b,new_node);
            }
            linkedList[i] = new_node.nextNode;
            //sl.print(linkedList[i]);
           // System.out.println();
            
        }
        
        node sort = sl.SortLinkedList(linkedList[0]);
        sl.print(sort);


    }
    public int LengthOfLinkedList(node head,int count)
    {
        if(head.nextNode == null)
            return count;
        else 
            count++;
        return LengthOfLinkedList(head.nextNode, count);
    }
    public node SortLinkedList(node head)
    {
        int length = LengthOfLinkedList(head,0);
        int[] tempArray = new int[length];
        node temp = head;
        int index = 0;
        while(temp.nextNode != null)
        {
            tempArray[index] = temp.value;
            temp = temp.nextNode;
            index++;
        }
        Arrays.sort(tempArray);index = 0;
        node result = null;
        //result.value = tempArray[index++];
        while(head.nextNode != null)
        {
            node tempNode = new node();
            tempNode = result;
            result = new node();
            result.value = tempArray[index];
            result.nextNode = tempNode;
            head = head.nextNode;
            index++;
        }
        return result;
    }


    public void print(node root)
    {
        if(root == null)
            return;

        System.out.print(" "+root.value);
        print(root.nextNode);
    }
    public node push_front(int value,node head)
    {
        node new_node = new node();
        new_node.value = value;
        node temp_node = head;
        head = new_node;
        head.nextNode = temp_node;
        return head;
    }
}