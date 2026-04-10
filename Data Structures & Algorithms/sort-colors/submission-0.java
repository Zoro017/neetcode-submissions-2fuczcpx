class Solution {
    public void sortColors(int[] nums) {

        int[] sorted = countsort(nums);

        for(int i = 0; i < nums.length ; i++){
            nums[i] = sorted[i];
        }
        
    }

    private static int[] countsort(int[] arr){

        int n = arr.length;
        // if(n==0){
        //     return new int[0];
        // }        

        int maxval = arr[0];
        for(int i = 0 ; i < n; i++){
            if(arr[i] > maxval){
                maxval =arr[i];
            }
        }

        int[] cntarr = new int[maxval+1];
        // for(int i = 0; i < maxval ; i++){
        //     cntarr[i] = 0;
        // }

        for(int i = 0; i < n ; i++){
            cntarr[arr[i]]++;
        }

        for(int i = 1; i <= maxval; i++){
            cntarr[i] += cntarr[i-1];
        }

        int[] ans = new int[n];
        for(int i = n-1; i >= 0; i--){
            int v = arr[i];
            ans[cntarr[v] -1] = v;
            cntarr[v]--;
        }

        return ans;
    }
}