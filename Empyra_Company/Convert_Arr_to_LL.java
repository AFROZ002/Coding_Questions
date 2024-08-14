package Empyra_Company;
class  Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Convert_Arr_to_LL {
public  static  Node convert2ar(int [] arr){
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
public  static  void printarr(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}
public  static  Node inserfrombeg(Node head,int num){

    Node ins=new Node(num);
    Node temp=head;
   ins.next=temp;
   temp=temp.next;
   return ins;
}
public  static  Node rff(Node head){
    if(head== null){
        return null;
    }
    Node temp=head;
    return temp.next=temp.next.next;
}

public  static  Node rfb(Node head){
    if(head==null){
        return null;
    }
    Node temp=head;
    while(temp.next.next!=null){
        temp=temp.next;
    }
    temp.next=null;
    return head;


}
public  static  Node insertatend(Node head,int number){

    Node num=new Node(number);
    Node temp=head;
    while(temp.next!=null){
       temp=temp.next;

    }
   temp.next=num;
    num.next=null;
    return head;
}


    public static void main(String[] args) {
        int [] arr=new int[]{12,5,6,8};

        Node head=convert2ar(arr);
//        printarr(head);

//         head=inserfrombeg(head,24);
//         printarr(head);
//         head=rff(head);
//         printarr(head);

        head=rfb(head);
        printarr(head);

        head=insertatend(head,99);
        printarr(head);



    }
}
//        ll.insertatbegining(5);
//        ll.removefromfront();
//        ll.removefromback(45);
//        ll.insertatend(10);
