import java.util.*;
public class primemethod{
public static int factors(int num){
int count=0;
for(int i=1;i<=num;i++){
if(num%i==0)
count++;
}
return count;
}


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter no's");
int num=sc.nextInt();
if(factors(num)==2)
System.out.println("prime");
else{
System.out.println("no");

}

}
}
