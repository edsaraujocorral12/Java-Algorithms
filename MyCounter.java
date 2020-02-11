public class MyCounter
{
    //instance variables
    private final String name;
    private int count;

    public MyCounter (String id)
    {
        name = id;
    }

    public void increment()
    {
        count++;
    }
    public int tally()
    {
        return count;
    }
    public String toString()
    {
        return count + " " + name;
    }

}