class Solution {
    public int splitArray(int[] nums, int k) {
          if(nums.length < k) return -1;
        
        int low = getMax(nums);
        int high = getTotal(nums);
        int ans = -1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            int noOfSubarrays = FindSubArray(nums, mid);
            
            if(noOfSubarrays <= k){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public int getMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max(i, max);
        }
        return max;
    }
    public int getTotal(int arr[]){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
    public int FindSubArray(int arr[], int maxSum){
        int countSubArray = 1;
        int currSum = 0;
        for(int i=0; i<arr.length; i++){
            if(currSum + arr[i] <= maxSum){
                currSum += arr[i];
            }else{
                countSubArray++;
                currSum = arr[i];
            }
        }
        return countSubArray;
    }
    }
