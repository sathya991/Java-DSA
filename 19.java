/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
          ListNode temp = head;
    int count = 0;
    while(temp != null){
      count++;
      temp = temp.next;
    }
    if(count == 1){
        head = null;
        return head;
    }
    if(count == n){
      head.val = head.next.val;
      head.next = head.next.next;
      return head;
    }
    count = count-n;
    temp = head;


    while(count>1){
      temp = temp.next;
      count--;
    }
    temp.next = temp.next.next;
    return head;
    }
}