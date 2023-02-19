import java.util.Scanner;

class Others
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Aayush Tiwari");
        System.out.println("Enter two numbers to do arithmetic operations -> ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The addition of the digits is - " + (num1+num2));
        System.out.println("The subtraction of the digits is - " + (num1-num2));
        System.out.println("The division is - " + (num1/num2));
        System.out.println("The product is - " + (num1*num2));
        System.out.println("Enter three numbers to get the average -> ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float average = (a+b+c)/3;
        System.out.println("The average of the digits is - " + average);
    }
}