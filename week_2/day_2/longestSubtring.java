class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        int l=0;
        for (int j=0;j<s.length();j++){
            int duplicateIndex = s.indexOf(s.charAt(j),l);
            if(duplicateIndex < j){
                l = duplicateIndex + 1;
            }
            maxLength = Math.max(maxLength,j-l+1);
        }
        return maxLength;
    }
}
