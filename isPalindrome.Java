class Solution {
    public boolean isPalindrome(int x) {
            String num = String.valueOf(x);
            int i = num.length()-1;
            int j = 0;
            while(j<i){
                if (num.charAt(i) != num.charAt(j)){
return false;
                }
                i--;
                j++;
            }
            return true;
        }
}
