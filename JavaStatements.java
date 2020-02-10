//@Autor: Edson de Araujo Corral
//Class Test "DON'T RUN IT";

public class JavaStatements 
{
    public static void main(String args[])
    {
        //Declaration := Create a varible name of a specified type;
        int i;
        double a;
        double b;
        double c;
        double discriminant;

        //Assignment := assign a data-type value to a varible;
        a = 1.0;
        b = a + 3;
        discriminant = b*b - 4.0*c;

        //Initializing Declaration := declaration that also assigns an initial value
        int i = 1;
        double c = 3.141592;

        //Implicit Assignment := i = i + 1;
        i++;
        i += 1;

        //Conditional (if) := execute a statement depending on boolean expression
        int x = -10;
        if (x < 0) x = -x;

        //Conditional (if-else) := execute one or the other statement
        int x = 2;
        int y = 5;
        int max;

        if (x > y) max = x;
        else       max = y;

        //Loop (while) := Execute statement until boolean expression is false;
        int v = 0;
        int N = 10;
        while (v <= N)
            v = 2*v;
        
        double t = c;
        while (Math.abs(t - c/t) > 1e-15*t)
            t = (c/t + t) / 2.0;
        
        //Loop (for) := compact version of while statement
        double sum = 0.0;
        for (int i = 1; i <= N; i++)
            sum += 1.0/i;
    }
}