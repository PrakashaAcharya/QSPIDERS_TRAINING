import java.util.*;
class evennumbersinrange {
public static void range(int s,int e){
	if(s<=e){
		if(s%2==0){
		System.out.println(s);}
		range(s+1,e);
	}
}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter tha range");
		int start=sc.nextInt();
		int end=sc.nextInt();
		range(start,end);
	}
}
