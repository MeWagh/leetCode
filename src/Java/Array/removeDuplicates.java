//Remove Duplicates from Sorted Array
public class removeDuplicates 
{
    public static void main(String[] args)
    {
        int[] intArray = new int[]{1,1,2,3,4,4,5,5}; 
        System.out.println(Action(intArray)); 
    }
    public static int Action(int[] nums) {
        
        if(nums.length <= 0)
            return 0;
        
        int j=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[j] != nums[i])
            {
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}