class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr=new int[nums.length];
        arr=nums.clone();
        Arrays.sort(arr);
        for(int i=1;i<nums.length;i++){
            
                if(arr[i-1]==arr[i])
                return arr[i-1];
                
        
}
      return 0;  
    }
}