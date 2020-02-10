//@Author Edson de Araujo Corral
//Class Test "Don't run it";

public class Arrays 
{
    public static void main(String args[])
    {
        //One-dimensional Array;
        int N = 5;
        //Long Form 
        double[] a; //Declaration
        a = new double[N]; //Creation
        for (int i = 0; i < N; i++)
            a[i] = 0.0; //Initialization

        //Short Form
        //Declaration = Creation;
        double[] a = new double[N];

        //Initializing declaration
        int[] a = {1, 1, 2, 3, 4, 5, 6};

        int size = a.length; //Length of array
        int lastElement = a[a.length - 1]; //always

        //Aliasing
        int i = 0;
        int[] a = new int[N];
        a[i] = 1234;

        int[] b = a;
        b[i] = 5678; //a[i] is now 5678

        //Two Dimensional Array;
        //M-by-N Two-Dimensional Array => M row and N colummn 
        //{{<N length>}, {<N length>}, {<N Length>}};
        int M = 2;
        int N = 3;
        //2-by-3 Arrays
        double[][] a = new double[M][N];

        double[][] b;
        b = new double[M][N];
        for (int i = 0; i < M; i++)
            for(int j = 0; j < N; j++)
                a[i][j] = 0.0;

    }
}