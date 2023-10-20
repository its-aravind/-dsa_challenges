package queues;

import java.util.Scanner;

public class CircularQueue {
    int[] queue;
    int length;
    int front;
    int rear;
    CircularQueue(int length){
        this.length=length;
        queue=new int[length];
        front=-1;
        rear=-1;
    }
    public void enqueue(int data){
        if(front==0 && rear==length-1){
            System.out.println("queue is full");
        }
        else if(front==-1 && rear==-1){
                front=rear=0;
                queue[rear]=data;
        }
        else{
            rear=(rear+1)%length;
            queue[rear]=data;
        }
    }
    public void dequeue(){
        if(front==-1 && rear==-1){
            System.out.println("queue is empty");
        }
        else{
            if(front==rear){
                front=rear=-1;
            }
            else{
                front=(front+1)%length;
            }
        }
    }
    public void display(){
        if(front==-1 && rear==-1){
            System.out.println("queue is empty");
        }
        else{
            if(front>rear){
                for(int i=front;i<length;i++){
                    System.out.print(queue[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(queue[i]+" ");
                }
                System.out.println();
            }
            else{
                for(int i=front;i<=rear;i++){
                    System.out.print(queue[i]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of the queue to create : ");
        int len=sc.nextInt();
        CircularQueue queue=new CircularQueue(len);
        int ch;
        do{
            System.out.println("1. enqueue an element\n" +
                    "2.dequeue an element\n" +
                    "3.display the stack\n" +
                    "4.exit\n" +
                    "---------------------------------------------------------------------------------------------");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("enter the element: ");
                    queue.enqueue(sc.nextInt());
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("exit successfully");
                    break;
                default:
                    System.out.println("you entered wrong choice try again!!");
            }
        }
        while(ch!=4);

    }
}
