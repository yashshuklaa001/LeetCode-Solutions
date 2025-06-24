class Solution {
    public int maxArea(int[] height) {
    int i=0;
    int j=height.length-1;
    int max=0;
    while(i<j){
        int h = Math.min(height[i],height[j]);
        int w = j-i;
        int a = h*w;
        max=Math.max(a,max);
        if(height[i]<height[j]){
            i++;
        }else{
            j--;
        }
    }
    return max;
    // int max=0;
    // for(int i=0;i<height.length;i++){
    //     for(int j=i+1;j<height.length;j++){
    //         int h=Math.min(height[i],height[j]);
    //         int w = j-i;
    //         int a=h*w;
    //         max=Math.max(a,max);
    //     }
    // }
    // return max;
    }
}