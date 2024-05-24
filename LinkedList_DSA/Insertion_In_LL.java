package LinkedList_DSA;
//class  Node {
//    int data;
//    Node next;
//
//    Node(int data){
//        this.data=data;
//        this.next=null;
//    }
//}

public class Insertion_In_LL {
    public  static  void Insert(Node head, int data, int pos){
        Node td=new Node(data);
        if(pos==0){
            td.next=head;
            head=td;

        }
        Node prev=head;
        for(int i=0;i<pos-1;++i){
            prev=prev.next;
        }
        td.next=prev.next;
        prev.next=td;
    }
    public static void PrintList(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(11);
        head.next = new Node(12);
        head.next.next = new Node(13);
        head.next.next.next = new Node(14);
        head.next.next.next.next = new Node(15);
        Insert(head,30,3);

        System.out.println("Linked List after insertion:");
        PrintList(head);


    }
}
