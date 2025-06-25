class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] isVisited= new boolean[nums.length];
        List<Integer> smallList = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        helper(nums,smallList,finalList,isVisited);
        System.out.println(finalList);
        return finalList;

    }
    public void helper(int nums[],List<Integer> smallList, List<List<Integer>> finalList,boolean []isVisited){
        if(nums.length==smallList.size()){
            if(!finalList.contains(smallList)){
            finalList.add(new ArrayList(smallList));
            }
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(isVisited[i]==false){
                smallList.add(nums[i]);
                isVisited[i]=true;
                helper(nums,smallList,finalList,isVisited);
                smallList.remove(smallList.size()-1);
                isVisited[i]=false;
            }
        }
    }
}