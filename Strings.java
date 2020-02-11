public class Strings
{
    public static void main(String[] args)
    {
        String firstName = "Edson ";
        String lastName = "Corral";

        //Concatanation
        String fullName = firstName + lastName;
        //@Test
        System.out.println(fullName);

        System.out.println("The Square root of 2.0 is " + Math.sqrt(2.0));

        int age = 29;
        String age_s = "" + age;

        String name = args[0];
        System.out.println(name);

        
    }
}