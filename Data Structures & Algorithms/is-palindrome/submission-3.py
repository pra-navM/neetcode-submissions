class Solution:
    def isPalindrome(self, s: str) -> bool:
        out = ""
        for char in s.lower():
            if char.isalnum():
                out += char

        left = 0
        right = len(out) - 1
        while left < right:
            if out[left] != out[right]:
                return False
            left += 1
            right -= 1
        return True
        