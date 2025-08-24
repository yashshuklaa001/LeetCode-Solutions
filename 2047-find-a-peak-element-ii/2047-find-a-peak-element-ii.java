class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int low=0;
        int high=col-1;
        while(low<=high){
            int mid=(low+high)/2;
            int maxRowIndex = FindMaxInRow(mat,mid);
            int left  = (mid - 1 >= 0)     ? mat[maxRowIndex][mid - 1] : -1;
            int right = (mid + 1 < col)    ? mat[maxRowIndex][mid + 1] : -1;
            if(mat[maxRowIndex][mid]>left && mat[maxRowIndex][mid]>right){
                return new int[]{maxRowIndex,mid};
            }else if(mat[maxRowIndex][mid]<left){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    public int FindMaxInRow(int mat[][],int col){
        int maxValue=-1;
        int n=mat.length;
        int index=-1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>maxValue){
                maxValue=mat[i][col];
                index=i;
            }
        }
        return index;
    }
}