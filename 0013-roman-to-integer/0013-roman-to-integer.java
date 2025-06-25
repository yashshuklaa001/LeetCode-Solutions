// class Solution {
//     public int romanToInt(String s) {
//         Map<Character, Integer> romanMap = new HashMap<>();
//         romanMap.put('I', 1);
//         romanMap.put('V', 5);
//         romanMap.put('X', 10);
//         romanMap.put('L', 50);
//         romanMap.put('C', 100);
//         romanMap.put('D', 500);
//         romanMap.put('M', 1000);

//         int total = 0;

//         for (int i = 0; i < s.length(); i++) {
//             int current = romanMap.get(s.charAt(i));
//             int next = (i + 1 < s.length()) ? romanMap.get(s.charAt(i + 1)) : 0;

//             if (current < next) {
//                 total -= current;
//             } else {
//                 total += current;
//             }
//         }

//         return total;
//     }
// }
class Solution {
    public int romanToInt(String s) {
        int ans=0,num=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I':
                  num=1;
                  break;
                case 'V':
                  num=5;
                  break;
                case 'X':
                  num=10;
                  break;
                case 'L':
                  num=50;
                  break;
                case 'C':
                  num=100;
                  break;
                case 'D':
                  num=500;
                  break;
                case 'M':
                  num=1000;
                  break;
            }
            if(4 * num < ans){
                ans-=num;
            }
            else{
                ans+=num;
            }
        }
        return ans;
        
    }
}
