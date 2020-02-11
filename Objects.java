public class Objects
{
    public static void main(String[] args)
    {
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        heads.increment();
        StdOut.println(heads);
    }
}