/* write a program to perform all the arithmetic opearations for 2 nos */
import java.util.*;
class arithmeticoperations{
 public static int sum(int a,int b){
 System.out.println("sum is ");
return (a+b);
}
 public static int sub(int a,int b){
 System.out.println("sub is");

return (a-b);
}
 public static int mul(int a,int b){
 System.out.println("mul is");
return (a*b);
}
 public static int div(int a,int b){
 System.out.println("div is");
return (a/b);
}
public static void main(String[] args){
System.out.println("ARITHMETIC OPERATIONS RESULT IS");
Scanner sc=new Scanner(System.in);
int num=1;
while(num>0){
System.out.println("Enter the nos");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Enter the choice");
System.out.println("1:ADDITION\n2:SUBSTRACTION\n3:MULTIPLICATION\n4:DIVISION");
int choice=sc.nextInt();
switch(choice){
 case 1 : System.out.println(sum(a,b));
          System.out.println("press 1 for continue or 0 for exit");
          num=sc.nextInt();
            break;
 case 2: System.out.println(sub(a,b));
           System.out.println("press 1 for continue or 0 for exit");
          num=sc.nextInt(); 
           break;
 case 3: System.out.println(mul(a,b));
         System.out.println("press 1 for continue or 0 for exit");
          num=sc.nextInt();
           break;
 case 4: System.out.println(div(a,b));
         System.out.println("press 1 for continue or 0 for exit");
          num=sc.nextInt();
           break;
 default: System.out.println("invalid op");
}
}
}
}