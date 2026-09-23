class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int a=0;
        for(int i=0;i<s.length();i++ )
        {
        a=s.charAt(i);
         sum+=(123-a)*(i+1) ;
        }
        return sum;
     }
}