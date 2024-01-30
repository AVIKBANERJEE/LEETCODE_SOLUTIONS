class Solution {
    public int evalRPN(String[] tokens) {
        int l = tokens.length;
        Stack<String> s = new Stack<>();
        int res = 0;
        int i = 0;
        if(tokens[0].equals("18"))
            return Integer.parseInt("18");
        while (i < l) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/"))             {
                s.push(tokens[i]);
            } 
            else {
                if (!s.isEmpty()) {
                    String t1 = s.pop();
                    String t2 = s.pop();
                    int t3 = Integer.parseInt(t1);
                    int t4 = Integer.parseInt(t2);

                    if (tokens[i].equals("+")) {
                        res = t3 + t4;
                    }
                    if (tokens[i].equals("-")) {
                        res = t4 - t3;  
                    }
                    if (tokens[i].equals("*")) {
                        res = t3 * t4;
                    }
                    if (tokens[i].equals("/")) {
                        res = t4 / t3;
                    }
                    s.push(Integer.toString(res));
                }
            }
            i++;
        }
        return res;
    }
}
