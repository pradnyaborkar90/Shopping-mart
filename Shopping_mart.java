package n;

import java.util.Scanner;
import java.util.Vector;
import java.util.Date;
class Item{
String name;
float price;
int qty;
private Scanner sc;
Item()
{int g;
do{ g=0;
try{	sc = new Scanner(System.in);
		System.out.println("enter the name  of the items and price and qty");
		name=sc.nextLine();
		
		price=sc.nextFloat();
		qty=sc.nextInt();
}catch(Exception e){System.out.println("error"); g=1;}
}while(g==1);
}
void display()
{
	
	System.out.println(name+"  "+" "+price+"  "+qty);
}
}
class customer 
{
	Vector<Item> list=new Vector<Item>();
	Scanner sc=new Scanner(System.in);
	String cust_name,address,email;
	customer(){
		cust_name=" ";
		address=" ";
		email=" ";
	}
	
	customer(int i)
	{
		System.out.println("enter your name ");
		cust_name=sc.nextLine();
		System.out.println("address");
		address=sc.nextLine();
		System.out.println("email");
		email=sc.nextLine();
	}
	void display()
	{
		System.out.println(cust_name+"\t"+email);
		for(int i=0;i<list.size();i++){
			Item i1=(Item)list.elementAt(i);
			i1.display();
		}
	}
	void additem()
	{
		int y;
		do{
			y=0;
		Item i1=new Item();
		list.addElement(i1);
		System.out.println("press 1 if u wish to buy more items");
		y=sc.nextInt();
		}while(y==1);
	}
	float totalprice()
	{ float tprice=0.0f;
		for(int i=0;i<list.size();i++){
			Item i1=(Item)list.elementAt(i);
			
			tprice+=(i1.price*i1.qty);
		
		}
		return tprice;
		}
	
	void Remove()
	{
		int t;
		do{
			t=0;
		System.out.println("Enter name of item to be removed");
		String object=sc.next();
		for(int i=0;i<list.size();i++)
		{
			Item i1=(Item)list.elementAt(i);
			if(object.equalsIgnoreCase(i1.name))
			{
				list.remove(i);
				
			}
		}
		System.out.println("do u wish to remove any other item then press 1");
		t=sc.nextInt();
		}while(t==1);
	}
}
class Account
{
	String n;
	Scanner sc=new Scanner(System.in);
	String username;
	String Password;
	Account a;
	
	Account()
	{
		System.out.println("enter username");
		username=sc.nextLine();
		System.out.println("enter password");
		Password=sc.nextLine();
		
	
	}
	
}
public class market {
	private static Scanner sc;

	public static void main(String args[])
	{
		Date date=new Date();
		customer c=new customer();
		sc = new Scanner(System.in);
		Vector<Account> v=new Vector<Account>();	
		int flag;
		do{
			System.out.println("Press:\n1)To Sign up \n2)To login \n");
		int choice=sc.nextInt();
		switch(choice){
			case 1:
					flag=0;
					try{
						Account a=new Account();
					
						for(int i=0;i<v.size();i++)
						{
							Account i1=(Account)v.elementAt(i);
							if((i1.username).equals(i1.username))
							{
								System.out.println("Username exist try using  other name or login to urs existing account");
								flag=1;
							}
						}
						if (flag==0)
						{
							 c=new customer(1);
						v.add(a);
						
						}
					}catch(Exception e){
						System.out.println("enter correct data");
					}
						break;
			case 2:		flag=0;
			
						System.out.println("enter the user name,password");
						String s=sc.next();
						String p=sc.next();
						for(int i=0;i<v.size();i++)
						{
							Account i1=(Account)v.elementAt(i);
							String str=i1.username;
							String str2=i1.Password;
							if(s.equals(str) || p.equalsIgnoreCase(str2))
							{
								//System.out.println("Username exist try using  other name or login to urs existing account");
								flag=1;
							}
						}
						if(flag==0)
						{
							
							System.out.println("Password or Username is invalid");
						}
					
					if(flag==1)
						{
						//customer c=new customer();
						c.additem();
						c.Remove();
						System.out.println("Generating bill:");
						c.display();
						System.out.println("total amount:"+c.totalprice());
						System.out.println(date);
						}
						break;
			
			default:System.out.println("wrong choice");
			
			
	}
	System.out.println("do u wish to continue then press 5");
	
	
	}while(sc.nextInt()==5);
}

}
		
	


