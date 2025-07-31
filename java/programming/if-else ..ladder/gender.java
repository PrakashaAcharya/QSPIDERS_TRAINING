import java.util.*;

class gender{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter the gender");
char gender=sc.next().charAt(0);
 if(gender=='m' || gender=='M'){
System.out.println("gender is male");
}
else if(gender=='f' || gender=='F'){
System.out.println("gender is female");
}
else if(gender=='o' || gender=='O'){
System.out.println("gender is other");
}
else{
System.out.println("invalid gender");
}
}
}

