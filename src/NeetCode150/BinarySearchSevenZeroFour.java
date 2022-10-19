//package NeetCode150;

import java.util.Arrays;

public class BinarySearchSevenZeroFour {
    public static void main(String[] args)
    {
        BinarySearchSevenZeroFour bs = new BinarySearchSevenZeroFour();
        int[] nums = new int[]{1, 1, 2, 1, 3, 4, 5, 2, 8}; 
        //[-1,0,3,5,9,12]
        Arrays.sort(nums);
        System.out.println(bs.search(nums,8));
        nums = new int[]{-1,0,3,5,9,12}; 
        System.out.println(bs.search(nums,5));

    }
    public int search(int[] nums, int target) {
           int start = 0;
        int end = nums.length -1;
        
        while(start <= end)
        {
            int mid = (start + end) / 2;
            if(nums[mid] == target)
                return mid;
            
            if(nums[mid] > target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
            
            
        }
        return -1;
    }
}