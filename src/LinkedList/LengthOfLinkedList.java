package LinkedList;

public class LengthOfLinkedList {
    static Node head;
    static Node tail;
    int size = 0;
static class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
    public void insertHead(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }
        size += 1;
    }
    public static int Length(){
    Node temp = head;
    int count = 0;
    while(temp!=null){
        count++;
        temp = temp.next;
    }
    return count;
    }

    public static void main(String[] args) {
        LengthOfLinkedList ll = new LengthOfLinkedList();
        ll.insertHead(45);
        ll.insertHead(23);
        System.out.println(Length());
    }

}
