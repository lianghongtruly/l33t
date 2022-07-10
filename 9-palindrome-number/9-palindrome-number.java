class Solution {
    public boolean isPalindrome(int x) {
        int temp = x; 
        int remainder;
        int sum = 0;//used to store reversed

        while(x > 0){
            remainder = x % 10;
            sum = (sum * 10 ) + remainder;
            x = x/10;
            System.out.println(sum);
        }
        if(sum == temp)
            return true;
        else
            return false;
    }
}