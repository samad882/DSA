class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque <Integer>stack= new ArrayDeque<>();
      int n=nums.length;
       int[] nexg=new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i%n]){
                stack.pop();

                }
                    
       if(i<n){
        nexg[i]=stack.isEmpty() ?-1 :stack.peek();

       }
      stack.push(nums[i%n]);  
    }
return nexg;
    }
}