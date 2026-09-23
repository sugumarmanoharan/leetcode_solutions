class Solution {
    public int addDigits(int num) {
        while(num >= 10) {
        int a=0;
        while(num>0){
           int n=num%10;
             a+=n;
            num=num/10;
             
            
            
        }

       num=a;
        }
        return num;
      
    }
}