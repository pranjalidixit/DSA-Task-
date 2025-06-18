class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for(int i = 0; i<nums.length; ++i){
            if(nums[i]<pivot){
                less.add(nums[i]);
            }
            else if(nums[i] == pivot){
                equal.add(nums[i]);
            }
            else if(nums[i] > pivot){
                greater.add(nums[i]);
            }
        }
        int[] result = new int[nums.length];
        int index = 0;
        for(int i = 0; i<less.size(); ++i){
            result[index++] = less.get(i);
        }
        for(int i=0; i<equal.size(); ++i){
            result[index++] = equal.get(i);
        }
        for(int i = 0 ; i<greater.size(); ++i){
            result[index++] =  greater.get(i);
        }
        return result;       
    }
}