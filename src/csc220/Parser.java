package csc220;
public class Parser {

    public static int parse(String expression) {
        ArrayStack<Integer> values = new ArrayStack<>();
        ArrayStack<Character> operators = new ArrayStack<>();
        int index = 0;
        char nextCharacter = ' ';
        int value1 = 0;
        int value2 = 0;
        char op    = ' ';
        int result = 0;
        
        while(expression.length() != index) {
            nextCharacter = expression.charAt(index);
            index++;
            switch(nextCharacter) {
               case '0':case '1':case '2':case '3':case '4':
               case '5':case '6':case '7':case '8':case '9':
                   values.push(Character.getNumericValue(nextCharacter));
                   break;
<<<<<<< Updated upstream
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
=======
                case '^':
                    operators.push(nextCharacter);
                    break;
                case '+': case '-': case '*': case '/':
                    while (!operators.isEmpty() && 
                              (pres(nextCharacter)) <= pres(operators.peek())){
                        value1 = values.pop();
                        value2 = values.pop();
                        op = operators.pop();
                        result = compute(value2, value1, op);
                        values.push(result);
                    }//end while loop
                    operators.push(nextCharacter);
                    break;
               
                               }//end switch
        }// end outer while loop
        return result;
    }//end parse
    public static int pres(char operator)  {
        int precedence = 0;
        switch(operator) {
            case '+': case '-':
                precedence = 0;
            case '*': case '/':
                precedence = 1;
            case '^':
                precedence= 2;
        }
        return precedence;    
    }
    //returns a value based on the precedecne of the operation supplii\ed.
    public static int compute(int val1, int val2, char operator) {
        int result = 0;
        switch(operator) {
            case '+': 
                result = val1 + val2;
            case '-':
                result = val1 - val2;
            case '*': 
                result = val1 * val2;
            case '/':
                result = val1 / val2;
            case '^':
                result = (int) Math.pow(val1, val2);
        }
        System.out.println("sub:" +result);
        return result;   
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
        System.out.println(compute (3,2,'/'));
        System.out.println(precedence ('*'));
=======
        System.out.println( parse("2+2+3"));
>>>>>>> Stashed changes
        
    }

    

}
