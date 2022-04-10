import java.io.*;

class CreditCardMain
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ch;
		do
		{
			System.out.println("\nMenu\n1.Silver Card Customer\n2.Gold Card Customer\n3.Exit");
			System.out.print("Enter your choice : ");
			ch = Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1: int ch1;
					SilverCardCustomer scc = new SilverCardCustomer();
					scc.input();
					do
					{
						System.out.println("\nSubmenu for Silver Card\n1.View Credit Amount\n2.Use Credit Card\n3.Pay Credit\n4.Increase Limit of Card\n5.Exit");
						System.out.print("Enter your choice : ");
						ch1 = Integer.parseInt(br.readLine());
						switch(ch1)
						{ 		
							case 1: scc.viewCreditAmount();
								break;
							case 2: scc.useCard();
								break;
							case 3: scc.payCredit();
								break;
							case 4: scc.increaseLimit();
								break;
							case 5: break;
							default:System.out.println("Invalid Choice");
						}
					}while(ch1!=5);
					break;
				case 2: int ch2;
					GoldCardCustomer gcc = new GoldCardCustomer();
					gcc.input();
					do
					{
						System.out.println("\nSubmenu for Golden Card\n1.View Credit Amount\n2.Use Credit Card\n3.Pay Credit\n4.Increase Limit of Card\n5.Exit");
						System.out.print("Enter your choice : ");
						ch2 = Integer.parseInt(br.readLine());
						switch(ch2)
						{ 		
							case 1: gcc.viewCreditAmount();
								break;
							case 2: gcc.useCard();
								break;
							case 3: gcc.payCredit();
								break;
							case 4: gcc.increaseLimit();
								break;
							case 5: break;
							default:System.out.println("Invalid Choice");
						}
					}while(ch2!=5);
					break;
				case 3: break;
				default:System.out.println("Invalid Choice");
			}
		}while(ch!=3);
	}
}		
