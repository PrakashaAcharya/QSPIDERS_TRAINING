import java.util.*;
public class SquareandSum{
public static int square(int num){
return num*num;
}
public static int sum(int num){
int sum=0;
while(num>0){
int digit=num%10;
sum=sum+digit;
num=num/10;
}
return sum;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in); 
int num=sc.nextInt();
if(sum(square(num))==num){
System.out.println("neon number");
}
else{
System.out.println("not neon number");
}
}
}
