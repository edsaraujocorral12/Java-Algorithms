public class PeopleClient
{
    public static void main(String[] args)
    {
        int N = 6;
        People[] pacient = new People[N];
        String[] names = {"Edson", "Alex", "Joao", "Alessandra", "Alberto", "Junior"};
        for (int i = 0; i < N; i++) 
            pacient[i] = new People(names[i], 20);
        for (int i = 0; i < N; i++)
            StdOut.println(pacient[i]);
    }
}