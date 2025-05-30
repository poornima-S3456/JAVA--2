public class Linkedlist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
       public static Node head;
    public static Node tail;

    public void addFirst(int data) {

        // step 1- create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2- newNode next - head
        newNode.next = head; // link

        // step 3 -head = newNode
        head = newNode;
    }

        public void addList(int data){

            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
tail.next = newNode;
tail = newNode;

}

public void print(){

    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+"-->");
        temp = temp.next;
    }
   System.out.println("null");

}

   

    public static void main(String args[]){
            
        Linkedlist obj = new Linkedlist();
        obj.print();
        obj.addFirst(4);
        obj.print();
        obj.addFirst(3);
        obj.print();
        obj.addFirst(2);
        obj.print();
        obj.addFirst(1);
        obj.print();

   

       
        
    }

}
