class MinStack {
    public Stack<Integer> stack;
    public Stack<Integer> minStack;
    public MinStack() {
     stack = new Stack<Integer>();
     minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(val <= getMin()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int p = Integer.MAX_VALUE;
        if(!stack.isEmpty()){
            p = stack.pop();
        }
        if(p == getMin()){
            minStack.pop();
        }
    }
    
    public int top() {
            return stack.peek();
    }
    
    public int getMin() {
     if(minStack.isEmpty()){
        return Integer.MAX_VALUE;
      }
      return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */