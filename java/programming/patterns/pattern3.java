class pattern3 
{  public static void display(){
	char ch='A';
		for( int r=1;r<=5;r++){
			for(int c=1;c<=5;c++){
				if(c>=r)
				System.out.print(" * ");
			}
		System.out.println();
		}
}
	public static void main(String[] args) 
	{ 
		display();
	}
}

