import java.util.Scanner;
public class AddWithoutArith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int carry=b;
        while(carry!=0){
            carry=(a&b)<<1;
            a=a^b;
            b=carry;
        }
        System.out.println("Sum is "+a );
    }
}