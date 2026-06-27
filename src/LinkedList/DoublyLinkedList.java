package LinkedList;

public class DoublyLinkedList {
    static Node head;
    static Node tail;

    static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
        public Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    public void Delete(Node current){
        current.prev.next = current.next;
        current.next.prev = current.prev;
    }
    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(8);
        Node fourth = new Node(9);
        Node fifth = new Node(3);

        head = first;
        first.prev = null;
        first.next = second;
        second.prev = first;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;
        fifth.next = null;

        DoublyLinkedList lol = new DoublyLinkedList();
        lol.Display();
        lol.Delete(third);
        lol.Display();

    }
}
