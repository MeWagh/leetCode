// mutable array with automatic resizing


public class DynamicArray 
{

    private int _array[];
    private int _count;
    private int _size;
    public DynamicArray() 
    {
        _array = new int[1];
        _count= 0;
        _size = 1;
    }
    public void Add(int data)
    {
        if(_count == _size) 
        {
            GrowSize(); // O(n)
        }
        _array[_count] = data; // O(1)
        _count++;

    }
    public void ShrinkSize()
    {
        int temp[] =new int[_count];
        for(int i=0;i<_count;i++)
        {
            temp[i] = _array[i]; 
        }
        _size=_count;
        _array = temp;
    }
    public void AddAt(int index,int data) // O(n)
    {
        if(_count == _size)
        {
            GrowSize();
        }
        for(int i= _count-1; i >=index;i--)
        {
            _array[i + 1] = _array[i];
        }
        _array[index] = data;
        _count++;
    }
    public void removeAt(int index) // O(n)
    {
       
        for(int i= index ; i < _count;i++)
        {
            _array[i] = _array[i+1];
        }
        _array[_count - 1] = 0;
        _count--;
    }
    public void prepend(int data) //can use insert above at index 0
    {
        if(_count == _size)
        {
            GrowSize();
        }
        for(int i= _count-1; i >=0;i--)
        {
            _array[i + 1] = _array[i];
        }
        _array[0] = data;
        _count++;
    }
    public void Pop() // O(1)
    {
        _array[_count - 1] = 0;
        _count--;
    }
    private void GrowSize()
    {
        int temp[] =new int[_size * 2];
        for(int i=0;i<_size;i++)
        {
            temp[i] = _array[i]; 
        }
        _size= _size *2;
        _array = temp;
    }
    public static void main(String[] args)
    {
        DynamicArray da = new DynamicArray();
  
        // add 9 elements in array
        da.Add(1);
        da.Add(2);
        da.Add(3);
        da.Add(4);
        da.Add(5);
        da.Add(6);
        da.Add(7);
        da.Add(8);
        da.Add(9);
  
        da.PrintArray(da);
        da.ShrinkSize();
        da.PrintArray(da);

        // add an element at index 1
         da.AddAt(1, 22);
         da.PrintArray(da);
         da.removeAt(5);
         da.PrintArray(da);
         da.ShrinkSize();
         da.PrintArray(da);

         da.prepend(10);
         da.PrintArray(da);
    }
    public void PrintArray(DynamicArray da)
    {
        System.out.println("Elements of array:");
        for (int i = 0; i < da._size; i++) {
            System.out.print(da._array[i] + " ");
        }

    }
  


}
// Elements of array:
// 1 2 3 4 5 6 7 8 9 0 0 0 0 0 0 0 Elements of array:
// 1 2 3 4 5 6 7 8 9 Elements of array:
// 1 22 2 3 4 5 6 7 8 9 0 0 0 0 0 0 0 0 Elements of array:
// 1 22 2 3 4 6 7 8 9 0 0 0 0 0 0 0 0 0 Elements of array:
// 1 22 2 3 4 6 7 8 9