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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int s1 = size(l1);
    int s2 = size(l2);
    ListNode temp1 = l1;
    ListNode temp2 = l2;
    int sum = 0;
    ListNode finalLL = new ListNode(0);
    boolean first = true;
    while(temp1 != null && temp2 != null){
        if(s1 > s2){
           sum = temp1.val;
           temp1 = temp1.next; 
           s1--;
        }
        else if(s2 > s1){
            sum = temp2.val;
           temp2 = temp2.next; 
           s2--;
        }else{
            sum = temp1.val + temp2.val;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(first){
            finalLL.val = sum;
            finalLL.next = null;
            first = false;
        }
        else{
            ListNode temp = new ListNode(sum);
            temp.next = finalLL;
            finalLL = temp;
        }
        sum = 0;
    }
    if(size(finalLL) < 2){
        ListNode newTemp = finalLL;
        ListNode curNode = new ListNode(0);
        if(newTemp.val >= 10){
            curNode.val = 1;
            System.out.println(curNode.val);
        }else if(newTemp.val >= 1 && newTemp.val < 10){
            ListNode nextNode = new ListNode(newTemp.val);
            return nextNode;
        }
        else{
            ListNode nextNode = new ListNode(0);
            return nextNode;
        }
        ListNode nextNode = new ListNode(newTemp.val%10);
        System.out.println(nextNode.val);
        curNode.next = nextNode;
        return curNode;
    }
    first = true;
    ListNode newTemp = finalLL;
    ListNode finalResult = new ListNode(0);
    int carry = newTemp.val/10;
    ListNode head = newTemp;
    while(newTemp != null){
        if(first){
             if(newTemp.val >= 10){
             carry = 1;
            finalResult.val = newTemp.val%10;
       }else{
           carry = 0;
           finalResult.val = newTemp.val;
       }
            first = false;
        }
        else{
              ListNode curTemp = new ListNode(carry + newTemp.val);
       if(curTemp.val >= 10 || newTemp.val >= 10){
           carry = 1;
            curTemp.val = curTemp.val%10;
       }else{
           carry = 0;
       }
      curTemp.next = finalResult;
       finalResult = curTemp;
        }
    newTemp = newTemp.next;
    }
    ListNode tempp = finalResult;
    while(tempp != null){
        System.out.println(tempp.val);
        tempp = tempp.next;
    }
    head = finalResult;
    if(carry == 1){
        ListNode curTemp = new ListNode(1);
        curTemp.next = finalResult;
        head = curTemp;
    }
    return head;
    }

    public int size(ListNode temp){
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}