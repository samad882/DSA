class MinStack {

   
        private static class Element{
            int val;
            int min;
        Element(int val,int min){
            this.val=val;
            this.min=min;
        }
        }
    private Stack<Element> stack;
    public MinStack(){
        stack=new Stack<>();
    }
    
    public void push(int value) {
        if(stack.isEmpty()){
            stack.push(new Element(value,value));
        }else{
            int currentmin=Math.min(value,stack.peek().min);
            stack.push(new Element(value, currentmin));

        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().val;

    }
    
    public int getMin() {
        return stack.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */