class Solution {
    public boolean isValid(String s) {
        Stack<Character> t = new Stack<>();
        t.push(s.charAt(0));
        HashMap<Character, Character> c = new HashMap<>();
        c.put(')','(');
        c.put(']','[');
        c.put('}','{');
        for(int i=1; i< s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ){
                t.push(s.charAt(i));
            }
            else{
                if(!t.empty()){
                    char popped = t.pop();
                    if (popped != c.get(s.charAt(i))){
                        return false;
                    }
                }
            }
        }
        if(t.empty()) return true;
        else return false;
    }
}
