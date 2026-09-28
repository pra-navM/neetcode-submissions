

public class Solution {
    
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        
        Stack<Integer> stack = new Stack<>(); 

        
        for (int i = 0; i < n; i++) {
            int currentTemp = temperatures[i];
            
            while (!stack.isEmpty() && currentTemp > temperatures[stack.peek()]) {
                
                int prevIndex = stack.pop();
                
                
                res[prevIndex] = i - prevIndex; 
            }
            
            
            stack.push(i);
        }
        
        // Days remaining in the stack (where no warmer day was found) remain 0, 
        // which is the initialized value of the res array.
        return res;
    }
}