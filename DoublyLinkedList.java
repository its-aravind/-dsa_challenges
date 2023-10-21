
class Node1{
    int value;
    Node1 prev;
    Node1 next;
    Node1(int value){
        this.value=value;
        prev=null;
        next=null;
    }
}
public class DoublyLinkedList {
    static Node1 head=null;
    static Node1 tail=null;
    public static void insertBegin(int data){
        Node1 node=new Node1(data);
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            node.next=head;
            head.prev=node;
            head=node;
        }
    }
    public static void insertEnd(int data){
        Node1 node=new Node1(data);
        if(head==null && tail==null){
            tail=head=node;
        }
        else{
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
    }
    public static void insertMiddle(int position,int data){
        Node1 node=new Node1(data);
        Node1 temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            if(count==position){
                break;
            }
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next.prev=node;
        temp.next=node;
        node.prev=temp;
    }
    public static void deleteBegin(){
        head=head.next;
        head.prev=null;
    }
    public static void deleteEnd(){
        tail=tail.prev;
        tail.next=null;
    }
    public static void deletePosition(int position){
        Node1 temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            if(count==position){
                break;
            }
            temp=temp.next;
        }
        temp.next.next.prev=temp;
        temp.next=temp.next.next;
    }
    public static void display(){
        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ⇆ ");
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println();
    }
    public static void main(String[] args) {
        insertEnd(3);
        insertEnd(2);
        insertEnd(5);
        display();
        insertBegin(5);
        insertBegin(10);
        deleteEnd();
        insertEnd(8);
        display();

    }
}