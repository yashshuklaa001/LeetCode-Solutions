class Solution {
    // boolean isVowel(char ch){
    //     return "AEIOUaeiou".indexOf(ch)>=0;
    // }
    // public String reverseVowels(String s) {
    //     char a[]= s.toCharArray();
    //     int i = 0;
    //     int j=a.length-1;
    //     while(i<=j){
    //         if(!isVowel(a[i])){
    //             i++;
    //         }
    //         else if(!isVowel(a[j])){
    //             j--;
    //         }else{
    //             char temp = a[i];
    //             a[i]=a[j];
    //             a[j]=temp;
    //             i++;
    //             j--;
    //         }
    //     }
    //     return new String(a);
    private boolean isVowel(char ch){
        return "AEIOUaeiou".indexOf(ch)>=0;
    }
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            while(i<j && !isVowel(ch[i])) i++;
            while(i<j && !isVowel(ch[j])) j--;
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}