class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums , 0 , nums.length -1);
        return nums;
    }

    private void mergesort(int[] arr, int start, int end){
        if(start >= end) return;

        int mid = start + (end - start)/2;
        mergesort(arr, start , mid);
        mergesort(arr, mid + 1 , end);
        merge(arr, start, mid, end);
    }

    private void merge(int[] arr, int start, int mid, int end){

        int left = mid - start + 1;
        int right = end - mid;

        int[] leftpart = new int[left];
        int[] rightpart = new int[right];


        System.arraycopy(arr, start , leftpart , 0 , left);
        System.arraycopy(arr, mid + 1 , rightpart , 0 , right);

        int i = 0, j = 0;
        int k = start;

        while( i < left && j < right){
            if(leftpart[i] < rightpart[j]){
                arr[k] = leftpart[i];
                i++;
            }
            else{
                arr[k] = rightpart[j];
                j++;
            }
            k++;
        }

        while(i < left){
            arr[k++] = leftpart[i++];
        }

        while(j < right){
            arr[k++] = rightpart[j++];
        }

    }
}