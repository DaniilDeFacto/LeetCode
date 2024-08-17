package org.training.Java.easy;

public class MiddleOfTheLinkedList {

public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

    public ListNode middleNode(ListNode head) {
        int count = 1;
        ListNode result = head;
        while (head.next != null) {
            head = head.next;
            count++;
            result = count % 2 == 0 ? result.next : result;
        }
        return result;
    }
}
