class Solution {
    public int characterReplacement(String s, int k) {
        int output = 0;
        //sliding window -> shrink the window when 
        //the number of replacements exceeds k.
        int left = 0;
        int mostfreq=0;
        HashMap<Character,Integer> h = new HashMap<>();
        for(int right=0; right<s.length(); right++){
            h.put(s.charAt(right),h.getOrDefault(s.charAt(right),0)+1);
            mostfreq = Math.max(mostfreq,h.get(s.charAt(right)));

            while((right-left + 1) - mostfreq > k){ // its valid
                h.put(s.charAt(left),h.get(s.charAt(left))-1); 
                left++;
            }
            output = Math.max(output,right-left+1);
        }
        return output;

        
    }

    
}
