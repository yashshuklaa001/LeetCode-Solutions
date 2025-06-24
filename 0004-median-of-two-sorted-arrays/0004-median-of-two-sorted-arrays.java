class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int arr[]= new int [m+n];
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[i+m]=nums2[i];
        }
        Arrays.sort(arr);
        int len = arr.length;
        int mid = len/2;
        double result =0;
        if(len%2==0){
            result=(arr[mid]+arr[mid-1])/2.0;
        }else{
            result=arr[mid];
        }
        return result;
    }
}