import java.util.Arrays;
import java.util.Scanner;
import java.util.Currency;  

class AssignmentI
{
    public static void main(String[] args)
    {
        System.out.println("Assignment I code");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details for calculating the simple interest");
        System.out.println("Enter the principal ");
        int principal = sc.nextInt();
        System.out.println("Enter the rate ");
        float rate = sc.nextFloat();
        System.out.println("Enter the time ");
        float time = sc.nextFloat();
        float ans = principal*rate*time/100;
        System.out.println("Simple interest is " + ans);

        System.out.println();
        System.out.println("Enter the details for calculating the compound interest");
        System.out.println("Enter the value of P ");
        float P = sc.nextFloat();
        System.out.println("Enter the value of n ");
        float n = sc.nextFloat();
        System.out.println("Enter the value of r ");
        float r = sc.nextFloat();
        System.out.println("Enter the value of t ");
        float t = sc.nextFloat();
        float value = (1+r/100);
        double ans2 = P*(Math.pow(value,n));
        System.out.println("Compound interest is " + ans2);

        System.out.println();
        int arr[] = {7,6,3,9,10,26,15,45,78};
        Arrays.sort(arr);
        int secondHighest = arr[arr.length-2];
        System.out.println("Second highest element in an array is "+ secondHighest);

        System.out.println();
        Currency cur = Currency.getInstance("USD"); 
        String dollar = cur.getSymbol();
        System.out.println("Enter the choice for the conversion of the currency");
        System.out.println("Press 1 for  INR to " + dollar);
        System.out.println("Press 2 for " + dollar + " to INR");
        int choice = sc.nextInt();
        System.out.println("Enter the price to convert ");
        float currency=0.0f;

        switch(choice)
        {
            case 1:
                System.out.println("Enter Indian rupee");
                currency = sc.nextFloat();
                currency = currency / 82.81f;
                break;
            
            case 2:
                System.out.println("Enter US dollar");
                currency = sc.nextFloat();
                currency = currency * 82.81f;
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("The value after conversion is " + currency);
        System.out.println();

        int a = 340,b=43,c=800;
        int highest = c>(a>b?a:b)?c:((a>b)?a:b);
        System.out.println("The highest amongst three numbers is " + highest);

    }
}