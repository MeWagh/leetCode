import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args)
    {
        BinarySearch bs=new BinarySearch();
        int[] nums = new int[]{1, 1, 2, 1, 3, 4, 5, 2, 8}; 
        Arrays.sort(nums);
        System.out.println(bs.Search(0,nums.length-1,nums,5));

    }
   
    public int Search(int start,int end,int[] nums,int target)
    {
        if(start > end)
            return start--;
        int mid = ((start+end)-1/2);

        if(nums[mid] == target)
            return mid;
        else if(nums[mid] > target)
            return Search(start,mid-1,nums,target);
        else
            return Search(mid+1,end,nums,target);
    }
}