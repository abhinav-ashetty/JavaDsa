package LinkedList;

public class LLL {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void print(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node curr=head;
        Node prev = null;
        Node temp;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev= curr;
            curr= temp;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LLL list = new LLL();
        list.addFirst("hi");
        list.addFirst("my");
        list.addLast("abhinav");
        list.print();
        list.reverse();
        list.print();

    }
}
