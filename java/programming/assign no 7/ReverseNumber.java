import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int reverse = 0;
        
        while (number != 0) {
            int digit = number % 10;      
            reverse = reverse * 10 + digit;
            number = number / 10;         
        }

        System.out.println("Reversed number: " + reverse);
if(reverse%2==0){
System.out.println("reversed number is even");
    }
else{
System.out.println("reversed number is odd ");
}
}

}
