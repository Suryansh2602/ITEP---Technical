class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Interger> map = new HashMap<>();

        for(int i =0; i<nums.length ; i++){
            map.put(nums[i],i);
        }

        for(int i = 0 ; i<nums.length; i++){
            int num = num[i];
            int remaining = target - num ;
            if(map.containsKey(rem)){
                int index = map.get(rem);
                return new int[]{i};
            }
        }
    }
}