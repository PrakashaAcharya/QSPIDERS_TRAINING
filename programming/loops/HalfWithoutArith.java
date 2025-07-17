import java.util.Scanner;

public class HalfWithoutArith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be halved.");
        int a=sc.nextInt();
        int halve=a>>1;
        System.out.println("Halved number is "+halve);
    }
} 