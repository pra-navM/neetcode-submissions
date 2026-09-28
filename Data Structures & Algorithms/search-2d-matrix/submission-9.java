class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = -1;
        boolean found = false;
        int l = 0;
        int r = matrix.length-1;
        int numcols = matrix[0].length;
        int numrows = matrix.length;
        if((target<matrix[0][0])||(target>matrix[numrows-1][numcols-1])) return false;
        while(l<=r){
            m = (l+r)/2;
            if(target>matrix[m][0]){
                l = m+1;
            }
            else if(target<matrix[m][0]){
                r = m-1;
            }
            else{
                return true;
            }
        }
        
        int row = l-1;
        r = matrix[0].length-1;
        l = 0;
        while(l<=r){
            m = (l+r)/2;
            if(matrix[row][m]>target){
                r = m-1;
            }
            else if(matrix[row][m]<target){
                l = m+1;
            }
            else return true;
        }
        return false; 
    }
}
