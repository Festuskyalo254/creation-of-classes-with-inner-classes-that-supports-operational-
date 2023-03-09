/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mmustlinkedin;

/**
 *
 * @author user
 */
public class MmustlinkedIn<T> {
    private Node<T>head;
    private int size;
    private class Node<T>{
        private T data;
        private Node<T> next;
        
        public Node(T data){
            this.data=data;
        }
    }
    public void Mmustlinkedlist(){
        head=null;
        size=0;
    }
    public void add(T data){
        Node <T>newNode=new Node <T> (data);
        if( head==null){
            head=newNode;
        }
        else{
            Node<T> current= head;
            while( current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
        size++;
    }
    int Index;
    public T get(int Idex){
        if(Index<0 || Index>=size){
            throw new IndexOutOfBoundsException();
        }
        Node<T>current= head;
        for(int i=0;i<Index;i++){
            current=current.next;
        }
        return current.data;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MmustlinkedIn.class.arrayType();
        System.out.getClass();
        // TODO code application logic here
    }
    
}
//Question 2
public class LinkedlistStack<T> {
    private Node<T> head;
    private int size ;
    private class Node <T>{
        private  T data;
        private Node <T> next;
        public Node (T data){
            this.data=data;
        }
    }
    public LinkedlistStack(){
         head =null;
         size=0;
    }
    public  void push(T data){
        Node <T>newNode=new Node<T>(data);
        newNode.next=head;
        head=newNode;
                size++;
    }
    public T pop(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            //throw newEmptyStackException();
        }
        T data=head.data;
        head=head.next;
        size--;
        return data;
    }
    public T top(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            //throw newEmptyStackException();
        }
        return head.data;
    }
    public int size(){
        return size;
        
    }
    public boolean isEmpty(){
        return size== 0;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedlistStack.main(args);
        // TODO code application logic here
    }
    //Question 3
    public class LinkedlistQueue {
     Node head;
     Node tail;
    private int size ;
    private class Node <T>{
        private T data;
        private Node<T>next;
        public Node(T data){
            this.data=data;
            
        }
    }
    public LinkedlistQueue(){
        head= null;
        tail=null;
        size=0;
    }
    public void enqueue(Node data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
                    return;
        }
        tail.next=newNode;
        tail= newNode; 
    }
    public int dequeue(){
          data=tail.data;
        tail= head.next;
        if(tail==null){
            
            head=null;
        }
        return data;
    }
       
       
       
         
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
