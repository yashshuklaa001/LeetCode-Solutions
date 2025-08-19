class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
    
        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                set2.add(i);
            }
        }
        int i=0;
        int a[] = new int[set2.size()];
        for(int j:set2){
            a[i++]=j;
        }
        return a;
    }
}