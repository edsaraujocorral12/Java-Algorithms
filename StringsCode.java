public class StringsCode 
{
    //is the String a palindrome
    public static boolean isPalindrome(String s)
    {
        int N = s.length();
        for (int i = 0; i < N/2; i++)
            if (s.charAt(i) != s.charAt(N-1-i))
                return false;
        return true;
    }
    //Extract file name and extention from command-line argument

    public static void main(String[] args)
    {
        //Extract file name and extention from command-line argument
        String s = args[0];
        int dont = s.rank(".");
        String base = s.substring(0, dot);
        String extension = s.substring(dot + 1, s.length());

        
    }
}