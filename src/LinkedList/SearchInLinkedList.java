package LinkedList;

public class SearchInLinkedList {
    static Node head;
    static Node tail;

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
    public boolean Search(int key){
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node third = new Node(10);
        Node second = new Node(15, third);
        Node head = new Node(29, second);

        SearchInLinkedList lol = new SearchInLinkedList();
        System.out.println(lol.Search(17));
    }
}
