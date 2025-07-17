/* calculate the total price of all the items present in the cart 
apply the discount to the total price 
return the discounted price as an integer where u round of the value...
the price of the item will be in float value
the discount per is in int format
the total price after applying the discount needs to be returned in thr int format*/


class store{
public static void main(String[] args){



String item1="icecream";
String item2="chocolate";


float price1=300.0f;
float price2=420.0f;

int discount=10;
double total=price1+price2;

double discount1= total-total*10/100;
int last=(int)discount1;

System.out.println(last);
}
}






