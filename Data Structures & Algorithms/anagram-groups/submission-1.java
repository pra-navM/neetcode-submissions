class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> h = new HashMap<>();
        for(String str: strs){
            int[] freq = new int[26];
            for(int i=0; i<str.length(); i++){
                freq[str.charAt(i)-'a']++;
            }
            if(h.containsKey(Arrays.toString(freq))){
                ArrayList<String> a = h.get(Arrays.toString(freq));
                a.add(str);
                h.put(Arrays.toString(freq),a);
            }
            else{
                h.put(Arrays.toString(freq),new ArrayList<String>(Arrays.asList(str)));
            }
        }
        return new ArrayList<>(h.values());
    }
}
