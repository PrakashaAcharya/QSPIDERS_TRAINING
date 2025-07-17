import java.util.*;

class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.next();

        
        char firstChar = name.charAt(0);

        if (firstChar == 's' || firstChar == 'S') {
            System.out.println("Name starts with 's' or 'S'");
        } else {
            System.out.println("Name does not start with 's' or 'S'");
        }
    }
}
