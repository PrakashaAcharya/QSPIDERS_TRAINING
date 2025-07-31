
import java.util.*;
class last2digit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbeer");
int num=sc.nextInt();
for(i=1;i<=2;i++)
{
num=num%10;
}
System.out.println(num);
}
}