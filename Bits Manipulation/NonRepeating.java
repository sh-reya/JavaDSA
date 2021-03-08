class Solution
{
    public int[] singleNumber(int[] nums)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) 
            {
                map.put(nums[i], 1);
            } 
            else 
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int index = 0;
        for(Map.Entry<Integer, Integer> items:map.entrySet()) 
        {
            if(items.getValue()==1) 
            {
                result[index] = items.getKey();
                index++;
            }
        }
        Arrays.sort(result);
        return result;
        // Code here
    }
}
