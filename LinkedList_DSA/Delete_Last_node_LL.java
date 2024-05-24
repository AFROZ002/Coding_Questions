package LinkedList_DSA;
//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data=data;
//        this.next=next;
//
//    }
//}

public class Delete_Last_node_LL {
    public static  Node Dl(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp=head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public  static void printNode(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.println(cur.data+" ");
            cur=cur.next;
        }

    }
    public static void main(String[] args) {

//        Node head=new Node(5);
//        head.next=new Node(10);
//         head.next.next=new Node(15);
//         head.next.next.next=new Node(20);
//         head.next.next.next.next=new Node(25);
//
//        head.next.next.next.next.next=new Node(30);
//     head=   Dl(head);
//     printNode(head);
//        int[] arr=new int[5];




    }
}
