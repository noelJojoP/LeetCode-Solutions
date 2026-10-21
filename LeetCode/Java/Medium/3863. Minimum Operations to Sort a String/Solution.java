class Solution {
    public int minOperations(String s) {
         int n = s.length();
        
        // 1. Base cases for very short strings
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return (s.charAt(0) <= s.charAt(1)) ? 0 : -1;
        }
        
        // Create a perfectly sorted version to compare against
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sortedS = new String(charArray);
        
        // 2. Case 0: Already fully sorted
        if (s.equals(sortedS)) {
            return 0;
        }
        
        // Find the absolute smallest and largest characters
        char minChar = sortedS.charAt(0);
        char maxChar = sortedS.charAt(n - 1);
        
        // 3. Case 1: One of the edges is already in its perfect final position
        if (s.charAt(0) == minChar || s.charAt(n - 1) == maxChar) {
            return 1;
        }
        
        // 4. Case 2 check: Look at the middle characters. 
        // If there is ANY minChar or maxChar in the middle, it takes 2 operations.
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == minChar || s.charAt(i) == maxChar) {
                return 2; 
            }
        }
        
        // 5. Case 3: The ultimate deadlock where max is only at the front 
        // and min is only at the back (like "cba").
        return 3;
    }
}