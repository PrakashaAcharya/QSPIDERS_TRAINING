
import java.util.*;
class firsttwodigit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbeer");
int num=sc.nextInt();
while(num>99){
num=num/10;
}
System.out.println(num);
}
}