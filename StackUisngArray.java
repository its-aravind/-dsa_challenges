package stacks;
import java.util.*;
public class StackUisngArray {
    int[] stack;
    int length;
    int top;
    StackUisngArray(int length){
        this.length=length;
        stack=new int[length];
        top=-1;
    }
    public void push(int data){
        if(top==length-1){
            System.out.println("stack overflows");
        }
        else{
            top++;
            stack[top]=data;
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("stack under flows");
        }
        else{
            top--;
        }
    }
    public void peek(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("top element is "+stack[top]);
        }
    }
    public void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of the stack to create : ");
        int len=sc.nextInt();
        StackUisngArray stack=new StackUisngArray(len);
        int ch;
        do{
            System.out.println("1. push an element\n" +
                    "2.pop an element\n" +
                    "3.peek the top element\n" +
                    "4.display the stack\n" +
                    "5.exit\n" +
                    "---------------------------------------------------------------------------------------------");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("enter the element: ");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("exit successfully");
                    break;
                default:
                    System.out.println("you entered wrong choice try again!!");
            }
        }
        while(ch!=5);

    }
}
