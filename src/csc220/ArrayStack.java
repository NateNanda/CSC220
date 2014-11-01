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
public class ArrayStack<T> {
    
    private T[] stack; // array of stack entries
    private int topIndex; // index of top entry
    private static final int DEFAULT_INITIAL_CAPACITY = 50;

    public ArrayStack() {
        this(DEFAULT_INITIAL_CAPACITY);
    } // end default constructor
    public ArrayStack(int initialCapacity) {
      // the cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[])new Object[initialCapacity]; 
        stack = tempStack;
        topIndex = -1;
   } // end constructor
   
   public T peek() {
       
       System.out.println(stack[topIndex]);
       return stack[topIndex];
   } 
   public void push(T newEntry) {
       topIndex++;
       stack[topIndex]= newEntry;
   }
   
   public T pop() {
       
       T temp = peek();
       topIndex--;        
       return temp;
   }
   
   
   
   public static void main(String Args[]) {
       ArrayStack<Integer> as = new ArrayStack<Integer>();
       as.push(1);
       as.push(2);
       as.push(3);
       as.push(4);
       as.push(5);
       as.push(6);
       
       
       
       as.pop();
       as.pop();as.pop();as.pop();as.pop();as.pop(); as.pop();
               
       
   }

} // end ArrayStack

