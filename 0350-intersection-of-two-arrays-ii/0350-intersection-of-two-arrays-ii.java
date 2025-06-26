class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            if(map.containsKey(i)&& map.get(i)>0){
                result.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int res[] = new int[result.size()];
        for(int i=0;i<result.size();i++){
            res[i]=result.get(i);
        }
        return res;
    }
}