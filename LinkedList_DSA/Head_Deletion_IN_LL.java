package LinkedList_DSA;
//class  Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data=data;
//        this.next=null;
//
//    }
//}
public class Head_Deletion_IN_LL {
public  static Node   hd(Node head){
    if(head ==null){
        return head;
    }
    head=head.next;
    return head;

}
public  static void  printlist(Node head){
    Node  cur=head;
    while(cur!=null){
        System.out.print(cur.data+" ");
        cur=cur.next;

    }
}

    public static void main(String[] args) {
        Node head =new Node(5);
        head.next=new Node(10);
        head.next.next=new Node(15);
        head.next.next.next=new Node(24);
        head.next.next.next.next=new Node(40);
       head= hd(head);
        System.out.println("After Deleteion of the node");

        printlist(head);


    }
}
