//package LinkedList_DSA;
//class  Node {
//    int data ;
//    Node next;
//    Node(int data){
//        this.data=data;
//        this.next=null;
//
//    }
//}
//
//public class Remove_Duplicates_IN_LL {
//    public  static void printNode(Node head){
//        Node cur=head;
//        while(cur!=null){
//            System.out.print(cur.data+" ");
//            cur=cur.next;
//        }
//        System.out.println();
//
//    }
//    public static Node converToarr(int [] arr) {
//        Node head=new Node(arr[0]);
//        int n=arr.length;
//        Node mover=head;
//        for(int i=1;i<n;++i){
//            Node temp=new Node(arr[i]);
//            mover.next=temp;
//            mover=mover.next;
//        }
//        return head;
//
//    }
//    public  static  Node Duplicates(Node head){
//        if(head==null || head.next==null){
//            return null;
//        }
//        Node temp=head;
//        while(temp!=null && temp.next!=null){
//            if(temp.data==temp.next.data){
//                temp.next=temp.next.next;
//            }
//            else{
//                temp=temp.next;
//            }
//        }
//        return head;
//    }
//    public static void main(String[] args) {
//        int [] arr=new int[]{3,1,1,5,8};
//        Node head=converToarr(arr);
//
//    head=    Duplicates(head);
//    printNode(head);
//
//
//
//
//    }
//}
