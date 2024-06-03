///package LinkedList_DSA;
//
//import java.util.Stack;
//
////class  Node {
////    int data ;
////    Node next;
////    Node(int data){
////        this.data=data;
////        this.next=null;
////
////    }
////}
//
//public class Reverse_a_Linkedlist {
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
//    public  static void printNode(Node head){
//        Node cur=head;
//        while(cur!=null){
//            System.out.print(cur.data+" ");
//            cur=cur.next;
//        }
//        System.out.println();
//
//    }
////    public  static Node Reverse(Node head){
////        Node temp=head;
////
////        Stack<Integer> st=new Stack<>();
////        while(temp!=null){
////            st.add(temp.data);
////            temp=temp.next;
////        }
//////        temp=head;
////
////        while (temp!=null){
////            temp.data= st.pop();
////
////            temp=temp.next;
////
////        }
////        return head;
////
////    }
//
//
//
//public static Node Reverse(Node head) {
//    Node temp = head;
//    Node prev = null;
//    Node front;
//    while (temp != null) {
//        front = temp.next;
//        temp.next = prev;
//        prev = temp;
//        temp = front;
//    }
//    return prev;
//}
//    public static void main(String[] args) {
//        int [] arr=new int[]{3,1,5,8};
//     Node head=converToarr(arr);
//     printNode(head);
//
//     head=Reverse(head);
//     printNode(head);
//
//
//
//    }
//}
