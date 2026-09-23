class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a="";
        String b="";
        for(int i=0;i<=word1.length-1;i++){
            a=a+word1[i];
        }
        for(int i=0;i<=word2.length-1;i++){
            b=b+word2[i];
        }
        if(a.equals(b)){
            return true;
        }

      
        return false;
        
    }
}