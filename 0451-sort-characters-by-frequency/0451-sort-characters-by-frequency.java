class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freqmap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char i:s.toCharArray()){
            freqmap.put(i,freqmap.getOrDefault(i,0)+1);
        }
        List<Character>[] Buckets = new List[s.length()+1];
        for(char c:freqmap.keySet()){
            int freq = freqmap.get(c);
            if(Buckets[freq]==null){
                Buckets[freq]=new ArrayList<>();
            }
            Buckets[freq].add(c);
        }
        for(int i=Buckets.length-1;i>=0;i--){
            if(Buckets[i]!=null){
                for(char c:Buckets[i]){
                    for(int j=0;j<i;j++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}