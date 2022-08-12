class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        int startIndex = 0;
        int endIndex = 0;
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i <= n; i++){
            if(i == n || s.charAt(i) == ' '){
                endIndex = i-1;
                while(endIndex >= startIndex){
                    result.append(s.charAt(endIndex));
                    endIndex--;
                }
                result.append(" ");
                startIndex = i+1;
            }
        }
        return result.toString().trim();
        
    }
}