class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t2=t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t2);


        if(Arrays.equals(s1,t2)){
            return true;
        }
        
           
        
        return false;
    }
}