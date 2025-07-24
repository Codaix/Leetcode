/*You are given two non-empty linked lists representing two non-negative integers. 
 The digits are stored in reverse order, and each of their nodes contains a single digit. 
 Add the two numbers and return the sum as a linked list.
 You may assume the two numbers do not contain any leading zero, except the number 0 itself. 

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]

Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/
 //Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode head = node;
        ListNode head1 = l1;
        ListNode head2 = l2;
        int carry = 0;
        while(head1!=null || head2!=null || carry !=0){
        int h1 = (head1!=null)? head1.val: 0;
        int h2 =(head2!=null)? head2.val : 0;
        int sum = h1+h2+carry;

        carry = sum/10;
        insertATEnd(head, sum%10);
        head = head.next;
        if(head1!= null)head1 = head1.next;
        if(head2!= null)head2 = head2.next;
        }
        return node.next;
    }
    ListNode insertATEnd(ListNode head, int val){
        ListNode node = new ListNode(val);
        if(head == null)return node;
        if(head.next == null){
            head.next = node;
            return head;
        }
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = node;
        return head;
    }
}
