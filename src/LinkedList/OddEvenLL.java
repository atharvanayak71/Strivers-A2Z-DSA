package LinkedList;

public class OddEvenLL {
    static ListNode head;
    static ListNode tail;

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode oddEvenList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while(even!= null && even.next!= null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        OddEvenLL lol = new OddEvenLL();
        lol.oddEvenList(head);

        while(head!= null){
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("END");
    }
}
