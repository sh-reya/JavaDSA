class Solution
{
    public static BigInteger findCatalan(int n)
    {
        //Your code here
        BigInteger f=new BigInteger("1");
        for(int i=1; i<=n; i++)
        {
            f=f.multiply(BigInteger.valueOf(i));
        }
        BigInteger g=f;
        g=g.multiply(f);
        
        BigInteger h=new BigInteger("1");
        for(int i=1; i<=2*n; i++)
        {
            h=h.multiply(BigInteger.valueOf(i));
        }
        BigInteger res=h.divide(g);
        res=res.divide(BigInteger.valueOf(n+1));
        
        return res;
    }
  
}
