package LinkedList;
import java.util.Stack;
public class PalindromeLL {
    ListNode head;
    ListNode tail;
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
        }
        public ListNode(int data, ListNode next){
            this.val = data;
            this.next = next;
        }
    }
    public boolean isPalindrome(ListNode head){
        Stack<Integer> stack = new Stack<>();

        ListNode temp = head;
        while(temp!=null){
            stack.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while(temp!=null){
            if(temp.val != stack.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        PalindromeLL lol = new PalindromeLL();
        System.out.println(lol.isPalindrome(head));
    }
}
