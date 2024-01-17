package com.collections;
import java.util.Stack;
public class PostfixExpression {
    public static double evaluate(String expression){
        Stack<Integer> stack=new Stack<Integer>();

        for(int i=0;i<expression.length();i++) {
            char element = expression.charAt(i);
            if (Character.isDigit(element)) {
                stack.push(Character.getNumericValue(element));//covert char into integer

            } else {
                int op1 = stack.pop();
                int op2 = stack.pop();

                switch (element) {
                    case '+':
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        stack.push(op2 - op1);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    case '/':
                        stack.push(op2 / op1);
                        break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String args[]){
        System.out.println(evaluate("23+54+*"));
    }

}
