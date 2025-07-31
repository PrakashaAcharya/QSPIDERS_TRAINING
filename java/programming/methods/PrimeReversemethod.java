import java.util.*;
public class PrimeReversemethod{
public static int factors(int num){
int count=0;
for(int i=1;i<=num;i++){
if(num%i==0)
count++;
}
return count;
}
public static int reverse(int num){
int rev=0;
while(num>0){
int  ld=num%10;
rev =rev*10+ld;
num=num/10;

}
return rev;
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter no's");
int num=sc.nextInt();
if(factors(num)==2 && factors(reverse(num))==2)
System.out.println("prime");
else{
System.out.println("no");

}

}
}
