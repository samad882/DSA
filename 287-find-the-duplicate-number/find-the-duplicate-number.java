class Solution {
    public int findDuplicate(int[] nums) {
     int slow=nums[0];
     int fast=nums[0];
     
     slow=nums[slow];
     fast=nums[nums[fast]];
    while(slow!=fast){
        slow=nums[slow];
        fast=nums[nums[fast]];

    }
   int  ptr=nums[0];
     while(ptr!=fast){
        ptr=nums[ptr];
        fast=nums[fast];
     }
   return ptr;
    }
}