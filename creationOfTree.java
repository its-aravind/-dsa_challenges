package binaryTrees;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
public class creationOfTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of nodes: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Node root=insertLevelOrder(arr);
        System.out.println(root.data);
    }

    public static Node insertLevelOrder(int[] arr){
        return constructTree(arr,0);
    }
    public static Node constructTree(int[] arr,int i){
        if(i< arr.length){
            Node temp=new Node(arr[i]);
            temp.left=constructTree(arr,2*i+1);
            temp.right=constructTree(arr,2*i+2);
            return temp;
        }
        else{
            return null;
        }
    }
}
