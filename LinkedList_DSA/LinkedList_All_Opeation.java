package LinkedList_DSA;


//
//class  Node {
//    int data;
//    Node next;
//    Node(int data){
//        this.data=data;
//        this.next=null;
//    }
//}
public class LinkedList_All_Opeation {

    public static Node convert(int[] arr){
        int n=arr.length;
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<n;++i){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=mover.next;
        }
        return head;

    }
    public  static void printNode(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();

    }
    public  static  Node removefromfront(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }
    public static Node removefromBack(Node head){
        if(head==null || head.next ==null){
            return  null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;

        }
        temp.next=null;
        return head;
    }
    public  static  Node insertfromEnd(Node head,int data){

        Node da=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=da;
        da.next=null;
        return head;

    }
    public  static  Node insertfrombeginning(Node head,int data){
        if(head==null){
            return null;
        }
        Node nn=new Node(data);

        nn.next=head;
        head=nn;
        return head;
    }
    public static void main(String[] args) {
        int [] arr=new int[]{12,5,6,8,36,48,50,11,9,8,17,16,16,39,4};
        Node head=   convert(arr);
        printNode(head);

    head=removefromfront(head);

        printNode(head);
       head= removefromBack(head);

        printNode(head);
      head=  insertfromEnd(head,30);

        printNode(head);
    head=    insertfrombeginning(head,45);

        printNode(head);

    }

}

