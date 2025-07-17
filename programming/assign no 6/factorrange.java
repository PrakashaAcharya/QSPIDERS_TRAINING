
import java.util.*;
class factorrange{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the start and end of the range");
int start=sc.nextInt();
int end=sc.nextInt();
int sum=0;
for(int i=start;i<=end;i++){
if(end%i==0){
sum=sum+i;
}
}
System.out.println("summation of factors btw the range is:"+sum);
}
}
