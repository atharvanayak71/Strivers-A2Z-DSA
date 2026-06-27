package LinkedList;

public class MiddleOfLinkedList {
    static ListNode head;
    static ListNode tail;
    static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data = data;
        }
        public ListNode(int data, ListNode next){
            this.data = data;
            this.next = next;
        }
    }
    public ListNode middleNode(){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        }

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);


        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = null;

        MiddleOfLinkedList lol = new MiddleOfLinkedList();
        System.out.println(lol.middleNode().data);
    }
}
