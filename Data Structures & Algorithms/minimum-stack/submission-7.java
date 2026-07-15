class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;  // kep track of min so far

    public MinStack() {
        stack = new Stack<> ();
        minStack = new Stack<> ();
    }
    
    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty()) {
            minStack.push(val);
        } 

        else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();

    }
}

// stack          minStack

//   1   ← top       1   ← minimum so far
//   7               2   ← minimum so far
//   2               2   ← minimum so far
//   5               5   ← minimum so far



// Time for each function is O(1);
// Space: O(n) because you're using two stacks that can each store up to n elements.