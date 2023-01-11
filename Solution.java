class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap =new HashMap<>();
        for (int index = 0;index<nums.length;index++){
            if (numMap.containsKey(target-nums[index])){
                return new int[] {numMap.get(target-nums[index]),index};
            }else {
                numMap.put(nums[index],index);
            }
        }
        return new int[] {};
    }
}
