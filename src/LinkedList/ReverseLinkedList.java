package LinkedList;
import java.util.Stack;
public class ReverseLinkedList {
    static ListNode head;
    static ListNode tail;

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int data) {
            this.val = data;
        }

        public ListNode(int data, ListNode next) {
            this.val = data;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        temp = head;

        while (temp != null) {
            temp.val = stack.pop();
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ReverseLinkedList sol = new ReverseLinkedList();
        head = sol.reverseList(head);


        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}