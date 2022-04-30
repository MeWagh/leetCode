package ListOf75;

import java.util.HashMap;

public class containsDuplicate {
    public static void main(String args[])
    {
        int[] nums = new int[]{1,2,3,1};
        int[] nums1 = new int[]{1,2,3,4,5,6,7};
        System.out.println(isDuplicate(nums));
        System.out.println(isDuplicate(nums1));

    }
    public static boolean isDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],nums[i]);
            }
            else
                return true;
        }
        
        return false;
        
    }
}
