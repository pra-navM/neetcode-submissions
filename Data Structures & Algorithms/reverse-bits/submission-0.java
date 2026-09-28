class Solution {
    public int reverseBits(int n) {
        int mask = 1;

        int output = 0;

        for(int i=0; i<32; i++){
            int bit = ((n>>i)&mask);
            output+= (bit<<(31-i));
        }
        return output;
        
    }
}
