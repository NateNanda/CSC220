/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc220;

/**
 *
 * @author WorkingDirectory
 */
public class LinkedStack<T> {
    private Node topNode; // references the first node in the chain
    
    public LinkedStack() {
        topNode = null;
    }   // end default constructor
    
    public void push(T newEntry) {
        Node newNode = new Node(newEntry, topNode);
             topNode = newNode;
    } // end push
    public T peek () {
        
        if(topNode == null) {
            return null;
        }
        return topNode.data;
    }
    public T pop() {
        T top = peek();
        
        if(topNode != null) {
            topNode = topNode.next;
        }
        System.out.println(top);
        return top;
    } //end pop
    
    private class Node {
        private Node(T entry, Node topNode) {
            data = entry;
            next = topNode; 
        }
        private T data; // entry in stack private Node next; 
        private Node next;// link to next node;
    } // end Node
    
     public static void main(String[] args) {
        LinkedStack<Integer> lstack = new LinkedStack<>();
        lstack.push(10);
        lstack.push(20);
        lstack.push(30);
        lstack.push(40);
        lstack.push(50);
        lstack.push(60);
        
        
        
        lstack.pop();
        lstack.pop();
        lstack.pop();lstack.pop();
        lstack.pop();
        
        
        lstack.peek();
    }

} // end LinkedStack

