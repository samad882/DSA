class Solution {
    public int maxArea(int[] nums) {
       int left=0;
       int right=nums.length-1;
       int maxarea=0;
       while(left<right) {
int length=Math.min(nums[left],nums[right]);
     int width=(right-left);
      int area=length*width;
       maxarea=Math.max(area,maxarea);

       

       if(nums[left]>nums[right]){
        right--;
       }else{
        left++;
       }}
   return maxarea;
       }
  
    }

