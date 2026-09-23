class Solution {
    public long countCommas(long n) {
        long c=0;
        if(n>999l){
            c+=n-999l;
        }
        if(n>999999l){
            c+=n-999999l;

        }
          if(n>999999999l){
            c+=n-999999999l;
        }
        if(n>999999999999l){
            c+=n-999999999999l;
        }
         if(n>999999999999999l){
            c+=n-999999999999999l;
         }
         return c;
    }
}