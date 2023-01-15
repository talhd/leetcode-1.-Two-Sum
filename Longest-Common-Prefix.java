class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        String firstWord=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(firstWord) != 0){
                firstWord=firstWord.substring(0,firstWord.length()-1);
            }
        }
        return firstWord;
}
}
