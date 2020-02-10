//@Author Edson de Araujo Corral
public class Recursion
{
    //Binary Search
    public static int rank(int key, int[] a)
    {
        return rank(key, a, 0, a.length - 1);
    }
    public static int rank(int key, int[] a, int lo, int hi)
    {
        if (lo > hi) return -1; //base case;
        int mid = lo + (hi - lo) / 2;

        if      (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else                   return mid;
    }
    public static void main(String args[])
    {
        //@Test BinarySearch
        //int[] a = {10, 20, 30, 40, 50};
        //System.out.println(rank(30, a));//ok
    }
}