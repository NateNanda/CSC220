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
                case '+':
                    operands.push(nextCharacter);
                    break;
               case '0':case '1':case '2':case '3':case '4':
               case '5':case '6':case '7':case '8':case '9':
                   values.push(Character.getNumericValue(nextCharacter));
                   break;
                               }
        }
        values.clear();
        operands.clear();
        return 1;
    }
    public static void main ( String[] args) {
        parse("2+3");
        
    }

    

}
