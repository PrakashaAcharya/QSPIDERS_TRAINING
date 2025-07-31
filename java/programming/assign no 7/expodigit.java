
import java.util.*;
class expodigit{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbeer");
int num=sc.nextInt();
int firstdigit=0;
int lastdigit=0;
int expo=1;

lastdigit=num%10;
while(num>9){
num=num/10;

}
firstdigit=num;
System.out.println("first digit is "+firstdigit);
System.out.println("last digit is "+lastdigit);
 for(int i=1;i<=lastdigit;i++){
expo=expo*firstdigit;

}
System.out.println("expo is " + expo);
}
}