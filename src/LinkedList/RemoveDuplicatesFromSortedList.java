package LinkedList;

public class RemoveDuplicatesFromSortedList {
    static ListNode head;
    static ListNode tail;
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
        }
        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public ListNode deleteDuplicates(ListNode head){
        ListNode temp = head;
        while(temp != null && temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            } else{
                temp = temp.next;
            }
        }
        return head;
    }
    public void printList() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList del = new RemoveDuplicatesFromSortedList();
        ListNode first = new ListNode(5);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(4);



        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        head = first;

        System.out.println("LIST BEFORE DELETION OF DUPLICATE NODES");
        del.printList();

        System.out.println("LIST AFTER DELETION OF DUPLICATE NODES");
        del.deleteDuplicates(head);
    }
}
