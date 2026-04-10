class Solution {
public:
    void sortColors(vector<int>& nums) {
        
        vector<int> sorted = countsort(nums);

        for (int i = 0; i < nums.size(); i++) {
            nums[i] = sorted[i];
        }
    }

    private:
        vector<int> countsort(vector<int>& arr){

        int n = arr.size();        

        int maxval = arr[0];
        for(int i = 0 ; i < n; i++){
            if(arr[i] > maxval){
                maxval =arr[i];
            }
        }

        vector<int> cntarr(maxval+1,0);
        // for(int i = 0; i < maxval ; i++){
        //     cntarr[i] = 0;
        // }

        for(int i = 0; i < n ; i++){
            cntarr[arr[i]]++;
        }

        for(int i = 1; i <= maxval; i++){
            cntarr[i] += cntarr[i-1];
        }

        vector<int> ans(n);
        for(int i = n-1; i >= 0; i--){
            int v = arr[i];
            ans[cntarr[v] -1] = v;
            cntarr[v]--;
        }

        return ans;
    }

    
};