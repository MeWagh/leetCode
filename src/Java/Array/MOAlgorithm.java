// Input:  arr[]   = {1, 1, 2, 1, 3, 4, 5, 2, 8};
//         query[] = [0, 4], [1, 3] [2, 4]
// Output: Sum of arr[] elements in range [0, 4] is 8
//         Sum of arr[] elements in range [1, 3] is 4  
//         Sum of arr[] elements in range [2, 4] is 6

public class MOAlgorithm 
{
    public static void main(String[] args)
    {
        int[] intArray = new int[]{1, 1, 2, 1, 3, 4, 5, 2, 8}; 
        calculate(intArray,new int[]{0,4});

        calculate(intArray,new int[]{1,3});
        calculate(intArray,new int[]{2,4});


    }
    public static void calculate(int[] numbers, int[] range) 
    {
             int total = 0;
             for(int i=range[0];i<=range[1];i++)
             {
                total = total + numbers[i];
             }
             System.out.println(total);
    }


}