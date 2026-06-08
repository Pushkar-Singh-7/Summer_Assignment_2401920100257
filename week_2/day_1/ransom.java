class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0;i<ransomNote.length();i++){
            char currChar = ransomNote.charAt(i);
            String currCharStr = String.valueOf(currChar);
            if(!magazine.contains(currCharStr)){
            return false;
        }
        }
        return true;
    }
}
