package DSA.list;

public class LinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node(data);
        if(head == null){
            node.next = head;
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void insertAtStart(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void show(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

}
