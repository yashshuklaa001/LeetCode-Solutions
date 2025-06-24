class Solution {
    public int trap(int[] height) {
        // int water=0;
        // //min(left.right)
        // for(int i=0;i<height.length;i++){
        //     int leftMax=0;
        //     int rightMax=0;
        //     for(int j=0;j<=i;j++){
        //         leftMax=Math.max(leftMax,height[j]);
        //     }
        //     for(int j=i;j<height.length;j++){
        //         rightMax=Math.max(rightMax,height[j]);
        //     }
        //     water = water+Math.min(leftMax,rightMax)-height[i];
        // }
        // return water;

        int left=0;
        int right=height.length-1;
        int water=0;
        int leftMax=0;
        int rightMax=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>leftMax){
                    leftMax=height[left];
                }
                else{
                    water+=leftMax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rightMax){
                    rightMax=height[right];
                }
                else{
                    water+=rightMax-height[right];
                }
                right--;
            }
        }
        return water;
    }
}