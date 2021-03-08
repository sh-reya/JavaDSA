class Solution
{
    public int[] singleNumber(int[] nums)
    {
        int sum=0;
        for(int i=0; i<nums.length; i++)
        {
            sum=sum^nums[i];
            //repeated elements are cancelled out
            //We are left with XOR of 2 unique element
        }
        sum=sum&-sum;
        
        int sum1=0;
        int sum2=0;
        int result[]=new int[2];
        for(int i=0; i<nums.length; i++)
        {
            if((nums[i]&sum)>0)
            {
                sum1=sum1^nums[i];
            }
            else
            {
                sum2=sum2^nums[i];
            }
        }
        result[0]=sum1;
        result[1]=sum2;
        Arrays.sort(result);
        return result;
        // Code here
    }
}
