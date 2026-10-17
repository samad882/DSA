class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     Map<Integer,Integer>next=new HashMap<>();   
    Stack <Integer> s=new Stack<>();
    for(int i=nums2.length-1;i>=0;i--){
    int current=nums2[i];
    
while(!s.isEmpty()&& s.peek()<=current){
s.pop();}
if(s.isEmpty()){
    next.put(current,-1);
}
else{
    next.put(current,s.peek());
}
s.push(current);
}
int[] result= new int [nums1.length];
for(int j=0;j<nums1.length;j++){
    result[j]=next.getOrDefault(nums1[j], -1);
}
    
return result;
}
    }






    