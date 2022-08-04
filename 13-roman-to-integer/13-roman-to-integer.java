class Solution {
    public int romanToInt(String s) {
        int n = s.length()-1;
        // System.out.println("n = "+ n);

        
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        // System.out.println("char = "+ s.charAt(n));
        int result = map.get(s.charAt(n));
        for(int i = n-1; i >= 0; i--){
            // System.out.println("i = " + i);
            char current = s.charAt(i);
            // System.out.println("current = " + current);
            char previous = s.charAt(i + 1);
            // System.out.println("previous = " + previous);
            // System.out.println("result: = " + result);
            if(map.get(previous) <= map.get(current)){
                result += map.get(current);
                // System.out.println("if result: = " + result);
            }
            else{
                result -= map.get(current);
                // System.out.println("else result: = " + result);
            }
        }
        return result;
    }
}
