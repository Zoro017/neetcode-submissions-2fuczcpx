class Solution {
    public int[] topKFrequent(int[] nums, int k) {

         List<Integer>[] arr = new List[nums.length + 1];
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();

        for(int n : nums){
            freq.put(n , freq.getOrDefault(n,0) +1);
        }

        for(int key : freq.keySet()){
            int freqno = freq.get(key);
            if(arr[freqno] == null){
                arr[freqno] = new ArrayList<>();
            }

            arr[freqno].add(key);
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = arr.length - 1; i >= 0 && ans.size() < k ; i--){
            if(arr[i] != null){
                ans.addAll(arr[i]);
            }
        }

        // int[] result = new int[k];
        // for (int i = 0; i < k; i++) {
        //     result[i] = ans.get(i);
        // }
        
        return ans.stream().mapToInt(i -> i).toArray();

        // return result;
    }
}