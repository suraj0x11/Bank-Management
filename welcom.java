import java.util.Scanner;

interface Welcome_Bank{
    void create_new();
    void OpenNewAccount(); 
    void DepositMoney(); 
    void WithdrawMoney();
    void TransferMoney();
    void ViewAccountDetails();
    void ViewTransactionHistory();
    void Exit();
}
class Customer{
    String name;
    String id;
    String email;
    int accountnum;
    Customer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    Customer(int accNo){
        this.accountnum = accNo;
    }
    
}
class Boi implements Welcome_Bank{

    private Customer regCustomer;
    //creating account
    public void create_new(){

        System.out.println("=========================================== ");
        System.out.println("CREATE NEW CUSTOMER ");
        System.out.println("=========================================== ");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        String name = sc.nextLine();

        System.out.println("Enter Customer ID:");
        String id = sc.nextLine();

        System.out.println("Enter Email Id:");
        String email = sc.nextLine();
        
        // save info
        regCustomer = new Customer(id,name,email); 

        System.out.println("Customer Registered Successfully!"); 
        System.out.println("Press Enter to continue..."); 
        sc.nextLine();
        System.out.println("-------------------------------------------");
        this.OpenNewAccount();
    }
    //open an occcount or batao yaha takk sab thik
    public void OpenNewAccount() {
        System.out.println("=========================================== ");
        System.out.println("Open New Account ");
        System.out.println("=========================================== ");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer ID:");
        String id = sc.nextLine();
        while (id == regCustomer.id) {
            id = sc.nextLine();
        }

        System.out.println("Enter Account Type (Savings/Checking):");
        String accType = sc.nextLine();
        
        System.out.println("Enter Initial Deposit:");
        int DepoAmount = sc.nextInt();

        System.out.println("Account Created Successfully!");
        int accNo = (int)Math.random()*(1000-100)+100;
        regCustomer = new Customer(accNo);
        System.out.println("Account Number"+"AC"+accNo); //account number

        System.out.println("Press Enter to continue..."); 
        sc.nextLine();
        System.out.println("-------------------------------------------");
        this.DepositMoney();
    }
    public void DepositMoney() {
        // =========================================== 
        // DEPOSIT MONEY 
        // =========================================== 
        // Enter Account Number: ACC1001 
        // Enter Amount to Deposit: 300 
        // Deposited $300 Successfully! 
        // New Balance: $800 
        // Press Enter to continue... 
        // -------------------------------------------
    }
    public void WithdrawMoney() {
        System.out.println("Withdrawing money...");
    }
    public void TransferMoney() {
        System.out.println("Transferring money...");
    }
    public void ViewAccountDetails() {
        System.out.println("Viewing account details...");
    }
    public void ViewTransactionHistory() {
        System.out.println("Viewing transaction history...");
    }
    public void Exit() {
        System.out.println("Exiting...");
    }
}
class Bob implements Welcome_Bank{
    public void create_new() {
        System.out.println("Creating a new bank...");
    }
    public void OpenNewAccount() {
        System.out.println("Opening a new account...");
    }
    public void DepositMoney() {
        System.out.println("Depositing money...");
    }
    public void WithdrawMoney() {
        System.out.println("Withdrawing money...");
    }
    public void TransferMoney() {
        System.out.println("Transferring money...");
    }
    public void ViewAccountDetails() {
        System.out.println("Viewing account details...");
    }
    public void ViewTransactionHistory() {
        System.out.println("Viewing transaction history...");
    }
    public void Exit() {
        System.out.println("Exiting...");
    }
}
class Pnb implements Welcome_Bank{
    public void create_new() {
        System.out.println("Creating a new bank...");
    }
    public void OpenNewAccount() {
        System.out.println("Opening a new account...");
    }
    public void DepositMoney() {
        System.out.println("Depositing money...");
    }
    public void WithdrawMoney() {
        System.out.println("Withdrawing money...");
    }
    public void TransferMoney() {
        System.out.println("Transferring money...");
    }
    public void ViewAccountDetails() {
        System.out.println("Viewing account details...");
    }
    public void ViewTransactionHistory() {
        System.out.println("Viewing transaction history...");
    }
    public void Exit() {
        System.out.println("Exiting...");
    }
}
class welcom{
    public static void menu(){
        System.out.println("*******************************************************************");

            System.out.println("Choose karo apne hisab se option(1-8)");
                System.out.println("1. Create New Customer \n" + 
                                        "2. Open New Account \n" + 
                                        "3. Deposit Money \n" + 
                                        "4. Withdraw Money \n" + 
                                        "5. Transfer Money \n" + 
                                        "6. View Account Details \n" + 
                                        "7. View Transaction History \n" + 
                                        "8. Exit ");               
    }
    public static void main(String[] args){
        System.out.println("===================================================================================");
        System.out.println("\t\t SWAGAT HAI BHAIYO/BAHNO BANK_MANAGEMENT_SYSTEM ME \t\t");
        System.out.println("===================================================================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose karo apne hisab se bank(1-4)");
        System.out.println("1.Bank of India\n2.Bank of Baroda\n3.Panjab National Bank\n4.Exit");
        int arg = sc.nextInt();
        switch (arg) {
            case 1://bank of india
                Boi obj1 = new Boi();
                System.out.println("*******************************************************************");
                System.out.println("\t\t Bank of India ");
                menu();//call menu 
                int arg1 = sc.nextInt();
                switch (arg1) {
                    case 1:
                        obj1.create_new();
                        break;
                    case 2:
                        obj1.OpenNewAccount();
                        break;
                    case 3:
                        obj1.DepositMoney();
                        break;
                    case 4:
                        obj1.WithdrawMoney();;
                        break;
                    case 5:
                        obj1.TransferMoney();;
                        break;
                    case 6:
                        obj1.ViewAccountDetails();;
                        break;
                    case 7:
                        obj1.ViewTransactionHistory();;
                        break;
                    case 8:
                        obj1.Exit();
                        break;
                    default:
                        break;
                }
                break;
            
            case 2://bank of baroda ke liye
                Bob obj2 = new Bob();
                System.out.println("*******************************************************************");
                System.out.println("\t\t Bank of Baroda ");
                menu();
                int arg2 = sc.nextInt();
                switch (arg2) {
                    case 1:
                        obj2.create_new();
                        break;
                    case 2:
                        obj2.OpenNewAccount();
                        break;
                    case 3:
                        obj2.DepositMoney();
                        break;
                    case 4:
                        obj2.WithdrawMoney();;
                        break;
                    case 5:
                        obj2.TransferMoney();;
                        break;
                    case 6:
                        obj2.ViewAccountDetails();;
                        break;
                    case 7:
                        obj2.ViewTransactionHistory();;
                        break;
                    case 8:
                        obj2.Exit();
                        break;
                    default:
                        break;
                }
                break;
            
            case 3://punjab national bank
                Pnb obj3 = new Pnb();
                System.out.println("*******************************************************************");
                System.out.println("\t\t Punjab National bank ");
                menu();
                int arg3 = sc.nextInt();
                switch (arg3) {
                    case 1:
                        obj3.create_new();
                        break;
                    case 2:
                        obj3.OpenNewAccount();
                        break;
                    case 3:
                        obj3.DepositMoney();
                        break;
                    case 4:
                        obj3.WithdrawMoney();;
                        break;
                    case 5:
                        obj3.TransferMoney();;
                        break;
                    case 6:
                        obj3.ViewAccountDetails();;
                        break;
                    case 7:
                        obj3.ViewTransactionHistory();;
                        break;
                    case 8:
                        obj3.Exit();
                        break;
                    default:
                        break;
                }
                break;
            default:
                System.out.println("Galat Jawab - Try Again");
                break;
        }
    }
}