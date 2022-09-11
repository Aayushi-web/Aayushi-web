public class linkedlist {
     public static class Node{
        int data;
        Node next=null;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

     }
     public static Node head;
     public static Node tail;
      
     // add first
     public void addfirst(int data){
        Node  newnode= new Node(data);
        newnode.next=head;
        head=newnode;
     }
    public static void main(String[] args) {
        linkedlist ll= new linkedlist();
        ll.addfirst(5);
        ll.addfirst(8);
    }
}
