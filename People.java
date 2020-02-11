public class People
{
    private final String name;
    private int age;

    
    public People(String setName, int setAge)
    {
        name = setName;
        age = setAge;
    }
    public String toString()
    {
        return "Name: " + name + " Age: " + age;
    }
}