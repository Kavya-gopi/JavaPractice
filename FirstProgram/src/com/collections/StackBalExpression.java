package com.collections;
import java.util.Stack;
public class StackBalExpression {
    public static boolean validate(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if (currentChar == '[' || currentChar == '(' || currentChar == '{')
                stack.push(currentChar);
            else{
                //check if the stack is empty
                if(stack.isEmpty())
                    return false;
                //pop the element from the stack;
                char topElement=stack.pop();
                //if open and closed characters are not matches return false
                if(!((topElement=='[' && currentChar==']') || (topElement=='(' && currentChar==')') || (topElement=='{' && topElement=='}')))
                    return false;
            }
        }
        return stack.isEmpty();

    }
    public static void main(String args[]){
        System.out.println(validate("()"));
        System.out.println(validate(")}("));
    }
}
