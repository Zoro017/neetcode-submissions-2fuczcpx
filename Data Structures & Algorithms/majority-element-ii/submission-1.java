class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int max1 = 0;
        int max2 = 0;
        int cnt1 = 0; 
        int cnt2 = 0;

        for(int num : nums){
            if(num == max1) cnt1++;
            else if(num == max2) cnt2++;
            else if(cnt1 == 0){
                max1 = num;
                cnt1++;
            }
            else if(cnt2 == 0){
                max2 = num;
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }

        }

        cnt1 = 0;
        cnt2 = 0;

        for(int num : nums){
            if(num == max1){
                cnt1++;
            }
            else if(num == max2){
                cnt2++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        if(cnt1 > n/3){
            ans.add(max1);
        }
        if(cnt2 > n/3){
            ans.add(max2);
        }

        return ans;
        
    }
}