
import java.util.*;
class counteven{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbeer");
int num=sc.nextInt();
int count=0;
while (num != 0) {
                num = num / 10; 
                count++;        
            }
System.out.println("count is "  +count);
if(count%2==0){
System.out.println("count is even");
}
else {
System.out.println("count is odd");
}
}
}