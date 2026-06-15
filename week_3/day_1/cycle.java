public class Solution {
    public boolean hasCycle(ListNode head) {
      HashSet<ListNode>usedNodes = new HashSet<>();
      ListNode current = head;
      while(current!=null){
        if(usedNodes.contains(current)){
            return true;
        }
        usedNodes.add(current);
        current=current.next;
      } 
      return false;
    }
}
