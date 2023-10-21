class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SingleLinkedList {
    static Node head=null;
    public static void insertBegin(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }
        else{
            node.next=head;
            head=node;
        }
    }
    public static void insertEnd(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    public static void insertPosition(int position,int data){
        Node node=new Node(data);
        Node temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            if(count==position){
                break;
            }
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
    }
    public static void deleteBegin(){
        //  System.out.println("deleted element: "+head.data);
        head=head.next;
    }
    public static void deleteEnd(){
        Node temp=head;
        Node prev=head;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }
    public static void deletePosition(int position){
        Node temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            if(count==position){
                break;
            }
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        insertBegin(7);
        insertEnd(10);
        display();
        insertBegin(5);
        insertPosition(1,20);
        display();
    }
}