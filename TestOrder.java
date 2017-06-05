import java.util.*;
public class  TestOrder{
static Scanner read=new Scanner(System.in);
public static void main (String[]args){
int num,choice;
String name,Flavor;
char size,fruit;
boolean result;

System.out.println(" Enter customer name:");
 name=read.nextLine();
System.out.println(" Enter the maximum number of desserts in the order:");
 num=read.nextInt();
Order order1=new Order(name,num);

do{
System.out.println("\nplease Enter your choice");

System.out.println("1)Add a new dessert (CupCake or IceCream) to order1.");
System.out.println("2)Print all desserts in the order1");
System.out.println("3)Print total cost of the order.");
System.out.println("4) Print all the ice creams in order1 with a specific Flavor");
System.out.println("5) Exit ");
choice=read.nextInt();
switch(choice){

case 1:
Dessert obj;
 System.out.println("\nplease choose between adding a CupCake or IceCream");
String selection=read.next();
if(selection.toLowerCase().equals("cupcake")){
System.out.println("Enter the Flavor");
Flavor=read.next();

do{ System.out.println(" Enter the size where 'S' for small, 'M' for medium, and 'L' for large size."); size = read.next().charAt(0); }
while ( Character.toLowerCase(size) != 's' && Character.toLowerCase(size) != 'm' && Character.toLowerCase(size) != 'l' );

 System.out.println(" Do you want fruit? write 'y' for yes or 'n' for no:");{
fruit= read.next().charAt(0);
switch ( fruit ) { 
case 'y': 
case 'Y': 
result = true; break;
case 'n':
case 'N': 
result = false; break; 
default: System.out.println(" Invalid choice");
result = false; }
}//whith fruite
obj = new CupCake (Flavor , size , result); 
if (order1.AddDessert(obj)) System.out.println (" the addition is  successful."); else System.out.println(" the addition isn't  successful."); }
////////////////////////////////////////
if(selection.toLowerCase().equals("icecream")){
System.out.println("Enter the Flavor");
Flavor=read.next();

do{ System.out.println(" Enter the size where 'S' for small, 'M' for medium, and 'L' for large size."); size = read.next().charAt(0); }
while ( Character.toLowerCase(size) != 's' && Character.toLowerCase(size) != 'm' && Character.toLowerCase(size) != 'l' );

System.out.println(" Enter the number Of Scoops");
num=read.nextInt();

obj=new IceCream(Flavor,size,num);
if (order1.AddDessert(obj)) System.out.println (" the addition is  successful.");
else System.out.println(" the addition isn't  successful.");
}//close if
//////////////////////////////////////

break;

case 2:System.out.println(order1);


break;

case 3:System.out.println("The total cost is: "+order1.GetTotalCost());

break;

case 4:System.out.println("Enter the Flavor");
Flavor=read.next();
Dessert []IceCreams=order1.GetIceCream(Flavor);
 if (IceCreams != null ) {
System.out.println("The IceCream with this flavor is: ");
 for ( int i=0 ; i< IceCreams.length ; i++)
   if(IceCreams[i] != null ) 
System.out.println(IceCreams[i]); }//end outer if 
else System.out.println(" There is not any ice cream with this flavor");
break;

case 5:break;

default:System.out.println("invalid choice ");
}//end switch
}//end do
while(choice!=5);
}//end main
}//end class TestOrder


