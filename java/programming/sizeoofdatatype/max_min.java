import java.util.*;
class largest{
public static void main(String[] args){
Scanner sc =new Scannwer (System.in);
System.out.println("enter the num");
int num=sc.nextInt();
System.out.println("enter the nT value");
int nth=sc.nextInt();
int large=0;
while(num>0)
{
int ld=num%10;
if(ld>large)
large=ld;
num=num/10;
}
Sytem.out.println(large);
}
}
