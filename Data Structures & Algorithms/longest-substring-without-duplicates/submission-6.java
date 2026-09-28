class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Set<Character> charSet = new HashSet<>();
        
        // The right pointer, 'right', implicitly controls the loop
        for (int right = 0; right < s.length(); right++) {
            // If the character at 'right' is ALREADY in the set, 
            // it means we have a duplicate. We must shrink the window 
            // from the left until the duplicate is removed.
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            
            // Now the window is valid, so we add the new character at 'right'
            charSet.add(s.charAt(right));
            
            // Update the maximum length
            // The current window length is (right - left + 1)
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}