import java.util.*;

class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char value=sc.next().charAt(0);
        if (value%2==0){
        System.out.println("ascii charcter is even");
}
else{
 System.out.println("ascii charcter is odd");
}
}
}
