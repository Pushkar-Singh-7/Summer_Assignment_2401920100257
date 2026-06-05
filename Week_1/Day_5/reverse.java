class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int l=0,rt=n-1;
        while(l<=rt)
        {
            char temp=s[l];
            s[l]=s[rt];
            s[rt]=temp;
            l++;
            rt--;
        }
    }
}
