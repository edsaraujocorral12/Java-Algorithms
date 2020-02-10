//@Author:Edson de Araujo Corral
//Class Test "DON'T RUN IT"

public class PrimitiveDataTypes 
{
    public static void main(String args[])
    {
        int age = 28 + 1;
        double d = 3.14;
        boolean b = true;
        char ch = 'a';
        double result = 1 + 2.5; //3.5;
        int cast = (int) 3.7; //3;

        long x = 10202020203;
        short s = 12;
        byte by = 2;
        float f = 2.0;

        //Declaration Statement
        int myAge;
        double height;

        //Assignment Statement
        //single variable = expression;
        int a = 10;
        int b = 20; 
        int c = a + b;

        //Conditional
        //if (<boolean expression>) { <block statements> } 
        if (a >= 0) 
        {
            c = c + 1; 
        }
        if (a >= 10)
            c = c + 2;
        //if-else statement
        //if (<boolean expression>) { <block stataments> } //boolean expression is true
        //else                      { <block stataments> } //boolean expression is false
        if (a % 2 == 0)
            c = c + 1; //c++;
        else
            c = c - 1; //c--;

        //Loops
        //while (<boolean expression>) { <block statements> }
        while (a <= 10) //while bool. exp. is true execute the block;
            a = a + 1;

        //Shortcut notations
        //Initializing declarations
        int i = 1; //the best practices is to use this mechanism close to first use of the variable;

        //Implicit assignment
        i++; //i = i + 1;
        i--; //i = i - 1;
        ++i;
        --i;
        i /= 2; //i = i / 2; Warning => i//; 
        i *= 2; //i = i * 2;
        i += 1; //i = i + 1 = i++;

        //Single-statements blocks
        if (i >= 0)
            i++;
        //But 
        if (i >= 0)
        {
            i++;
            if (i == 2)
                i *= 2;
        } //end if curly brace;

        //For notation
        int i = 0; //Initialize
        while (i <= 10) //boolean expression;
        {
            // <block statement>
            i++; //increment;
        }
        //But
        // for (<initialize>; <boolean expression>; <increment>) { <block statement> }
        for (int i = 0; i <= 10; i++)
        {
            // <block statement>
        }
    }
}