class Solution {    
    public ArrayList<String> sa = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        int open = 0;
        int closed = 0;
        StringBuilder s = new StringBuilder();
        dfs(s,open,closed,n);
        return sa;
    }

    public void dfs(StringBuilder s, int open, int closed, int n){
        if(open==n && closed==n){
            sa.add(s.toString());
            return;
        }
        if(open<n){ //can add open parentheses
            s.append('(');
            dfs(s,open+1,closed,n);
            s.deleteCharAt(s.length() - 1);
        }
        if(closed<n && open>closed){ //can add closing parentheses
            s.append(')');
            dfs(s,open,closed+1,n);
            s.deleteCharAt(s.length() - 1);
        }
        return;
    }
}
