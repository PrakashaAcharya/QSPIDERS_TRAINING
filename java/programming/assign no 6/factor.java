import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be counted.");
        int n=sc.nextInt();
int count=0;
        for(int i=1;i<=n;i++){
        if(n%i==0){
 count++;
}
}
System.out.println("count is "+ count);
if(count%2==0){
System.out.println("even");
}
else{
System.out.println("odd");
}
}
}