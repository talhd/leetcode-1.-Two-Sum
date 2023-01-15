class Solution {
    public String longestCommonPrefix(String[] strs) {
     /*
     * Constraints:
       1 <= strs.length <= 200
       0 <= strs[i].length <= 200
       strs[i] consists of only lowercase English letters.
     * */
        if (strs.length == 1){
            return strs[0];
        }else {
            String firstWord = strs[0];
            int pivot = 0;
            int limit = Integer.MAX_VALUE;
            for(int i = 1 ;i<strs.length;i++){
                for(int j = 0;j<strs[i].length();j++){
                    if (j < firstWord.length() && strs[i].charAt(j) == firstWord.charAt(j)){
                        pivot++;
                    }else{
                        break;
                    }
                }
                if(pivot<limit){
                    limit = pivot;
                }
                pivot = 0;
            }
            if(limit != Integer.MAX_VALUE){
                return strs[0].substring(0,limit);
            }else{
                return "";
            }
        }

        
    }
}
