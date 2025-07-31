import java.util.*;
class stongnumberINrange{
public static int sum(int num){
int sum=0;
while(num>0){
int ld=num%10;
sum=sum+fact(ld);
num=num/10;
}
return sum;
}
public static int fact(int num){
int fact=1;
for(int i=num;i>=1;i--){
fact=fact*i;
}
return fact;
}
public static void main(String[] args){
Scanner sc=new Scanner (System.in);
System.out.println("enter range");
int start =sc.nextInt();
int end=sc.nextInt();
for(int i=start;i<=end;i++){
if(sum(i)==i)

System.out.println(i); 
}
}
}
