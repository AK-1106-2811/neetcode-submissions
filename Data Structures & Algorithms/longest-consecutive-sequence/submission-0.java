class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        int check = -1;
        for(int i = 0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int i = 0;i<nums.length;i++)
        {
            if(!(set.contains(nums[i]-1)))
            {
                list.add(nums[i]);
            }
        }
        int count = 0;
        for(int i = 0;i<nums.length;i++)
        {
            count = 0;
            if(list.contains(nums[i]))
            {
                check++;
        while(set.contains(list.get(check)+count))
        {
            count++;
        }
            }
        max = Math.max(max,count);
        }
        return max;


    }
}
