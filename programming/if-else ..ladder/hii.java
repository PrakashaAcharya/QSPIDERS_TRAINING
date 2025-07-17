/* write a program to print the students marks card as instructed below
1.accept the student individual student marks from the users .
2.print the grade along with the subject marks
3.print the total marks scored by the student
4.print the aggregate scored by the students
*/
import java.util.*;

class hii{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the marks in kannada:");
int n1=sc.nextInt();
System.out.println("Enter the marks in english:");
int n2=sc.nextInt();
System.out.println("Enter the marks in hindi:");
int n3=sc.nextInt();
System.out.println("Enter the marks in science:");
int n4=sc.nextInt();
System.out.println("Enter the marks in social:");
int n5=sc.nextInt();
System.out.println("Enter the marks in maths:");
int n6=sc.nextInt();



int total_marks=(n1+n2+n3+n4+n5+n6);
System.out.println( "total marks is :"+total_marks);
double percentage=(total_marks*100)/600;
System.out.println("Agrgregate is :"+ percentage);

if(percentage>100){
System.out.println("invalid marks");
}
else if(percentage>=80 && percentage<=100){
System.out.println(" student got Distinction");
}


else if(percentage>=70 && percentage<=80){
System.out.println(" student got first class with distinction");
}

 else if(percentage>=65 && percentage<75){
System.out.println(" student got first class");
}
 else if(percentage>=35 && percentage<65){
System.out.println(" student got second class");
}
else{
System.out.println("result is outheld");
}
}
}
 

