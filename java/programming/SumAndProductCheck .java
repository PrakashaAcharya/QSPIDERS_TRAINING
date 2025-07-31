import java.util.*;

public class SumAndProductCheck {

   
    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return sum;
    }

   
    public static int product(int num) {
        int product = 1;
        while (num > 0) {
            int digit = num % 10;
            product *= digit;
            num = num / 10;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (sum(num) == product(num)) {
            System.out.println("Sum of digits is equal to product of digits");
        } else {
            System.out.println("Not equal");
        }
    }
}
