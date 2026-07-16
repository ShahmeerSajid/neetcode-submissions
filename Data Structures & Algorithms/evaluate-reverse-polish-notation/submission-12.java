class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            String token = tokens[i];

            if (!token.equals("+") &&
                !token.equals("-") &&
                !token.equals("*") &&
                !token.equals("/")) {

                stack.push(Integer.parseInt(token));
            }

            else {
                int rightOperand = stack.pop();
                int leftOperand = stack.pop();

                int result = 0;

                if (token.equals("+")) {
                    result = leftOperand + rightOperand;
                }

                else if (token.equals("-")) {
                    result = leftOperand - rightOperand;
                }

                else if (token.equals("*")) {
                    result = leftOperand * rightOperand;
                }

                else if (token.equals("/")) {
                    result = leftOperand / rightOperand;
                }

                stack.push(result);
            }
        }

        return stack.pop();

    }
}
