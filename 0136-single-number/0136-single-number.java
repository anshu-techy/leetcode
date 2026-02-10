class Solution {
    public int singleNumber(int[] nums) {
        int values = 0;
        for(int i= 0; i<nums.length; i++){
            values = values ^ nums[i];

        }
        return values ;
        

        
    }
}