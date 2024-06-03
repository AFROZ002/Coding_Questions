//package LinkedList_DSA;
//
//import java.util.HashMap;
//import java.util.Map;
//
// class  Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
//
//public class Detect_Loop_Brute_Force {
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
//    public static  boolean Detect(Node head){
//
//        Map<Node,Integer>m5=new HashMap<>();
//        Node temp=head;
//        while (temp!=null) {
//            if (m5.containsKey(temp)) {
//                return false;
//            }
//            m5.put(temp, 1);
//            temp = temp.next;
//        }
//        return true;
//    }
//
//
//
//    public static void main(String[] args) {
//        int [] arr=new int[]{3,1,5,8};
//        Node head=converToarr(arr);
//        printNode(head);
//
//   boolean fun=Detect(head);
//        System.out.println(fun);
//
//
//
//    }
//}
