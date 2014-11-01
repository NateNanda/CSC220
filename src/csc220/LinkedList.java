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
public class LinkedList {
    
    Node [] _data = new Node[50];
    int counter = 0;
    Node firstNode = null;
    Node currentNode;
    int countBackward = counter;
    Object getNode;
    public boolean addNode(Node n) {
        currentNode=n;
        currentNode._nextNode = firstNode; 
        firstNode = currentNode;
        _data[counter] = currentNode;
        counter++;
        return true;
    }
    
    public Node getNode() {
        countBackward--;
        
        return _data[countBackward +1] ;
        
    }
    
}
