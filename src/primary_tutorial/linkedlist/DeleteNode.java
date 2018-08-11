package primary_tutorial.linkedlist;

import java.util.Scanner;

/**
 * 删除链表中的节点
 */
public class DeleteNode {

    public static ListNode head;

    static void deleteNode(ListNode node){
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }

            head = ListNode.createLinkedList(array);
            int delN = in.nextInt();
            ListNode temp = head.next;
            while (temp.next != null){
                if(temp.val == delN)
                    break;
                temp = temp.next;
            }
            deleteNode(temp);
            temp = head.next;
            while (temp.next != null){
                System.out.print(temp.val + "--->");
                temp = temp.next;
            }
            System.out.println(temp.val);
        }
    }
}
