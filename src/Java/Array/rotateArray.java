
public class rotateArray 
{
    public static void main(String[] args)
    {
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9}; 
        PrintArray(intArray);
        rotate(intArray,3);
     }
    public static void rotate(int[] numbers, int index) 
    {
        int[] temp = new int[index];
        for(int i=0;i<index;i++)
        {
            temp[i] = numbers[i];
        }
        int start = 0;
        for(int i=index;i<numbers.length;i++)
        {
            numbers[start] = numbers[i];
            start++;
        }
        for(int i=0;i<temp.length;i++)
        {
            numbers[start] = temp[i];
            start++;
        }
        PrintArray(numbers);
    }
    public static void PrintArray( int[] temp)
    {
        System.out.println("Elements of array:");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

    }


}