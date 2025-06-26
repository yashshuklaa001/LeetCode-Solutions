class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            if(map.containsKey(current)){
                int prev = map.get(current);
                if(i-prev<=k){
                    return true;
                }
            }
            map.put(current,i);
        }
        return false;
    }
}