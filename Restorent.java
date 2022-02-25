package Coffee_Machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Restorent {

	public static void main(String[] args) {   
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println("                       *******     					  ");
		System.out.println("     ##... Welcome To Vaibhav's Restorent.com ...## \n");
		
		int totalbill=0,amount1=0,amount2=0,amount3=0,amount4=0;
		int amount13=0,amount14=0,amount15=0,amount16=0;
		int southind=0,amount5=0,amount6=0,amount7=0,amount8=0;
		int northind=0,amount9=0,amount10=0,amount11=0,amount12=0;
		int rajasthani=0,amount17=0,amount18=0,amount19=0,amount20=0;
		int gujrati=0,amount21=0,amount22=0,amount23=0,amount24=0;
		int bangali=0,delivery1=0,delivery2=0,delivery3=0,delivery4=0;
		int desert=0,colddrink=0,amount25=0,amount26=0,amount27=0,amount28=0;
		
			while(true)
			{
				System.out.println("      #*..Menu..*#");
				System.out.println("1.  South Indian Dishes			7. Cold Drinks");
				System.out.println("2.  North Indian Dishes			8. Ice Creams");
				System.out.println("3.  Rajasthani Dishes			9. Tea");
				System.out.println("4.  Gujarati  Dishes				10. Juce");
				System.out.println("5.  Bangali Dishes				11. Break Fasts");
				System.out.println("6.  Dessert Dishes				12. Latur's Speacial Vadapav");
				System.out.println("				0.  Exit\n");
				System.out.println("Enter Your Choice");
				  
				int ch=Integer.parseInt(br.readLine());
				if(ch==8||ch==9||ch==10||ch==11||ch==12)
				{
					System.out.println("Work in progress on This Option ");
				}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
				switch(ch)
				{
				case 1:
					while(true)
					{
					System.out.println("\n  Welcome To South Indian Food Court \n");
					System.out.println(" 		.. Menu ..			");
					System.out.println("1.  Chole Bhature    	= 40 rs");
					System.out.println("2.  Idali Samber     	 	= 30 rs");
					System.out.println("3.  Puttu           		= 20 rs");
					System.out.println("4.  Masala Dosa	     	= 60 rs");
					System.out.println("5.  Exit\n");
					System.out.println("Enter Your Choice");
					int ch1=Integer.parseInt(br.readLine());
					if(ch1==6||ch1==7||ch1==8||ch1==9||ch1==0)
					{
						System.out.println("Please enter Correct Option ....");
					}
					if(ch1==1)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay1=plates*40;
						while(true)
						{
						System.out.println("Select Your Payment Option..\n");
						System.out.println("1.	Google Pay  ");
						System.out.println("2.	Phone Pay  ");
						System.out.println("3.	Internet Banking  ");
						System.out.println("4.	Debit / Credit Card   ");
						System.out.println("5.	Cash on Delivary");
						System.out.println("6.	Back");
						int chs=Integer.parseInt(br.readLine());
						if(chs==1||chs==2)
						{
							System.out.println("Please Pay "+pay1+" Rs");
							amount1=Integer.parseInt(br.readLine());
							if(amount1>=pay1)
							{
								System.out.println("Take Your Chole Bhature sir/mam");
								break;
							}
							else
								System.out.println("Please Pay the only accurate amount ");
						}
						else if(chs==3)
						{
							System.out.println("User Name");
							String user=br.readLine();
							System.out.println("Password");
							int pass=Integer.parseInt(br.readLine());
		
							System.out.println("Please Pay "+pay1+" Rs");
							amount1=Integer.parseInt(br.readLine());
							if(amount1>=pay1)
							{
								System.out.println("Take Your Chole Bhature sir/mam");
								break;
							}
							else
								System.out.println("Please Pay the only accurate amount ");
						}
						if(chs==4)
						{
							System.out.println("Enter Card Number : ");
							int no[]=new int[12];
							for(int i=0;i<no.length;i++)
							{
								no[i]=Integer.parseInt(br.readLine());
							}
							System.out.println("Ex Date");
							int dt=Integer.parseInt(br.readLine());
							System.out.println("CVV");
							int cvv=Integer.parseInt(br.readLine());
							System.out.println("Please Pay "+pay1+" Rs");
							amount1=Integer.parseInt(br.readLine());
							if(amount1>=pay1)
							{
								System.out.println("Take Your Chole Bhature sir/mam");
								break;
							}
							else
								System.out.println("Please Pay the only accurate amount ");
						}
						if(chs==5)
						{
							delivery1=plates*40;
							System.out.println("Your Orders are Received .....");
							System.out.println("Your Order will be Dilivered soon ..");
							System.out.println("Your Payment are added on Receipt ...");
							System.out.println("You can Pay Your Amount on Delivery Time ....");
							break;
						}
						if(chs==6)
						{
							break;
						}
						}
												
					}
					else if(ch1==2)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay2=plates*30;
						while(true)
						{
						System.out.println("Select Your Payment Option..\n");
						System.out.println("1.	Google Pay  ");
						System.out.println("2.	Phone Pay  ");
						System.out.println("3.	Internet Banking  ");
						System.out.println("4.	Debit / Credit Card   ");
						System.out.println("5.	Cash on Delivary");
						System.out.println("6.	Back");
						int chs=Integer.parseInt(br.readLine());
						if(chs==1||chs==2)
						{
							System.out.println("Please Pay "+pay2+" Rs");
							amount2=Integer.parseInt(br.readLine());
							if(amount2>=pay2)
							{
								System.out.println("Take Your Idali Samber sir/mam");
								break;
							}
							else
								System.out.println("Please Pay the only accurate amount ");
						}
						else if(chs==3)
						{
							System.out.println("User Name");
							String user=br.readLine();
							System.out.println("Password");
							int pass=Integer.parseInt(br.readLine());
							System.out.println("Please Pay "+pay2+" Rs");
							amount2=Integer.parseInt(br.readLine());
							if(amount2>=pay2)
							{
								System.out.println("Take Your Idali Samber sir/mam");
								break;
							}
							else
								System.out.println("Please Pay the only accurate amount ");
						}
						else if(chs==4)
						{
							System.out.println("Enter Card Number : ");
							int no=Integer.parseInt(br.readLine());
							System.out.println("Ex Date");
							int dt=Integer.parseInt(br.readLine());
							System.out.println("CVV");
							int cvv=Integer.parseInt(br.readLine());
							System.out.println("Please Pay "+pay2+" Rs");
							amount2=Integer.parseInt(br.readLine());
							if(amount2>=pay2)
							{
								System.out.println("Take Your Idali Samber sir/mam");
								break;
							}
							else
								System.out.println("Please Pay the only accurate amount ");
						}
						else if(chs==5)
						{
							delivery2=plates*30;
							System.out.println("Your Orders are Received .....");
							System.out.println("Your Order will be Dilivered soon ..");
							System.out.println("Your Payment are added on Receipt ...");
							System.out.println("You can Pay Your Amount on Delivery Time ....");
							break;
						}
						else 
						{
							break;
						}
						}
					}
					else if(ch1==3)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay3=plates*20;
						while(true)
						{
						System.out.println("Select Your Payment Option..\n");
						System.out.println("1.	Google Pay  ");
						System.out.println("2.	Phone Pay  ");
						System.out.println("3.	Internet Banking  ");
						System.out.println("4.	Debit / Credit Card   ");
						System.out.println("5.	Cash on Delivary");
						System.out.println("6.	Back");
						int chs=Integer.parseInt(br.readLine());
						if(chs==1||chs==2)
						{
							System.out.println("Please Pay "+pay3+" Rs");
							amount3=Integer.parseInt(br.readLine());
							if(amount3==pay3)
							{
								System.out.println("Take Your Puttu sir/mam");
								break;
							}
							else
								System.out.println("Please Pay the only accurate amount ");
						}
						else if(chs==3)
						{
							System.out.println("User Name");
							String user=br.readLine();
							System.out.println("Password");
							int pass=Integer.parseInt(br.readLine());
							System.out.println("Please Pay "+pay3+" Rs");
							amount3=Integer.parseInt(br.readLine());
							if(amount3==pay3)
							{
								System.out.println("Take Your Puttu sir/mam");
								break;
							}
							else
								System.out.println("Please Pay the only accurate amount ");
						}
						else if(chs==4)
						{
							System.out.println("Enter Card Number : ");
							int no=Integer.parseInt(br.readLine());
							System.out.println("Ex Date");
							int dt=Integer.parseInt(br.readLine());
							System.out.println("CVV");
							int cvv=Integer.parseInt(br.readLine());
							System.out.println("Please Pay "+pay3+" Rs");
							amount3=Integer.parseInt(br.readLine());
							if(amount3==pay3)
							{
								System.out.println("Take Your Puttu sir/mam");
								break;
							}
							else
								System.out.println("Please Pay the only accurate amount ");
						}
						else if(chs==5)
						{
							delivery3=plates*20;
							System.out.println("Your Orders are Received .....");
							System.out.println("Your Order will be Dilivered soon ..");
							System.out.println("Your Payment are added on Receipt ...");
							System.out.println("You can Pay Your Amount on Delivery Time ....");
							break;
						}
						else
						{
							break;
						}
						}
					}
					else if(ch1==4)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay4=plates*60;
						while(true)
						{
						System.out.println("Select Your Payment Option..\n");
						System.out.println("1.	Google Pay  ");
						System.out.println("2.	Phone Pay  ");
						System.out.println("3.	Internet Banking  ");
						System.out.println("4.	Debit / Credit Card   ");
						System.out.println("5.	Cash on Delivary");
						System.out.println("6.	Back");
						int chs=Integer.parseInt(br.readLine());
						if(chs==1||chs==2)
						{
							System.out.println("Please Pay "+pay4+" Rs");
							amount4=Integer.parseInt(br.readLine());
							if(amount4==pay4)
							{
								System.out.println("Take Your Masala Dosa sir/mam");
								break;
							}
							else
								System.out.println("Please Pay the only accurate amount ");
						}
						else if(chs==3)
						{
							System.out.println("User Name");
							String user=br.readLine();
							System.out.println("Password");
							int pass=Integer.parseInt(br.readLine());
							System.out.println("Please Pay "+pay4+" Rs");
							amount4=Integer.parseInt(br.readLine());
							if(amount4==pay4)
							{
								System.out.println("Take Your Masala Dosa sir/mam");
								break;
							}
							else
								System.out.println("Please Pay the only accurate amount ");
						}
						else if(chs==4)
						{
							System.out.println("Enter Card Number : ");
							int no=Integer.parseInt(br.readLine());
							System.out.println("Ex Date");
							int dt=Integer.parseInt(br.readLine());
							System.out.println("CVV");
							System.out.println("Please Pay "+pay4+" Rs");
							amount4=Integer.parseInt(br.readLine());
							if(amount4==pay4)
							{
								System.out.println("Take Your Masala Dosa sir/mam");
								break;
							}
							else
								System.out.println("Please Pay the only accurate amount ");
						}
						else if(chs==5)
						{
							delivery4=plates*60;
							System.out.println("Your Orders are Received .....");
							System.out.println("Your Order will be Dilivered soon ..");
							System.out.println("Your Payment are added on Receipt ...");
							System.out.println("You can Pay Your Amount on Delivery Time ....");
							break;
						}
						}
					}
					else if(ch1==5)
					{
						System.out.println("...Thank You For Visiting South Indian Food Court...\n");
						break;
					}
					}
					
					southind=amount1+delivery1+amount2+delivery2+amount3+delivery3+amount4+delivery4;
				//	break;
					continue;
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
				case 2:
					while(true)
					{
					System.out.println("\n  Welcome To North Indian Food Court \n");
					System.out.println(" 		.. Menu ..");
					System.out.println("1.  Aloo Chole         = 40 rs");
					System.out.println("2.  Dum Biryani       = 80 rs");
					System.out.println("3.  Butter Chicken    = 60 rs");
					System.out.println("4.  Aloo Samosa      = 30 rs");
					System.out.println("5.  Exit\n");
					System.out.println("Enter Your Choice");
					ch=Integer.parseInt(br.readLine());
					if(ch==6||ch==7||ch==8||ch==9||ch==0)
					{
						System.out.println("Please enter Correct Option ....");
					}
					if(ch==1)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay5=plates*40;
						System.out.println("Please Pay "+pay5+" Rs");
						amount5=Integer.parseInt(br.readLine());
						if(amount5>pay5)
						{
							int refund=amount5-pay5;
							System.out.println("Your Refund is "+refund+" Rs");
							amount5=amount5-refund;
						}
						if(amount5==pay5)
						{
							System.out.println("Take Your Aloo Chole sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==2)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay6=plates*80;
						System.out.println("Please Pay "+pay6+" Rs");
						amount6=Integer.parseInt(br.readLine());
						if(amount6>pay6)
						{
							int refund=amount6-pay6;
							System.out.println("Your Refund is "+refund+" Rs");
							amount6=amount6-refund;
						}
						if(amount6==pay6)
						{
							System.out.println("Take Your Chicken Dum Biryani sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==3)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay7=plates*60;
						System.out.println("Please Pay "+pay7+" Rs");
						amount7=Integer.parseInt(br.readLine());
						if(amount7>pay7)
						{
							int refund=amount7-pay7;
							System.out.println("Your Refund is "+refund+" Rs");
							amount7=amount7-refund;
						}
						if(amount7==pay7)
						{
							System.out.println("Take Your Butter Chicken sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==4)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay8=plates*30;
						System.out.println("Please Pay "+pay8+" Rs");
						amount8=Integer.parseInt(br.readLine());
						if(amount8>pay8)
						{
							int refund=amount8-pay8;
							System.out.println("Your Refund is "+refund+" Rs");
							amount8=amount8-refund;
						}
						if(amount8==pay8)
						{
							System.out.println("Take Your Aloo Samosa sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==5) 
					{
						System.out.println("...Thank You For Visiting North Indian Food Court...\n");
						break;
					}
					}
					northind=amount5+amount6+amount7+amount8;
				//	break;
					continue;
		////////////////////////////////////////////////////////////////////////////////////////////////////////////			
				case 3:
					while(true)
					{
					System.out.println(" \n Welcome To Rajasthani Food Court \n");
					System.out.println(" 		.. Menu ..");
					System.out.println("1.  Dal Bati Churma   	  = 190 rs");
					System.out.println("2.  Mohan Thal        	  =90 rs");
					System.out.println("3.  Lal Maas           		  = 50 rs");
					System.out.println("4.  Mava Kachori      	  = 40 rs");
					System.out.println("5.  Exit\n");
					System.out.println("Enter Your Choice");
					ch=Integer.parseInt(br.readLine());
					if(ch==6||ch==7||ch==8||ch==9||ch==0)
					{
						System.out.println("Please enter Correct Option ....");
					}
					if(ch==1)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay9=plates*190;
						System.out.println("Please Pay "+pay9+" Rs");
						amount9=Integer.parseInt(br.readLine());
						if(amount9>pay9)
						{
							int refund=amount9-pay9;
							System.out.println("Your Refund is "+refund+" Rs");
							amount9=amount9-refund;
						}
						if(amount9==pay9)
						{
							System.out.println("Take Your Dal Bati Churma sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
				    if(ch==2)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay10=plates*90;
						System.out.println("Please Pay "+pay10+" Rs");
						amount10=Integer.parseInt(br.readLine());
						if(amount10>pay10)
						{
							int refund=amount10-pay10;
							System.out.println("Your Refund is "+refund+" Rs");
							amount10=amount10-refund;
						}
						if(amount10==pay10)
						{
							System.out.println("Take Your Mohan Thal sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
				    if(ch==3)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay11=plates*50;
						System.out.println("Please Pay "+pay11+" Rs");
						amount11=Integer.parseInt(br.readLine());
						if(amount11>pay11)
						{
							int refund=amount11-pay11;
							System.out.println("Your Refund is "+refund+" Rs");
							amount11=amount11-refund;
						}
						if(amount11==pay11)
						{
							System.out.println("Take Your Lal Maas sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					else if(ch==4)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay12=plates*40;
						System.out.println("Please Pay "+pay12+" Rs");
						amount12=Integer.parseInt(br.readLine());
						if(amount12>pay12)
						{
							int refund=amount12-pay12;
							System.out.println("Your Refund is "+refund+" Rs");
							amount12=amount12-refund;
						}
						if(amount12==pay12)
						{
							System.out.println("Take Your Mava Kachori sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==5)
					{
						System.out.println("...Thank You For Visiting Rajasthani Food Court...\n");
						break;
					}
					}
					rajasthani=amount9+amount10+amount11+amount12;
				//	break;
					continue;
		///////////////////////////////////////////////////////////////////////////////////////////////////			
				case 4:
					while(true)
					{
					System.out.println("\n  Welcome To Gujrati Food Court \n");
					System.out.println(" 		.. Menu ..");
					System.out.println("1.  Dhokla           	= 40 rs");
					System.out.println("2.  Handava          	= 60 rs");
					System.out.println("3.  Thepla           	= 50 rs");
					System.out.println("4.  Fafda Jalebi     	= 30 rs");
					System.out.println("5.  Exit\n");
					System.out.println("Enter Your Choice");
					ch=Integer.parseInt(br.readLine());
					if(ch==6||ch==7||ch==8||ch==9||ch==0)
					{
						System.out.println("Please enter Correct Option ....");
					}
					if(ch==1)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay13=plates*40;
						System.out.println("Please Pay "+pay13+" Rs");
						amount13=Integer.parseInt(br.readLine());
						if(amount13>pay13)
						{
							int refund=amount13-pay13;
							System.out.println("Your Refund is "+refund+" Rs");
							amount13=amount13-refund;
						}
						if(amount13==pay13)
						{
							System.out.println("Take Your Dhokla sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==2)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay14=plates*60;
						System.out.println("Please Pay "+pay14+" Rs");
						amount14=Integer.parseInt(br.readLine());
						if(amount14>pay14)
						{
							int refund=amount14-pay14;
							System.out.println("Your Refund is "+refund+" Rs");
							amount14=amount14-refund;
						}
						if(amount14==pay14)
						{
							System.out.println("Take Your Handva sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==3)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay15=plates*50;
						System.out.println("Please Pay "+pay15+" Rs");
						amount15=Integer.parseInt(br.readLine());
						if(amount15>pay15)
						{
							int refund=amount15-pay15;
							System.out.println("Your Refund is "+refund+" Rs");
							amount15=amount15-refund;
						}
						if(amount15==pay15)
						{
							System.out.println("Take Your Thepla sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==4)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay16=plates*30;
						System.out.println("Please Pay "+pay16+" Rs");
						amount16=Integer.parseInt(br.readLine());
						if(amount16>pay16)
						{
							int refund=amount16-pay16;
							System.out.println("Your Refund is "+refund+" Rs");
							amount16=amount16-refund;
						}
						if(amount16==pay16)
						{
							System.out.println("Take Your Fafda Jalebi sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==5) 
					{
						System.out.println("...Thank You For Visiting Gujrati Food Court...\n");
						break;
					}
					}
					gujrati=amount13+amount14+amount15+amount16;
				//	break;
					continue;
		////////////////////////////////////////////////////////////////////////////////////////////////////////			
				case 5:
					while(true)
					{
					System.out.println(" \n Welcome To Bangali Food Court \n");
					System.out.println(" 		.. Menu ..");
					System.out.println("1.  Bhapaa Aloo              	 = 40 rs");
					System.out.println("2.  Chingari Malai Curry    	 = 30 rs");
					System.out.println("3.  Bangali Lamb Curry      	 = 30 rs");
					System.out.println("4.  Doi Maach               		 = 60 rs");
					System.out.println("5.  Exit\n");
					System.out.println("Enter Your Choice");
					ch=Integer.parseInt(br.readLine());
					if(ch==6||ch==7||ch==8||ch==9||ch==0)
					{
						System.out.println("Please enter Correct Option ....");
					}
					if(ch==1)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay17=plates*40;
						System.out.println("Please Pay "+pay17+" Rs");
						amount17=Integer.parseInt(br.readLine());
						if(amount17>pay17)
						{
							int refund=amount17-pay17;
							System.out.println("Your Refund is "+refund+" Rs");
							amount17=amount17-refund;
						}
						if(amount17==pay17)
						{
							System.out.println("Take Your Bhapaa Aloo sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==2)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay18=plates*30;
						System.out.println("Please Pay "+pay18+" Rs");
						amount18=Integer.parseInt(br.readLine());
						if(amount18>pay18)
						{
							int refund=amount18-pay18;
							System.out.println("Your Refund is "+refund+" Rs");
							amount18=amount18-refund;
						}
						if(amount18==pay18)
						{
							System.out.println("Take Your Chingari Malai Curry sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==3)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay19=plates*30;
						System.out.println("Please Pay "+pay19+" Rs");
						amount19=Integer.parseInt(br.readLine());
						if(amount19>pay19)
						{
							int refund=amount19-pay19;
							System.out.println("Your Refund is "+refund+" Rs");
							amount19=amount19-refund;
						}
						if(amount19==pay19)
						{
							System.out.println("Take Your Bangali Lamb Curry sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==4)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay20=plates*60;
						System.out.println("Please Pay "+pay20+" Rs");
						amount20=Integer.parseInt(br.readLine());
						if(amount20>pay20)
						{
							int refund=amount20-pay20;
							System.out.println("Your Refund is "+refund+" Rs");
							amount20=amount20-refund;
						}
						if(amount20==pay20)
						{
							System.out.println("Take Your Doi Maach sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==5) 
					{
						System.out.println("...Thank You For Visiting Bangali Food Court...\n");
						break;
					}
					}
					bangali=amount17+amount18+amount19+amount20;
				//	break;
					continue;
		/////////////////////////////////////////////////////////////////////////////////////////////////////			
				case 6:
					while(true)
					{
					System.out.println("\n  Welcome To Dessert Food Court \n");
					System.out.println(" 		.. Menu ..");
					System.out.println("1.  Mangomisu						= 40 rs");
					System.out.println("2.  Apple Pai							= 70 rs");
					System.out.println("3.  Almond Malai Kulfi        				= 30 rs");
					System.out.println("4.  Lemon Tart							= 60 rs");
					System.out.println("5.  Exit\n");
					System.out.println("Enter Your Choice");
					ch=Integer.parseInt(br.readLine());
					if(ch==6||ch==7||ch==8||ch==9||ch==0)
					{
						System.out.println("Please enter Correct Option ....");
					}
					if(ch==1)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay21=plates*40;
						System.out.println("Please Pay "+pay21+" Rs");
						amount21=Integer.parseInt(br.readLine());
						if(amount21>pay21)
						{
							int refund=amount21-pay21;
							System.out.println("Your Refund is "+refund+" Rs");
							amount21=amount21-refund;
						}
						if(amount21==pay21)
						{
							System.out.println("Take Your Mangomisu sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==2)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay22=plates*70;
						System.out.println("Please Pay "+pay22+" Rs");
						amount22=Integer.parseInt(br.readLine());
						if(amount22>pay22)
						{
							int refund=amount22-pay22;
							System.out.println("Your Refund is "+refund+" Rs");
							amount22=amount22-refund;
						}
						if(amount22==pay22)
						{
							System.out.println("Take Your Apple Pai sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==3)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay23=plates*30;
						System.out.println("Please Pay "+pay23+" Rs");
						amount23=Integer.parseInt(br.readLine());
						if(amount23>pay23)
						{
							int refund=amount23-pay23;
							System.out.println("Your Refund is "+refund+" Rs");
							amount23=amount23-refund;
						}
						if(amount23==pay23)
						{
							System.out.println("Take Your Almond Malai Kulfi sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==4)
					{
						System.out.println("How many plates you want");
						int plates=Integer.parseInt(br.readLine());
						int pay24=plates*60;
						System.out.println("Please Pay "+pay24+" Rs");
						amount24=Integer.parseInt(br.readLine());
						if(amount24>pay24)
						{
							int refund=amount24-pay24;
							System.out.println("Your Refund is "+refund+" Rs");
							amount24=amount24-refund;
						}
						if(amount24==pay24)
						{
							System.out.println("Take Your Lemon Tart sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==5)
					{
						System.out.println("...Thank You For Visiting Dessert Food Court...\n");
						break;
					}
					}
					desert=amount21+amount22+amount23+amount24;
					//break;
 					continue;
 		////////////////////////////////////////////////////////////////////////////////////////////////////////
				case 7:
					while(true)
					{
					System.out.println("\n  Welcome To Cold Drinks Court \n");
					System.out.println(" 		.. Menu ..");
					System.out.println("1.  Coca Cola						= 60 rs");
					System.out.println("2.  Sprite							= 20 rs");
					System.out.println("3.  Soda							= 30 rs");
					System.out.println("4.  RedBull						= 80 rs");
					System.out.println("5.  Exit\n");
					System.out.println("Enter Your Choice");
					ch=Integer.parseInt(br.readLine());
					if(ch==6||ch==7||ch==8||ch==9||ch==0)
					{
						System.out.println("Please enter Correct Option ....");
					}
					if(ch==1)
					{
						System.out.println("How many drinks you want");
						int plates=Integer.parseInt(br.readLine());
						int pay25=plates*60;
						System.out.println("Please Pay "+pay25+" Rs");
						amount25=Integer.parseInt(br.readLine());
						if(amount25>pay25)
						{
							int refund=amount25-pay25;
							System.out.println("Your Refund is "+refund+" Rs");
							amount25=amount25-refund;
						}
						if(amount25==pay25)
						{
							System.out.println("Take Your Coca Cola sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==2)
					{
						System.out.println("How many drinks you want");
						int plates=Integer.parseInt(br.readLine());
						int pay26=plates*20;
						System.out.println("Please Pay "+pay26+" Rs");
						amount26=Integer.parseInt(br.readLine());
						if(amount26>pay26)
						{
							int refund=amount26-pay26;
							System.out.println("Your Refund is "+refund+" Rs");
							amount26=amount26-refund;
						}
						if(amount26==pay26)
						{
							System.out.println("Take Your Sprite sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==3)
					{
						System.out.println("How many drinks you want");
						int plates=Integer.parseInt(br.readLine());
						int pay27=plates*30;
						System.out.println("Please Pay "+pay27+" Rs");
						amount27=Integer.parseInt(br.readLine());
						if(amount27>pay27)
						{
							int refund=amount27-pay27;
							System.out.println("Your Refund is "+refund+" Rs");
							amount27=amount27-refund;
						}
						if(amount27==pay27)
						{
							System.out.println("Take Your Soda  sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==4)
					{
						System.out.println("How many driks you want");
						int plates=Integer.parseInt(br.readLine());
						int pay28=plates*80;
						System.out.println("Please Pay "+pay28+" Rs");
						amount28=Integer.parseInt(br.readLine());
						if(amount28>pay28)
						{
							int refund=amount28-pay28;
							System.out.println("Your Refund is "+refund+" Rs");
							amount28=amount28-refund;
						}
						if(amount28==pay28)
						{
							System.out.println("Take Your Red Bull sir/mam");
						}
						else
							System.out.println("Please Pay the only accurate amount ");
					}
					if(ch==5)
					{
						System.out.println("...Thank You For Visiting Cold Drinks Court...\n");
						break;
					}
					}
					colddrink=amount25+amount26+amount27+amount28;
					//break;
 					continue;
 		////////////////////////////////////////////////////////////////////////////////////////////////////////			
				case 0:
					
					System.out.println("Are You Sure... for Exit");
					System.out.println("1. Yes");
					System.out.println("2. No");
					ch=Integer.parseInt(br.readLine());
					
					if(ch==2)
					{
						System.out.println("	... Welcome for Visiting Again ...\n");
						continue;
					}
					totalbill=southind+northind+rajasthani+gujrati+bangali+desert+colddrink;
					System.out.println("	...	...	Receipt  ...	...\n");
					System.out.println("Your Orders Are : \n");
					if(amount1>=40||delivery1>=40)
					{
						int p1=amount1/40;
						int p2=delivery1/40;
						int plates=p1+p2;
					System.out.println(" "+plates+"	.. Chole Bhature								");
					
					}
					if(amount2>=30||delivery2>=30)
					{
						int p1=amount2/30;
						int p2=delivery2/30;
						int plates=p1+p2;
					System.out.println(" "+plates+"	.. Idali Samber    								");
					}
					if(amount3>=20||delivery3>20)
					{
						int p1=amount3/20;
						int p2=delivery3/20;
						int plates=p1+p2;	
					System.out.println(" "+plates+"	.. Puttu    									");
					}
					if(amount4>=60||delivery4>=60)
					{
						int p1=amount4/60;
						int p2=delivery4/60;
						int plates=	p1+p2;
					System.out.println(" "+plates+"	.. Masala Dosa	   								");
					}
					if(amount5>=40)
					{
						int plates=amount5/40;
					System.out.println(" "+plates+"	.. Aloo Chole	   								");
					}
					if(amount6>=80)
					{
						int plates=amount6/80;
					System.out.println(" "+plates+"	.. Dum Biryani	   								");
					}
					if(amount7>=60)
					{
						int plates=amount7/60;
					System.out.println(" "+plates+"	.. Butter Chicken  		  						");
					}
					if(amount8>=30)
					{
						int plates=amount8/30;
					System.out.println(" "+plates+"	.. Aloo Samosa  	   							");
					}
					if(amount9>=180)
					{
						int plates=amount8/180;
					System.out.println(" "+plates+"	.. Dal Bati Churn							   ");
					}
					if(amount10>=90)
					{
						int plates=amount10/90;
					System.out.println(" "+plates+"	.. Mohan Thal	   								");
					}
					if(amount11>=50)
					{
						int plates=amount11/50;					
					System.out.println(" "+plates+"	.. Lal Maas		   								");
					}
					if(amount12>=40)
					{
						int plates=amount12/40;
					System.out.println(" "+plates+"	.. Mava Kachori  	 							");
					}
					if(amount13>=40)
					{
						int plates=amount13/40;
					System.out.println(" "+plates+"	.. Dhokla		  								");
					}			
					if(amount14>=60)
					{
						int plates=amount14/60;	
					System.out.println(" "+plates+"	.. 	Handava	   	  								");
					}	
					if(amount15>=50)
					{
						int plates=amount15/50;
					System.out.println(" "+plates+"	.. Thepla		  	  							");
					}
					if(amount16>=30)
					{
						int plates=amount16/30;
					System.out.println(" "+plates+"	.. Fafda Jalebi 								");
					}
					if(amount17>=40)
					{
						int plates=amount17/40;
					System.out.println(" "+plates+"	.. Bhapaa Aloo	   	 							");
					}
					if(amount18>=30)
					{
						int plates=amount18/30;
					System.out.println(" "+plates+"	.. Malai Curry	 	   							");
					}
					if(amount19>=30)
					{
						int plates=amount19/30;
					System.out.println(" "+plates+"	.. Lamb Curry	 	   							");
					}
					if(amount20>=60)
					{
						int plates=amount20/60;
					System.out.println(" "+plates+"	.. Doi Maach	 	   							");
					}
					if(amount21>=40)
					{
						int plates=amount21/40;
					System.out.println(" "+plates+"	.. Mangomisu	 	   							");
					}
					if(amount22>=70)
					{
						int plates=amount22/70;
					System.out.println(" "+plates+"	.. Apple Pai		    						");
					}
					if(amount23>=30)
					{
						int plates=amount23/30;
					System.out.println(" "+plates+"	.. Malai Kulfhi	 	   							");
					}
					if(amount24>=60)
					{
						int plates=amount24/60;
					System.out.println(" "+plates+"	.. Lemon Tart	  	  							");
					}
					if(amount25>=60)
					{
						int drink=amount25/60;
						System.out.println(" "+drink+"	 ..Coca Cola									");
					}
					if(amount26>=20)
					{
						int drink=amount26/20;
						System.out.println(" "+drink+"	..Sprite"										);
					}
					if(amount27>=30)
					{
						int drink=amount27/30;
						System.out.println(" "+drink+" 	..Soda"											);
					}
					if(amount28>=80)
					{
						int drink=amount28/80;
						System.out.println(" "+drink+" 	..Red Bull"										);
					}
					System.out.println("\n	.... Your Bill Is "+totalbill+" Rs ....");
					System.out.println("	..... Collect Your Bill Sir/Mam .....\n");
					System.out.println("...Thank You For Visiting Vaibhav's Restorent App ...");
					System.out.println("              ..... Visit Again .....");
					break;
			
				default:
					System.out.println("Please Enter Other/Correct Option ....\n");
					continue;
				}
				break; 
			//	continue;	
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
