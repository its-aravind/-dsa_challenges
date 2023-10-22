package queues;
public class DequeUsingArray {
    int[] deque;
    int n;
    int front;
    int rear;
    DequeUsingArray(int n){
        this.n=n;
        deque=new int[n];
        front=rear=-1;
    }
    public void enqueue_rear(int data){
        if(front==0 && rear==n-1){
            System.out.println("queue is full");
        }
        else{
            if(front==-1 && rear==-1){
                front=rear=0;
                deque[rear]=data;
            }
            else{
                rear++;
                deque[rear]=data;
            }
        }
    }
    public void enqueue_front(int data){
        if(front<=0){
            System.out.println("cannot be inserted");
        }
        else{
            front--;
            deque[front]=data;
        }
    }
    public void dequeue_front(){
        if(front==-1 && rear==-1){
            System.out.println("deque is empty");
        }
        else{
            if(front==rear){
                front=rear=-1;
            }
            else{
                front=front+1;
            }
        }
    }
    public void dequeue_rear(){
        if(rear==-1){
            System.out.println("cannot be inserted");
        }
        else{
            rear--;
        }
    }
    public void display(){
        if(front==-1 && rear==-1){
            System.out.println("queue is empty");
        }
        else {
            for (int i = front; i <= rear; i++) {
                System.out.print(deque[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DequeUsingArray deque=new DequeUsingArray(5);
        deque.enqueue_rear(4);
        deque.enqueue_rear(88);
        deque.display();
        deque.dequeue_front();
        deque.enqueue_front(100);
        deque.display();
    }
}