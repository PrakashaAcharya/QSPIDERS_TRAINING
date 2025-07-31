import java.util.*;
class loop3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the start and end");
int n1=sc.nextInt();
int n2=sc.nextInt();
/*
for(int i=n1;i<=n2;i++){
if(i%2==0){
System.out.println(i);
}
}
*/
int i=n1;
while(i<=n2){
if(i%2==0){
System.out.println(i);

}
i++;
}
}
}