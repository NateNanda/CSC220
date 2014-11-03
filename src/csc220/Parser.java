package csc220;
import java.util.*;
public class Parser {

    public static int parse(String expression) {
        ArrayStack<Integer> values = new ArrayStack<>();
        ArrayStack<Character> operands = new ArrayStack<>();
        int index = 0;
        char nextCharacter = ' ';
        while(expression.length() != index) {
            nextCharacter = expression.charAt(index);
            index++;
            switch(nextCharacter) {
               case '0':case '1':case '2':case '3':case '4':
               case '5':case '6':case '7':case '8':case '9':
                   values.push(Character.getNumericValue(nextCharacter));
                   break;
               case '^':
                   operands.push(nextCharacter);
                   break;
               case '*': case'/':case '+': case '-':
                    while(!operands.isEmpty() 
                          && precedence(nextCharacter) <= 
                            precedence(operands.peek()) )
                
                    operands.push(nextCharacter);
                    break;
              
                               }
        }
        return 1;
    }
    
    public static int precedence(char operator) {
        int precedence =0;
        switch(operator) {
            case '+':
                precedence = 0;
                break;
            case '-':
                precedence = 0;
                break;
            case '*':
                precedence = 1;
                break;
            case '/':
                precedence = 1;
                break;
            case '^':
                precedence = 2;
                break;
        }
        return precedence;

    }
    
    private static int compute(int op1, int op2, char operator) {
       int result = 0;
        switch(operator) {
            case '-':
                result = op1 - op2;
                break;
             case '+':
                 result = op1 + op2;
                 break;
             case '*':
                result = op1 * op2;
                break;
            case '/':
                result = op1/op2;
                break;
            case '^':
                result = (int) Math.pow(op1, op2);
                break;
        }
        return result;
    } 
    public static void main ( String[] args) {
        System.out.println(compute (3,2,'/'));
        System.out.println(precedence ('*'));
        
    }

    

}
