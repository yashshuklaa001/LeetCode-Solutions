class Solution {
    public String reverseWords(String s) {
        String[] a=s.trim().split("\\s+");
        ArrayList<String> list= new ArrayList<>();

        for(int i=0;i<a.length;i++){
            list.add(a[i]);
        }
        Collections.reverse(list);
        return String.join(" ",list);
    }
}