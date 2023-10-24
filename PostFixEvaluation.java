package stacks;

import java.util.*;
import java.io.*;
class Stack
{
    int a[]=new int[100];
    int top=-1;

    void push(int c)
    {
        a[++top]= c;
    }

    int pop()
    {
        return a[top--];
    }
}

public class PostFixEvaluation{
    static boolean isOperator(char ch)
    {
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
            return true;
        else
            return false;
    }
    static void evaluatePostfix(String exp)
    {
        Stack postFix = new Stack();    // Create postfix stack
        int n = exp.length();

        for(int i=0;i<n;i++)
        {
            if(isOperator(exp.charAt(i)))
            {
                // pop top 2 operands.
                int op1 = postFix.pop();
                int op2 = postFix.pop();

                // evaluate in reverse order i.e. op2 operator op1.
                switch(exp.charAt(i))
                {
                    case '+': postFix.push(op2 + op1);
                        break;
                    case '-': postFix.push(op2 - op1);
                        break;
                    case '*': postFix.push(op2 * op1);
                        break;
                    case '/': postFix.push(op2 / op1);
                        break;
                }

            }
            // Current Char is Operand simple push into stack
            else
            {
                // convert to integer
                int operand = exp.charAt(i) - '0';
                postFix.push(operand);
            }
        }

        // Stack at End will contain result.
        System.out.println(postFix.pop());
    }

    public static void main(String args[]) throws IOException
    {
        String exp;
        //create an input stream object
        BufferedReader keyboard = new BufferedReader (new InputStreamReader(System.in));
        //get input from user
        System.out.print("\nEnter the postfix expression you want to evaluate: ");
        exp = keyboard.readLine();
        System.out.print("The PostFix Evaluation for the Given Expression "+exp+" is: ");
        evaluatePostfix(exp);
    }
}
