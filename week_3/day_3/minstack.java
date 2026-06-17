class MinStack {
private Stack<Integer> stack;
private Stack<Integer> MinStack;
    public MinStack() {
        stack = new Stack<>();
        MinStack = new Stack<>();
    }
    
    public void push(int value) {
      stack.push(value);
      if (MinStack.isEmpty()||value<=MinStack.peek()){
        MinStack.push(value);
      }  
    }
    
    public void pop() {
        if(stack.peek().equals(MinStack.peek())){
            MinStack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return MinStack.peek();
    }
}
