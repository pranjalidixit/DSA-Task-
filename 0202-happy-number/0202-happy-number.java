class Solution {
    public boolean isHappy(int n) {
        Set<Integer> a = new HashSet<>();
        while(n != 1 && !a.contains(n)){
            a.add(n);
            int x = 0;
            while(n != 0){
                x += (n%10) * (n%10);
                n /= 10;
            }
            n = x;
        }
        return n == 1;
    }
}