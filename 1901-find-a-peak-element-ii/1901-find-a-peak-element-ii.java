class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int maxCol=0;
            for(int j=1;j<m;j++){
                if(mat[mid][j]>mat[mid][maxCol])
                    maxCol=j;
            }
            int up=(mid-1>=0)?mat[mid-1][maxCol]:-1;
            int down=(mid+1<n)?mat[mid+1][maxCol]:-1;
            if(mat[mid][maxCol]>up&&mat[mid][maxCol]>down)
                return new int[]{mid,maxCol};
            if(mat[mid][maxCol]<down) low=mid+1;
            else high=mid-1;
        }
        return new int[]{-1,-1};
    }
}