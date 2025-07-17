import java.util.*;
class sumeven{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the range");
int start =sc.nextInt();
int end =sc.nextInt();
int sum=0;
for(int i=start;i<=end;i++){
 sum=sum+i;

}
System.out.println(sum);

if(sum%2==0){
System.out.println("even sum");
}
else{
System.out.println("odd sum");
}
}
}

