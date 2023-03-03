import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class PatternExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text for pattern matching");
        String str = sc.nextLine();
        System.out.println(Pattern.matches("443[^a-z]*",str)); // must return true

    }
}