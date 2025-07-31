import java.util.*;

class largest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  numbers");
        int n1=sc.nextInt();
       int n2=sc.nextInt();
       int n3=sc.nextInt();
       int n4=sc.nextInt();
       int n5=sc.nextInt();
if(n1>n2 &&  n1>n3 && n1>n4 && n1>n5){
System.out.println("n1 is greater");
}
else if(n2>n1&& n2>n3 && n2>n4 &&n2>n5){
System.out.println("n2 is greater");}
else if(n3>n1 && n3>n2 && n3>n4 && n3>n5){
System.out.println("n2 is greater");}
else if(n4>n1 && n4>n2 && n4>n3&& n4>n5){
System.out.println("n4 is greater");}
else if(n5>n1 && n5>n2 && n5>n3 && n5>n4){
System.out.println("n5 is greater");}
}
}
