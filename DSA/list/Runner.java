package DSA.list;


public class Runner {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(25);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insertAtStart(5);
        list.show();
    }
}
