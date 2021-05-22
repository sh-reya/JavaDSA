class Solution
{
    
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length && k < C.length) {
            int a = A[i];
            int b = B[j];
            int c = C[k];
            if (a <= b && a <= c) 
            {
                al.add(a);
                i++;
            }
            else if (b <= a && b <= c) 
            {
                al.add(b);
                j++;
            }
            else 
            {
                al.add(c);
                k++;
            }
        }
        
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) 
            {
                al.add(A[i]);
                i++;
            }
            else 
            {
                al.add(B[j]);
                j++;
            }
        }
        while (j < B.length && k < C.length) 
        {
            if (B[j] < C[k]) 
            {
                al.add(B[j]);
                j++;
            }
            else 
            {
                al.add(C[k]);
                k++;
            }
        }
        while (i < A.length && k < C.length) 
        {
            if (A[i] < C[k]) 
            {
                al.add(A[i]);
                i++;
            }
            else 
            {
                al.add(C[k]);
                k++;
            }
        }
 
        
        while (i < A.length) 
        {
            al.add(A[i]);
            i++;
        }
        while (j < B.length) 
        {
            al.add(B[j]);
            j++;
        }
        while (k < C.length) 
        {
            al.add(C[k]);
            k++;
        }
        return al;
        
        
    } // merge3sorted closing braces

}
