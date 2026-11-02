class Solution {
    public boolean hasDuplicate(int[] nums) {
                HashSet<Integer> ans = new HashSet<>();
        for(int n : nums){
            if(ans.contains(n))
                return true;
            ans.add(n);            
        }
        
        return false;
        
        
    }
}