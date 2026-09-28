class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<String>();
        StringBuilder sb = new StringBuilder(str);
        
        while(sb.length()>0){
            int index=0;
            while(sb.charAt(index) != '#'){
                index++;
            }
            int length = Integer.parseInt(sb.substring(0,index)); 
            sb.delete(0,index+1);
            String s = sb.substring(0,length);
            sb.delete(0,length);
            output.add(s);
        }
        return output;
    }
}
