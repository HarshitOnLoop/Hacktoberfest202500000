class Solution {
    public boolean isPowerOfTwo(int n) {
      if(n<1){
        return false;
      }
        int a = n-1;
        if((n & a) == 0){
            return true; 

           //   n=16 a=n-1 15
           // 10000
           // 01111
           // 00000 when 16&15 =0; so it is in 2 power

        }
        else{
            return false;
        }
    }
}
