import java.util.*;
class calculator{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number");
int a=sc.nextInt();
System.out.println("enter the second number");
int b=sc.nextInt();
System.out.println("enter the operator");
char result=sc.next().charAt(0);


switch(result){
case '+' :System.out.println("addition result is "+(a+b));
break;
case '-' :System.out.println("substraction result is "+(a-b));
break;
        
case '*' :System.out.println("multiplication result is "+(a*b));
break;

case '/' :if(b!=0){
System.out.println("division result is "+(a/b));
}
else {
System.out.println("cannot divide by zero");
}

break;
        
        

default:System.out.println("invalid");
}
}
}