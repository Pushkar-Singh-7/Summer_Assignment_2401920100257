class Solution {
    public boolean isPalindrome(ListNode head) {
    List<Integer>lists=new ArrayList<>();
    while(head!=null) {
        lists.add(head.val);
        head = head.next;
    }   
    int left = 0;
    int right = lists.size()-1;
    while(left<right){
    if (! lists.get(left).equals(lists.get(right))){
       return false;
       }  
        left ++;
        right ++;
    }
    return true;
    }
}
