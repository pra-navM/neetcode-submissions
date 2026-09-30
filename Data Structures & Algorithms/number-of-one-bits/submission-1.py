class Solution:
    def hammingWeight(self, n: int) -> int:
        
        out = 0
        while n>0:
            if n%2==1:
                out+=1
            n//=2
        
        return out


# 0111 7
# 0011 3r1
# 0001 1r1


