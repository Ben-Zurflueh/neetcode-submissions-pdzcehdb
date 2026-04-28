class MyStack {

    Deque<Integer> stack; 

    public MyStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int x) {
        stack.add(x);
    }
    
    public int pop() {
        return stack.pollLast();
    }
    
    public int top() {
        return stack.peekLast();
    }
    
    public boolean empty() {
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */