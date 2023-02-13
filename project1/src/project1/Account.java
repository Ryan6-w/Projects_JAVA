package project1;

public class Account {

		public static void main(String[] arg) {
			
			boolean isFlag = true;
			int currentIncome = 0;
			String accountDetail ="";
			
			while(isFlag) {
				menuOption();
				
				char menu = Utility.readMenuSelection();
				
				switch(menu) {
				case '1':
					menuOption();
					System.out.print(1);
					System.out.println("\n\n\n\t\t\t\t  Current Amount: " + currentIncome);
					System.out.println("----------------------------------Account Detail----------------------------------");
					System.out.println("Type    \t Account Amount \t Amount Of Change \t Description");
					System.out.println(accountDetail);
					break;
				case '2': 
					menuOption();
					System.out.print(2);
					System.out.print("\n\nAmount of income: ");
					int income = Utility.readNumber();
					System.out.print("Description: ");
					String desIncome = Utility.readString();
					
					
					currentIncome += income;
					accountDetail = inputDetail(accountDetail,"Income  ",currentIncome,income,desIncome);

					break;
				case '3': 
					menuOption();
					System.out.print(3);
					System.out.print("\n\nAmount of expenses: ");
					int expenses = Utility.readNumber();
					while(currentIncome < expenses) {
						System.out.println("Expenses exceed the current account amount!\n Please ensure you enter the right amoung of expenses: ");
						expenses = Utility.readNumber();
					}
			 
					System.out.print("Description: ");
					String desExpenses = Utility.readString();
					
					currentIncome -= expenses;
					accountDetail = inputDetail(accountDetail,"Expenses",currentIncome,expenses,desExpenses);
					break;
				case '4': 
					System.out.print("Please confirm if you want to exit (Y/N): ");
					char isExit = Utility.readConfirmSelection();
					if(isExit == 'Y') {
						isFlag =false;
					}
					break;			
				}
			
			}
		}
		public static void menuOption() {
			System.out.println("\n-----------------Family income and expenditure bookkeeping software-----------------\n");
			System.out.println("                   1 Account details");
			System.out.println("                   2 Register income");
			System.out.println("                   3 Register expenses");
			System.out.println("                   4 Log out");
			System.out.print("                   Please select above options: ");
		}
		
		public static String inputDetail(String accountD, String type, int accountNum, int amountN, String des) {
			String str = accountD + type+"\t  " +accountNum + "\t\t\t  " + amountN + "\t\t\t  " + des+ "\n";
			return str;
		}
		
 


}
