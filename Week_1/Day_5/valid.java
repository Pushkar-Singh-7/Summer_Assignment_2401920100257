class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
        {
            return true;
        }
        int st=0;
        int l=s.length()-1;
        while(st<=l)
        {
            char stchar=s.charAt(st);
            char lchar=s.charAt(l);
            if(!Character.isLetterOrDigit(stchar)){
                st++;
            }
            if(!Character.isLetterOrDigit(lchar)){
                l++;
         }
         else{
            if(Character.toLowerCase(stchar)!=Character.toLowerCase(lchar)){}
            return false;
         }
    
        st--;
        l--;
        }
     }
    
    return true;
    
 }
}
