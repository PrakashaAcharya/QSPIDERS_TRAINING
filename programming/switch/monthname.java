import java.util.*;
class monthname{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the month number");
int n=sc.nextInt();
switch(n){
case 1: System.out.println("month is january");
       break;
case 2: System.out.println("month is febraury");
       break;
case 3: System.out.println("month is march");
       break;
case 4: System.out.println("month is april");
       break;
case 5: System.out.println("month is may");
       break;
case 6: System.out.println("month is june");
       break;
case 7: System.out.println("month is july");
       break;
case 8: System.out.println("month is august");
       break;
case 9: System.out.println("month is september");
       break;
case 10: System.out.println("month is october");
       break;
case 11: System.out.println("month is november");
       break;
case 12: System.out.println("month is december");
       break;
default:System.out.println("invalid month");
}
}
}