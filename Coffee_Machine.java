package Coffee_Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee_Machine {

	public static void main(String[] args) {
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" \n         **... Welcome To Vaibhav's Coffee Shope ...**\n");
		try {
		while(true)
		{
			System.out.println("      ** Menu **    ");
			System.out.println("7.milk       = 10 Rs");
			System.out.println("8.coffee     = 7 Rs ");
			System.out.println("9.suger      = 5 Rs ");
			System.out.println("10.water      = 10 Rs ");
			System.out.println("11.tea        = 5 Rs ");
			System.out.println("12.Exit ");
			System.out.println("  Enter your choice   ");
			int ch = Integer.parseInt(br.readLine());
			
			int totalmilk=5000,remainingmilk=0,temp=remainingmilk,fill=0,mtemp=fill;//ml
			int totalcoffee=100,remainingcoffee=0,temp1=remainingcoffee,fill1=0,ctemp=fill1;//gm
			int totalsugar=250,remainingsugar=0,temp2=remainingsugar,fill2=0,stemp=fill2;//gm
			int totalwater=5000,remainingwater=0,temp3=remainingwater,fill3=0,wtemp=fill3;//ml
			int totaltea=100,remainingtea=0,temp4=remainingtea,fill4=0,ttemp=fill4;//gm
			int flag=0;
			int cup;
			switch(ch)
			{
			case 7:
				while(true)
				{
				System.out.println("  ** What you want **   ");
				System.out.println("1.    Buy    ");
				System.out.println("2.    Fill   ");
				System.out.println("3.    Take   ");
				System.out.println("4.    Remaining   ");
				System.out.println("5.    Exit	");
				System.out.println("  Enter your choice    ");
				ch=Integer.parseInt(br.readLine());
				if(ch==1)
				{  
					System.out.println("How many cup you want");
					cup=Integer.parseInt(br.readLine());
					if(cup<=100)
					{
						int pay=cup*10;
						System.out.println("Please Pay "+pay+" Rs");
						int amount=Integer.parseInt(br.readLine());
						if(amount==pay)
						{
					
							System.out.println("Your"+cup+" cups are ready");
							System.out.println("Your bill is= "+pay+" Rs");
							System.out.println("...Please collect your bill... ");
							System.out.println("please press 2 for fill the cup");
							fill=cup*50;
							remainingmilk=totalmilk-fill;
							totalmilk=totalmilk-remainingmilk;
						}
						else 
						{
							System.out.println("Insufficient Rs..");
							System.out.println("Please enter the only required Rs in the box ");
						}	
					}
					else
						System.out.println("Sorry....Milk is below the level...");
				}
				else if(ch==2)
				{
					if(fill>0)
						flag=1;
					if(flag==0)
					{
						System.out.println("Please first buy the Milk");
					}
					if(flag!=0)
					{
						if(remainingmilk>=0)
						{
							System.out.println("Your Milk cup is filling.."+fill+" ml");
							System.out.println("Filling Completed.....");
						}
						else
							System.out.println("Insuffucient Milk...Please Cheak Remaining Milk...");
					}
				}
				else if(ch==3)
				{
					if(fill>0)
						flag=1;
					if(flag==0)
					{
						System.out.println("Please first buy the Milk");
					}
					if(flag!=0)
					{
						System.out.println("Your Order is Ready..");
						System.out.println("Take Your Milk ...");
						System.out.println("Order Completed.....");
					}
				}
				else if(ch==4)
				{
					if(fill==0)
					{
						System.out.println("Remaining Milk is.."+totalmilk+" ml");
					}
					else if(remainingmilk>=0)
					{
						System.out.println("Remaining Milk is.."+remainingmilk+" ml");
						System.out.println("Please always fullfill for good service");
						System.out.println("Remaining Cheaked.....");
					}
					else
						System.out.println(remainingmilk+"..Milk To End...Please Fill Again..");
					
				}
				else if(ch==5)
				{
					System.out.println("...Thank You...");
					break;
				}
				}
				//break;
				continue;
			case 8:
				while(true)
				{
				System.out.println("  **..What Do You Want..**   ");
				System.out.println("1.    Buy    ");
				System.out.println("2.    Fill   ");
				System.out.println("3.    Take   ");
				System.out.println("4.    Remaining   ");
				System.out.println("5.    Exit	");
				System.out.println("  Enter your choice    ");
				ch=Integer.parseInt(br.readLine());
				
				if(ch==1)
				{
					System.out.println("How many cup you want");
					cup=Integer.parseInt(br.readLine());
					if(cup<=20)
					{
						int pay=cup*7;
						System.out.println("Please Pay "+pay+" Rs");
						int amount=Integer.parseInt(br.readLine());
						if(amount==pay)
						{
							System.out.println("Your"+cup+" cups are ready");
							System.out.println("Your bill is= "+pay+" Rs");
							System.out.println("...Please collect your bill... ");
							fill1=cup*5;
							remainingcoffee=totalcoffee-fill1;
							totalcoffee=totalcoffee-remainingcoffee;
						}
						else 
						{
							System.out.println("Insufficient Rs..");
							System.out.println("Please enter the only required Rs in the box ");
						}
					
					//else
					//System.out.println("Sorry...Coffee will be below the level ");
					}
					else
						System.out.println("Sorry...Coffee will be below the level ");
				}
				else if(ch==2)
				{
					if(fill1>0)
						flag=1;
					if(flag==0)
					{
						System.out.println("Please first buy the Coffee");
					}
					if(flag!=0)
					{
						if(remainingcoffee>=0)
						{
						System.out.println("Your Coffee cup is filling.."+fill1+" gm");
						System.out.println("Filling Completed.....");
						}
						else
							System.out.println("Insuffucient Coffee...Please Cheak Remaining Coffee...");
					}
				}
				else if(ch==3)
				{
					if(fill1>0)
						flag=1;
					if(flag==0)
					{
						System.out.println("Please first buy the Coffee");
					}
					if(flag!=0)
					{
						System.out.println("Your Order is Ready..");
						System.out.println("Take Your Coffee ...");
						System.out.println("Order Completed.....");
					}
				}
				else if(ch==4)
				{
					if(fill1==0)
					{
						System.out.println("Remaining Coffee is.."+totalcoffee+" gm");
					}
					else if(remainingcoffee>0)
					{
						System.out.println("Remaining Coffee is.."+remainingcoffee+" gm");
						System.out.println("Remaining Cheaked.....");
					}
					else
						System.out.println(remainingcoffee+"..Coffee To End...Please Fill Again..");
				//	break;
				}
				else if(ch==5)
				{
					System.out.println("...Thank You...");
					break;
				}
				}
			//	break;
				continue;
			case 9:
				while(true)
				{
				System.out.println("  **..What Do You Want..**   ");
				System.out.println("1.    Buy    ");
				System.out.println("2.    Fill   ");
				System.out.println("3.    Take   ");
				System.out.println("4.    Remaining   ");
				System.out.println("5.    Exit	");
				System.out.println("  Enter your choice    ");
				ch=Integer.parseInt(br.readLine());
			
				if(ch==1)
				{
					System.out.println("How many cup you want");
					cup=Integer.parseInt(br.readLine());
					if(cup<=100)
					{
						int pay=cup*10;
						System.out.println("Please Pay "+pay+" Rs");
						int amount=Integer.parseInt(br.readLine());
						if(amount==pay)
						{
							System.out.println("Your"+cup+" cups are ready");
							System.out.println("Your bill is= "+pay+" Rs");
							System.out.println("...Please collect your bill... ");
							fill2=cup*25;
							remainingsugar=totalsugar-fill2;
							totalsugar=totalsugar-remainingsugar;
						}
						else 
						{
							System.out.println("Insufficient Rs..");
							System.out.println("Please enter the only required Rs in the box ");
						}
					
				//	else
				//		System.out.println("Sorry...Sugar will below the level..");
				//		System.out.println("  You need minimum Sugar \n");
					}
					else
					System.out.println("Sugar will be below the level ");
				}
				else if(ch==2)
				{
					if(fill1>0)
						flag=1;
					if(flag==0)
					{
						System.out.println("Please first buy the Coffee");
					}
					if(flag!=0)
					{
						if(remainingcoffee>=0)
						{
							System.out.println("Your Sugar cup is filling.."+fill2+" gm");
							System.out.println("Filling Completed.....");
						}
						else
							System.out.println("Insufficient Sugar... Please cheak the remaining Sugar..");
					}
				}
				else if(ch==3)
				{
					if(fill2>0)
						flag=1;
					if(flag==0)
					{
						System.out.println("Please first buy the Sugar");
					}
					if(flag!=0)
					{
						System.out.println("Your Order is Ready..");
						System.out.println("Take Your Sugar ...");
						System.out.println("Order Completed.....");
					}
				}
				else if(ch==4)
				{
					if(fill2==0)
					{
						System.out.println("Remaining Sugar is.."+totalsugar+" gm");
					}
					else if(remainingsugar>=0)
					{
						System.out.println("Remaining Sugar is.."+remainingsugar+" gm");
						System.out.println("Remaining Cheaked.....");
					}
					else
						System.out.println(remainingsugar+"..Sugar To End...Please Fill Again..");
					break;
				}
				else if(ch==5)
				{
					System.out.println("...Thank You...");
					break;
				}
				}
			//break;
				continue;
			case 10:
				while(true)
				{
				System.out.println("  ** Menu **   ");
				System.out.println("1.    Buy    ");
				System.out.println("2.    Fill   ");
				System.out.println("3.    Take   ");
				System.out.println("4.    Remaining   ");
				System.out.println("5.    Exit	");
				System.out.println("  Enter your choice    ");
				ch=Integer.parseInt(br.readLine());
			
				if(ch==1)
				{
					System.out.println("How many cup you want");
					cup=Integer.parseInt(br.readLine());
					if(cup<=100)
					{
						int pay=cup*10;
						System.out.println("Please Pay "+pay+" Rs");
						int amount=Integer.parseInt(br.readLine());
						if(amount==pay)
						{
							System.out.println("Your"+cup+" cups are ready");
							System.out.println("Your bill is= "+pay+" Rs");
							System.out.println("...Please collect your bill... ");
							fill3=cup*50;
							remainingwater=totalwater-fill3;
							totalwater=totalwater-remainingwater;
						}
						else 
						{
							System.out.println("Insufficient Rs..");
							System.out.println("Please enter the only required Rs in the box ");
						}
					
					}
					else
						System.out.println("Sorry...Water will below the level..");
					
				//	else
				//	System.out.println("Water will be below the level ");
				}
				else if(ch==2)
				{
					if(fill3>0)
						flag=1;
					if(flag==0)
					{
						System.out.println("Please first buy the Water");
					}
					if(flag!=0)
					{
						if(remainingsugar>=0)
						{
							System.out.println("Your Water cup is filling.."+fill3+" ml");
							System.out.println("Filling Completed.....");
						}
						else
							System.out.println("Insufficient Water... Please cheak the remaining Water..");
					}
				}
				else if(ch==3)
				{
					if(fill3>0)
						flag=1;
					if(flag==0)
					{
						System.out.println("Please first buy the Water");
					}
					if(flag!=0)
					{
						System.out.println("Your Order is Ready..");
						System.out.println("Take Your Water...");
						System.out.println("Order Completed.....");
					}
				}
				else if(ch==4)
				{
					if(fill3==0)
					{
						System.out.println("Remaining Water is.."+totalwater+" ml");
					}
					else if(remainingwater>=0)
					{
						System.out.println("Remaining Water is.."+remainingwater+" ml");
						System.out.println("Remaining Cheaked.....");
					}
					else
						System.out.println(remainingwater+"..Water To End...Please Fill Again..");
						break;
						
				}
				else if(ch==5)
				{
					System.out.println("...Thank You...");
					break;
				}
				}
			//	break;
				continue;
			case 11:
				while(true)
				{
				System.out.println("  **..What Do You Want..**   ");
				System.out.println("1.    Buy    ");
				System.out.println("2.    Fill   ");
				System.out.println("3.    Take   ");
				System.out.println("4.    Remaining   ");
				System.out.println("5.    Exit	");
				System.out.println("  Enter your choice    ");
				ch=Integer.parseInt(br.readLine());
	
				if(ch==1)
				{
					System.out.println("How many cup you want");
					cup=Integer.parseInt(br.readLine());
					if(cup<=100)
					{
						int pay=cup*10;
						System.out.println("Please Pay "+pay+" Rs");
						int amount=Integer.parseInt(br.readLine());
						if(amount==pay)
						{
							System.out.println("Your"+cup+" cup Tea are ready");
							System.out.println("Your bill is= "+pay+" Rs");
							System.out.println("...Please collect your bill... ");
							fill4=cup*5;
							remainingtea=totaltea-fill4;
							totaltea=totaltea-remainingtea;
						}
						else 
						{
							System.out.println("Insufficient Rs..");
							System.out.println("Please enter the only required Rs in the box ");
						}
					}
					else
						System.out.println("Sorry...Tea will be below the level ");
					
					//else
					//	System.out.println("Tea will be below the level ");
				}
				else if(ch==2)
				{

					if(fill4>0)
						flag=1;
					if(flag==0)
					{
						System.out.println("Please first buy the Tea");
					}
					if(flag!=0)
					{
						if(remainingtea>=0)
						{
						System.out.println("Your Tea cup is filling.."+fill4+" gm");
						System.out.println("Filling Completed.....");
						}
						else
							System.out.println("Insufficient Tea... Please cheak the remaining Tea..");
					}
				}
				else if(ch==3)
				{
					if(fill4>0)
						flag=1;
					if(flag==0)
					{
						System.out.println("Please first buy the Tea");
					}
					if(flag!=0)
					{
						System.out.println("Your Order is Ready..");
						System.out.println("Take Your Tea ...");
						System.out.println("Order Completed.....");
					}
				}
				else if(ch==4)
				{
					if(fill4==0)
					{
						System.out.println("Remaining Tea is.."+totaltea+" gm");
					}
					else if(remainingtea>=0)
					{
						System.out.println("Remaining Tea is.."+remainingtea+" gm");
						System.out.println("Remaining Cheaked.....");
					}
					else
						System.out.println(remainingtea+"..Tea To End...Please Fill Again..");
					break;
				}
				else if(ch==5)
				{
					System.out.println("...Thank You...");
					break;
				}
				}
				//break;
				continue;
			case 12:
				System.out.println("Are You Sure...For Exit..");
				System.out.println("1. Yes");
				System.out.println("2. No");
				ch=Integer.parseInt(br.readLine());
				if(ch==2)
				{
					continue;
				}
				else
				System.out.println("...Thank You for Visiting Vaibhav's Coffee Shop...");
				System.out.println("	    ....... Visit Again .......");
				break;
			default:
				System.out.println("............ Invalid Option .........");
				System.out.println(" ... Please choose Correct Option ...\n");
				continue;
			}
			break;
				
		}
			} catch (NumberFormatException e) {
			
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}
}
