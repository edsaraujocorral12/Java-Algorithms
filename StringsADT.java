public class StringsADT
{
    public static void main(String[] args)
    {
        String name = "Edson";
        int nameLength = name.length();
        StdOut.println(nameLength);
        StdOut.println(name.charAt(0));
        StdOut.println(name.indexOf("s")); 
        StdOut.println(name.concat(" Araujo"));
        StdOut.println(name.substring(1, 3));
    }
}