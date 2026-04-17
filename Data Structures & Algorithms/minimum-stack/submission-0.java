class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minimum;

    public MinStack() {
        stack = new Stack<>();
        minimum = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minimum.isEmpty() || val <= minimum.peek()) {
            minimum.push(val);
        }
    }
    
    public void pop() {
        int value = stack.pop();
        if (value == minimum.peek()) {
            minimum.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minimum.peek();
    }
}
