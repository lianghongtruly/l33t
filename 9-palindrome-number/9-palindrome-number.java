class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        while(x > reversed){
            reversed = reversed * 10 + x % 10;
            x = x / 10;
            System.out.println("reversed: " + reversed);
            System.out.println("x: " + x);

        }
        return (x == reversed || x == reversed / 10);
    }
}