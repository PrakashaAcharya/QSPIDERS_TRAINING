import java.util.*;

class studentdetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter the marks");
int marks=sc.nextInt();
if(marks>100){
System.out.println("invalid marks");
}
else if(marks>=95 && marks <=100)
{
System.out.println("grade is A+ ");
}
else if(marks>=85 && marks<=94){
System.out.println("grade is A ");

}

else if(marks>=75 && marks<=84){
System.out.println("grade is B+ ");
}
else if(marks>=70 && marks<=74){
System.out.println("grade is B ");
}
else if(marks>=50 && marks<=69){
System.out.println("grade is c ");

}
else if(marks>=35 && marks<=49){
System.out.println("grade is pass ");
}
else {
System.out.println("student is fail");
}
}
}
