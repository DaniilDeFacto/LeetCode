package org.training.easy;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode previousNode = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = previousNode;
            previousNode = head;
            head = nextNode;
        }
        return previousNode;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
