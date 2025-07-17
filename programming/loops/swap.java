import java.util.*;
class swap{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("before swapping");
System.out.println("enter numbers to swap");
int a =sc.nextInt();
int b =sc.nextInt();
System.out.println("after swapping");
a=a+b;
b=a-b;
a=a-b;
System.out.println( "value of a is "+a+" :value of b is "+b);
}
}
