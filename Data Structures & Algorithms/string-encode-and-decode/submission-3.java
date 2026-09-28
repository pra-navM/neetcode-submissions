
class Solution {

    /*
    Example:
    encode(["neet", "code", "love", "you"]) -> "4:neet4:code4:love3:you"
    decode("4:neet4:code4:love3:you") -> ["neet", "code", "love", "you"]
    */

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append(":").append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> output = new LinkedList<>();
        int i = 0;

        while (i < str.length()) {
            // Find the position of the colon
            int colonIndex = str.indexOf(':', i);
            if (colonIndex == -1) break;

            // Extract the length of the next string
            int stringSize = Integer.parseInt(str.substring(i, colonIndex));

            // Extract the actual string using the length
            String decodedString = str.substring(colonIndex + 1, colonIndex + 1 + stringSize);
            output.add(decodedString);

            // Move the pointer forward
            i = colonIndex + 1 + stringSize;
        }

        return output;
    }
}
