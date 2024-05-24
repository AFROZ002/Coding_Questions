//package LinkedList_DSA;
//
//class Node{
//    int data ;
//    Node next;
//    Node(int data ){
//        this.data=data;
//        this.next=null;
//    }
//}
//public class Deletion_Node_LL {
//    public  static  void  deletetion(Node head, int pos){
//        if(pos==0){
//            head=head.next;
//            return;
//
//        }
//        Node prev=head;
//        for(int i=0;i<pos-1;++i){
//            prev=prev.next;
//
//        }
//        prev.next=prev.next.next;
//    }
//    public  static void  printlist(Node head){
//        Node  cur=head;
//        while(cur!=null){
//            System.out.print(cur.data+" ");
//            cur=cur.next;
//
//        }
//    }
//    public static void main(String[] args) {
//        Node head =new Node(5);
//        head.next=new Node(10);
//        head.next.next=new Node(15);
//        head.next.next.next=new Node(24);
//        head.next.next.next.next=new Node(40);
//        deletetion(head,3);
//        System.out.println("After Deleteion of the node");
//
//        printlist(head);
//
//
//    }
//}
