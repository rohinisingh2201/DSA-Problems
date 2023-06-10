class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<N; i++) {
            if(A[i] < min) {
                min = A[i];
            }
            if(A[i] > max) {
                max = A[i];
            }
        }
        return min + max;
        
    }
}
