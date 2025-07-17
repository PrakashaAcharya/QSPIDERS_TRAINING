import java.util.*;
class atm{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

int pin=1234;
int  balance =1000000;
System.out.println("enter the pin");
int atmpin=sc.nextInt();
if(pin==atmpin){
System.out.println("press 1 for deposit");
System.out.println("press 2 for withdraw");
System.out.println("press 3 for balance enquiry");
System.out.println("press 4 for pin change");
int option =sc.nextInt();
switch(option){
case 1: System.out.println("enter the amount to deposit");
        int deposit =sc.nextInt();
        if(deposit>0){
        balance+=deposit;
        System.out.println("tranasctional succesfull");
        System.out.println("available balance is "+balance);
       } 
            else{
                System.out.println("transaction declined");
                System.out.println("invalid deposit amount");
                 }

              break;


case 2: System.out.println("enter the amount to withdraw");
       int withdraw=sc.nextInt();
       if(withdraw>0 && withdraw<=balance){
                           System.out.println("take the cash");
                           balance-=withdraw;
                           System.out.println(balance);
                           }
                     else{
                         System.out.println("transaction declinded");
                           System.out.println("invalid amt");
                         }
             break;

      

 case 3:
       System.out.println( "available balance" +balance);
       break;
 case 4: System.out.println("enter the new pin");
         int newpin=sc.nextInt();
        if(newpin>=1000 && newpin<=9999){

                                  for(int i=1;i<=3;i++){

                                 System.out.println("enter the repin pin");
                                int repin=sc.nextInt();
                                 if(newpin==repin){
                          System.out.println("pin change succefull");
                            pin=newpin;
break;
                
                            
                                                     }
                                                       }
                                                         }
 
       

       
break;
default:System.out.println("sorry");
         
          
          
}
}
else{
System.out.println("invalid pin");
}

}
}
