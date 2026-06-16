package LinkedList;

public class InsertHead {
    static Node head;
    static Node tail;
    static int size = 0;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.next = next;
            this.data = data;
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
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        InsertHead list = new InsertHead();

        list.insertHead(10);
        list.insertHead(30);
        list.insertHead(77);

        list.display();
    }
}
