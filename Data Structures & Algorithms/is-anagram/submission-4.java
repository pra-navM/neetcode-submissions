class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> h = new HashMap<>();

        // Count frequency of each character in s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            h.put(c, h.getOrDefault(c, 0) + 1);
        }

        // Subtract frequency using characters in t
        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            if (!h.containsKey(c) || h.get(c) == 0) {
                return false;
            }
            h.put(c, h.get(c) - 1);
        }

        // If all counts are zero, it's an anagram
        for (int count : h.values()) {
            if (count != 0) return false;
        }
        return true;
    }
}
