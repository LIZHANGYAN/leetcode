package primary_tutorial.linkedlist;

import java.util.Scanner;

/**
 * 删除链表的倒数第N个节点，并返回链表的头节点
 */
public class DelNthNodeFromEnd {


    static ListNode removeNthFromEnd(ListNode head, int n){

        if(head == null || n == 0)
            return head;
        ListNode myHead = new ListNode(0);
        myHead.next = head;
        ListNode temp1 = myHead;
        ListNode temp2 = myHead;
        for (int i = 0; i < n; i++) {
            temp1 = temp1.next;
        }
        while(temp1.next!= null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;

        return myHead.next;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            ListNode head = ListNode.createLinkedList(array);
            int k = in.nextInt();
            ListNode temp = removeNthFromEnd(head.next, k);
            while (temp.next != null){
                System.out.print(temp.val + "--->");
                temp = temp.next;
            }
            System.out.println(temp.val);
        }
    }
}
