class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        HashMap<Character,Integer> counter = new HashMap <>();

        for(char c : s.toCharArray()){
            if(counter.containsKey(c)){
                counter.put(c, counter.get(c)+1);
            }
            else counter.put(c, 1);
        }

        for(char c : t.toCharArray()){
            if(!counter.containsKey(c)){
                return false;
            }
            if(counter.get(c)>0) counter.put(c, counter.get(c)-1);
            else return false;
        }

        for(int i : counter.values()){
            if(i!=0) return false;
        }
        return true;

    }
}
