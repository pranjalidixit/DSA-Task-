class Solution {
    public boolean lemonadeChange(int[] bills) {
        int a=0;
        int b=0;
        for(int bill : bills){
            if(bill==5){
                a++;
            }
            else if(bill==10){
                --a;
                ++b;
            }
            else if(b>0){
                --a;
                --b;
            }
            else{
                a-=3;
            }
            if(a<0){
                return false;
            }
        }
        return true;
    }
}