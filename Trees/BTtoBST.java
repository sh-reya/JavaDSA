class Solution
{
    public int minSwaps(int nums[])
    {
        int count=0;
        int[] temp=Arrays.copyOfRange(nums,0,nums.length);
        
        HashMap<Integer, Integer> m=new HashMap<Integer, Integer>();
        
        Arrays.sort(temp);
        
        for(int i=0; i<nums.length; i++)
        {
            m.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++)
        {
            if(temp[i]!=nums[i])
            {
                count++;
                int element=nums[i];
                swap(nums,i,m.get(temp[i]));
                
                m.put(element,m.get(temp[i]));
                m.put(temp[i],i);
            }
        }
        return count;
        // Code here
    }
    
    public void swap(int[] nums, int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
