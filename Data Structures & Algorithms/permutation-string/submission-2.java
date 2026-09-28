
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> s1Map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> s2Map = new HashMap<>();
        int windowSize = s1.length();
        int l = 0; 

        for (int i = 0; i < windowSize; i++) {
            char c = s2.charAt(i);
            s2Map.put(c, s2Map.getOrDefault(c, 0) + 1);
        }

        if (s1Map.equals(s2Map)) return true;

        for (int r = windowSize; r < s2.length(); r++) {
            char newChar = s2.charAt(r); // Character entering the window
            char oldChar = s2.charAt(l); // Character leaving the window

            s2Map.put(newChar, s2Map.getOrDefault(newChar, 0) + 1);

            if (s2Map.get(oldChar) == 1) {
                s2Map.remove(oldChar);
            } else {
                s2Map.put(oldChar, s2Map.get(oldChar) - 1);
            }
            if (s1Map.equals(s2Map)) return true;
            l++;
            
        }

        return false; // No permutation found
    }
}
