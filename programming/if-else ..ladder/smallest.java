import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt();


        if (a< b && a< c && a <d && a < e){
           System.out.println("a is smaller");}
        else if (b < c && b < d && b < e){
            System.out.println("b is smaller");}
        else if (c < d && c < e){
             System.out.println("c is smaller");}
        else if (d < e){
            System.out.println("d is smaller");}
        else{
            System.out.println("e is smaller");}

    
    }
}
