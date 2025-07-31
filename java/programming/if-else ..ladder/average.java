import java.util.*;

class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 nos:");
        double n1=sc.nextDouble();
        System.out.println("Enter the 2 nos:");
        double n2=sc.nextDouble();
        System.out.println("Enter the 3 nos:");
        double n3=sc.nextDouble();
        System.out.println("Enter the 4 nos:");
        double  n4=sc.nextDouble();
        System.out.println("Enter the 5 nos:");
        double n5=sc.nextDouble();
        double avg=(n1+n2+n3+n4+n5)/5; 
        if(avg%2==0){
        System.out.println("avg of 5 no is even");
}
else{
System.out.println("avg of 5 no is odd");
}

}
}
        