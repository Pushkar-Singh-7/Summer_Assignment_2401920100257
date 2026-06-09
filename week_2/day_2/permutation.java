class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int  n1=s1.length();
        int n2=s2.length();
        if(n1>n2){
            return false;
        }
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        String sorts1 = new String(s1Array);
        for(int i=0;i<n2-n1;i++){
        String sub = s2.substring(i,i+n1);
        char[]subArray=sub.toCharArray();
        Arrays.sort(subArray);
        String sortsub = new String(subArray);
        if (sorts1.equals(sortsub)){
            return true;
        }
        }
        return false;
        
    }
}
