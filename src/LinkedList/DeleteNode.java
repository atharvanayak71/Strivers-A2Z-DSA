package LinkedList;

public class DeleteNode {
    Node head;
    Node tail;
    int size = 0;

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
    public int deleteFirst(){
        int value = head.data;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return value;
    }
    public int deleteLast(){
        if (size <=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int value = tail.data;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.data;
        prev.next = prev.next.next;
        size--;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public static void main(String[] args) {
        DeleteNode list = new DeleteNode();
        list.insertHead(69);
        list.insertHead(54);
        list.insertHead(23);
        list.insertHead(12);
        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}
