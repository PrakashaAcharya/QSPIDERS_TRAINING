import java.util.*;
class signal{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the signal colour");
String signal=sc.next();
switch(signal){
case "red": System.out.println("stop and wait for mins");
            break;
case "yellow": System.out.println("please be ready to move");
            break;
case "green": System.out.println("thanks for waiting you can go now");
            break;
default: System.out.println("invalid signal");
}
}
}