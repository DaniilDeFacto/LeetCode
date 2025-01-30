//Given the head of a singly linked list, return the middle node of the linked list.
//
//If there are two middle nodes, return the second middle node.
//
//Constraints:
//
//The number of nodes in the list is in the range [1, 100].
//1 <= Node.val <= 100

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
