import java.util.Scanner;

public class MultiWithoutArith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be doubled.");
        int a=sc.nextInt();
        int doubled=a<<1;
        System.out.println("Doubled number is "+doubled);
    }
}