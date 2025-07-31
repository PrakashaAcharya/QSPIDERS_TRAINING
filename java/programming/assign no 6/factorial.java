import java.util.*;
class factorial{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
int fact =1;
int factor=1;
for(int i=num;i>=1;i--){
 fact=fact*i;
}
System.out.println("factorail is "+fact);
System.out.println("factors are");

for (int i=1;i<=fact;i++){
if(fact%i==0){
System.out.println(i);


}
}

}
}
