
import java.util.*;
class sumrangedivisble{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the start and end of the range");
int start=sc.nextInt();
int end=sc.nextInt();
int sum=0;
System.out.println(" enter the the numbeer which divides sum");
int num=sc.nextInt();

for(int i=start;i<=end;i++)
{
sum=sum+i;
}
if(sum%num==0){
System.out.println("sum is divisible by given no and the sum is "+sum);
}
else {
System.out.println("sum is not divisible by given no");

}

}
}