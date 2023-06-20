//Bharath is very good at numbers. As he is piled up with many works, he decides to develop programs for a few concepts to simplify his work. As a first step, he tries to arrange even and odd numbers using a linked list. He stores his values in a singly-linked list. Now he has to write a program such that all the even numbers appear before the odd numbers.

// Sample test cases :
//Input 1 :
//6
//3 1 0 4 30 12

//Output 1 :
//The new list:
//12 30 4 0 3 1 

//Code:

import java.util.*;

class Node{
    int data;
    Node next;
    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    Node lastnode;
    LinkedList(){
        head = null;
        lastnode = null;
    }
    
    public void append(int data){
        if(lastnode == null){
            head = new Node(data);
            lastnode = head;
        }
        else{
            lastnode.next = new Node(data);
            lastnode = lastnode.next;
        }
    }
    
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    
    public Node getNode(int index){
        Node current = head;
        for(int i = 0; i < index; i++)
        {
            if (current == null){
                return null;
            }
            current = current.next;
        }
        return current;
    }
    
    public Node getprevNode(Node ref){
        Node current = head;
        while(current != null && current.next != ref){
            current = current.next;
        }
        return current;
    }
    
    public void insertFront(Node n){
        if(head == null){
            head = n;
        }
        else{
            n.next = head;
            head = n;
        }
    }
    
    public void remove(Node n){
        Node prev = getprevNode(n);
        if(prev == null){
            head = head.next;
        }
        else{
            prev.next = n.next;
        }
    }
}

class DSA_Practice_SinglyLinkedList{
    public static void customsort(LinkedList l1){
        Node current = l1.head;
        while(current != null){
            Node temp = current.next;
            if (current.data % 2 == 0){
                l1.remove(current);
                l1.insertFront(current);
            }
            current = temp;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        int size = sc.nextInt();
        for(int i=0; i<size;i++){
            l1.append(sc.nextInt());
        }   
        customsort(l1);
        System.out.println("The new list :");
        l1.display();
    }
}