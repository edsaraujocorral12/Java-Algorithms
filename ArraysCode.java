//@Author Edson de Araujo Corral
public class ArraysCode 
{
    public static void main(String args[])
    {
        //Find the maximum of the array values
        double[] a = {1.0, 2.4, 201.1, 30.4, 23.0};
        double max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max) max = a[i];
        //@Test
        //System.out.println("Max: " + max); //Ok

        //Compute the average of the array values
        int N = a.length;
        double sum = 0.0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        double average = sum / N;
        //@Test
        //System.out.println("Avg: " + average); //Ok

        //Copy to another Array
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];
        //@Test
        //for (int i = 0; i < b.length; i++)
        //    System.out.print(b[i] + " ");//Ok

        //Reverse the elements within an Array
        int M = a.length;
        for (int i = 0; i < M / 2; i++)
        {
            double temp = a[i];
            a[i] = a[N-1-i];
            a[N-1-i] = temp;
        }
        //@Test
        //for (int i = 0; i < a.length; i++)
        //    System.out.print(a[i] + " "); //Ok

        //matrix-matrix multiplication ma[][]*mb[][] = mb[][];
        double[][] ma = new double[3][2];
        for (int i = 0; i < ma[0].length; i++)
            for (int j = 0; j < ma[1].length; j++)
                ma[i][j] = 2.0;
        
        double[][] mb = new double[2][2];
        for (int i = 0; i < mb[0].length; i++)
            for (int j = 0; j < mb[1].length; j++)
                mb[i][j] = 3.4;
        double[][] c = new double[2][2];
        for (int i = 0; i < c[0].length; i++)
            for (int j = 0; j < c[0].length; j++)
                for (int k = 0; k < c[0].length; k++)
                    c[i][j] += ma[i][k]*mb[k][j];

        //@Test
        //for (int i = 0; i < c[0].length; i++)
        //    for (int j = 0; j < c[0].length; j++)
        //        System.out.print(c[i][j] + " "); //ok
    }
}