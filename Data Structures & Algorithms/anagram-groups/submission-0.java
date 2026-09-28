class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> h = new HashMap<>();
        for(String s : strs){
            int[] freq = new int[26];
            for(char c : s.toCharArray()){
                freq[c-'a']++;
            }
            String sfreq = Arrays.toString(freq);
            if(!h.containsKey(sfreq)){
                h.put(sfreq, new ArrayList<>());
            }
            h.get(sfreq).add(s);
        }
        return new ArrayList<>(h.values());
         
        

    





    }


    



}
