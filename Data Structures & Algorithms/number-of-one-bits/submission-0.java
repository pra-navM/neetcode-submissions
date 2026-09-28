class Solution {
    public int hammingWeight(int n) {
        int mask = 1;
        int counter = 0;

        for(int i=0; i<32;i++){
            if((mask & n)==1){
                counter++;
            }
            n/=2;
        }
        return counter;
        
    }
}
