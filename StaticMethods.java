//@Author Edson de Araujo Corral

public class StaticMethods
{
    //absolute value of an int value
    public static int abs(int x)
    {
        if (x < 0) return -x;
        else       return x;
    }
    //absolute value of a double value
    public static double abs(double x)
    {
        if (x < 0.0) return -x;
        else         return x;
    }
    //Primality test
    public static boolean isPrime(int N)
    {
        if (N < 2) return false;
        for (int i = 2; i*i <= N; i++)
            if (N % i == 0) return false;
        
        return true;
    }
    //Square Root (Newton Method)
    public static double sqrt(double c)
    {
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > err * t)
            t = (c/t + t) / 2.0;
        
        return t;
    }
    //Hypotenuse of a right triangle
    public static double hypotenuse(double a, double b)
    {
        return Math.sqrt(a*a + b*b);
    }
    //Increment all elements of an Array
    public static void incrementElementArray(int[] a)
    {
        for (int i = 0; i < a.length; i++)
            a[i] += 1;
    }
    //Print all elements of an Array
    //@overload
    public static void printArray(int[] a)
    {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " "); 

        System.out.println(""); 
    }   
    public static void printArray(double[] a)
    {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }
    //@Test Client Class
    public static void main(String args[])
    {
        //@Test abs
        //int i = -10;
        //System.out.println(abs(i)); //10 //ok
        //double i = -10.0;
        //System.out.println(abs(i)); //10.0 //ok

        //@Test isPrime
        //int nro = 29;
        //System.out.println(nro + " is prime: " + isPrime(nro)); //Ok

        //@Test sqrt
        //double val = 20.4;
        //double result = sqrt(val);
        //System.out.println("Result: " + result);//Ok

        //@Test hypotenuse
        //double a = 13.0;
        //double b = 14.0;
        //System.out.println("Hypotenuse of " + a + " and " + b + " is " + hypotenuse(a, b));//Ok

        //@Test incrementElementArray
        //int[] a = {10, 20, 30, 40, 50};
        //incrementElementArray(a);
        //for (int i = 0; i < a.length; i++)
        //    System.out.print(a[i] + " ");//ok

        //@Test printArray
        //int[] a = {10, 20, 30, 40, 50};
        //double[] b = {23.0, 123.3, 11.0, 23.3};
        //printArray(a);//ok
        //printArray(b);//ok
    }
}