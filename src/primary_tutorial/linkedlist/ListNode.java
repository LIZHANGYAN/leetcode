package primary_tutorial.linkedlist;

/**
 * 链表节点
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val){
        this.val = val;
    }


    public static ListNode createLinkedList(int[] array){
        ListNode head = new ListNode(array.length);
        ListNode tail = head;
        for (int i = 0; i < array.length; i++) {
            ListNode currentNode = new ListNode(array[i]);
            tail.next = currentNode;
            tail = currentNode;
        }

        return head;
    }
}
