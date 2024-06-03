//package LinkedList_DSA;
////class  Node {
////    int data;
////    Node next;
////    Node(int data){
////        this.data=data;
////        this.next=null;
////
////    }
////    Node(int data, Node next) {
////        this.data = data;
////        this.next = next;
////    }
//}
//public class Insert_Element_before_value {
//
//public static Node converToarr(int [] arr) {
//    Node head=new Node(arr[0]);
//    int n=arr.length;
//    Node mover=head;
//        for(int i=1;i<n;++i){
//            Node temp=new Node(arr[i]);
//            mover.next=temp;
//            mover=mover.next;
//        }
//        return head;
//
//}
//    public  static void printNode(Node head){
//        Node cur=head;
//        while(cur!=null){
//            System.out.print(cur.data+" ");
//            cur=cur.next;
//        }
//        System.out.println();
//
//    }
//    public  static  Node insertbeforeelement(Node head,int el,int val){
//    Node t1=new Node(el);
//    if(head==null){
//        return null;
//    }
//    if(head.data==val){
////        return  new Node(el,head);
//        t1.next=head;
//        head=t1;
//        return head;
//
//    }
//    Node temp=head;
//    while(temp.next!=null){
//        if(temp.next.data==val){
//            Node x=new Node(el);
//            x.next=temp.next ;
//            temp.next=x;
//            break;
//        }
//        temp=temp.next;
//    }
//    return head;
//    }
//
//
//
//    public static void main(String[] args) {
//        int [] arr=new int[]{3,1,5,8};
//Node head=  converToarr(arr);
////        printNode(head);
//
//     head=   insertbeforeelement(head,100,8);
//     printNode(head);
//
//    }
//}
