class Solution:
    def isPalindrome(self, s: str) -> bool:
        lower = s.lower()
        alphalower = ""
        for c in lower:
            if c.isalnum():
                alphalower+=c
        out = True
        for i in range((len(alphalower)-1) // 2 + 1):
            if alphalower[i] != alphalower[len(alphalower)-1-i]:
                return False
        return True
        