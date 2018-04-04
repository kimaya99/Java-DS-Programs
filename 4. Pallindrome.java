class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if(x<10)
            return true;
        int rev = x;
        int sum =0;
        while(rev!=0){
            sum = sum*10 + rev%10;
            rev = rev/10;
        }
       return (sum==x) ;    
    }
}
