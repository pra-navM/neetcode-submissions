class Solution {
    public int uniquePaths(int m, int n) {

        //return (m+n) C n;

        m--;
        n--;
        long f1 = 1;
        for(int i=1; i<=(m+n); i++){
            f1 *= i;
        }
        long f2 = 1;
        for(int i=1; i<=(m); i++){
            f2 *= i;
        }
        long f3 = 1;
        for(int i=1; i<=(n); i++){
            f3 *= i;
        }
        return (int) (f1/(f3*f2));
        
        
    }
}
