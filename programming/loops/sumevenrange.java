import java.util.*;
class sumevenrange{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range");
int start =sc.nextInt();
int end =sc.nextInt();
int sum=0;
for(int i=start;i<=end;i++){
if(i%2==0){

 sum=sum+i;
}




}
System.out.println("even sum range is: "+sum);


}
}


