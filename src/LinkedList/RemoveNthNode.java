package LinkedList;

public class RemoveNthNode {
    static ListNode head;
    static ListNode tail;

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(int n) {
        if (n == getSize()) {
            head = head.next;
            return head;
        }

        ListNode prev = getPrevNode(n);
        prev.next = prev.next.next;
        return head;
    }

    public ListNode getPrevNode(int n) {
        ListNode temp = head;

        for (int i = 0; i < (getSize() - n) - 1; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public int getSize() {
        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        return size;
    }

    public void printList() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        RemoveNthNode del = new RemoveNthNode();

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        // Connect the nodes
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        head = first;

        System.out.println("Original List:");
        del.printList();

        del.removeNthFromEnd(2);

        System.out.println("After Removing 2nd Node From End:");
        del.printList();
    }
}