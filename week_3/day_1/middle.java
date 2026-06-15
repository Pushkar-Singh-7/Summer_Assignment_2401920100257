class Solution {
    public ListNode middleNode(ListNode head) {
        int length =0;
        ListNode str= head;
while (str!=null)
{
    length++;
str=str.next;
}
for(int i=0;i<length/2;i++){
    head=head.next;
}
return head;
    }
}
