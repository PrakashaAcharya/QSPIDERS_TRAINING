import java.util.*;
class happynumber 
{
	public static int sumofsquaresofdigit(int num){
		int sum=0;
		while(num>0){
			int ld=num%10;
			sum=sum+(ld*ld);
			num=num/10;
			
			
	}
	return sum;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int num=sc.nextInt();
		while(num!=1 && num!=4){
			num=sumofsquaresofdigit(num);
	}
	if(num==1){
		System.out.println("happy no");}
		else{
			System.out.println("not");
}
	}
}
