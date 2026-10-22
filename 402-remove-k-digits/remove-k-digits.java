

class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if (k == n) {
            return "0";
        }

        Deque<Character> stack = new ArrayDeque<>();

       
        for (int i = 0; i < n; i++) {
            char ch = num.charAt(i);
            while (!stack.isEmpty() && k > 0 && stack.peekLast() > ch) {
                stack.pollLast();
                k--;
            }
            stack.offerLast(ch);
        }

        
        while (k > 0 && !stack.isEmpty()) {
            stack.pollLast();
            k--;
        }

      
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;

        while (!stack.isEmpty()) {
            char ch = stack.pollFirst();
            if (leadingZero && ch == '0') {
                continue; 
            }
            leadingZero = false;
            sb.append(ch);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
} 
    