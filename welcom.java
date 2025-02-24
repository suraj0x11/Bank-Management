// import javafx.util.Pair;
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
    private String name;
    private String id;
    private String email;
    private String accType;
    private int accountnum;
    private int totalamount;
    private int tamount;
    private int racn;
    Customer(){
        this.accountnum = 0;
        this.email = null;
        this.id = null;
        this.name = null;
        this.totalamount = 0;
        this.accType = null;
        
    }
    public void deposit(int amount){
        if (amount > 0) {
            this.totalamount += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
        
    }
    //setters-------------made by one and only bade bhaiya
    public void setTransferInfo(int tamount,int racn){
        this.tamount = tamount;
        this.racn = racn;
    }
    public void setAccountNum(int accountnum) {
        this.accountnum = accountnum;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setaccType(String accType){
        this.accType = accType;
    }
    public void setTotalamount(int credited){
        this.totalamount -= credited;
    }
    //getters-------------made by one and only bade bhaiya
    public Object[] getTransferinfo(){
        String tra = "Transferred";
        return new Object[]{tra,this.tamount,this.racn};
    }
    public int getBalance(){
        return totalamount;
    }
    public int getAccountNum() {
        return accountnum;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getEmail(){
        return email;
    }
    public String setaccType(){
        return accType;
    }
    
}
class Boi implements Welcome_Bank{

    protected Customer regCustomer = new Customer();
    //returna class type object
    public Customer getCustomer(Customer regCustomer){
        return regCustomer;
    }
    //creating account
    public void create_new(){

        System.out.println("=========================================== ");
        System.out.println("CREATE NEW CUSTOMER ");
        System.out.println("=========================================== ");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        String name = sc.nextLine();
        regCustomer.setName(name);

        System.out.println("Enter Customer ID:");
        String id = sc.nextLine();
        regCustomer.setId(id);

        System.out.println("Enter Email Id:");
        String email = sc.nextLine();
        regCustomer.setEmail(email);

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
        while (!id.equals(regCustomer.getId())) {
            System.out.println("phir se likho !!");
            id = sc.nextLine();
        }


        System.out.println("Enter Account Type (Savings/Checking):");
        String accType = sc.nextLine();
        regCustomer.setaccType(accType);
        
        System.out.println("Enter Initial Deposit:");
        int DepoAmount = sc.nextInt();
        regCustomer.deposit(DepoAmount);//deposited amount

        System.out.println("Account Created Successfully!");
        int accNo = (int)(Math.random()*(5000-987))+987;
        regCustomer.setAccountNum(accNo);
        System.out.println("Account Number "+"AC"+accNo); //account number

        System.out.println("Press Enter to continue..."); 
        sc.nextLine();
        System.out.println("-------------------------------------------");
        this.DepositMoney();
    }
    //Paise jama karo
    public void DepositMoney() {
        System.out.println("=========================================== ");
        System.out.println("Deposit Money ");
        System.out.println("=========================================== ");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: "+"AC");
        int s = sc.nextInt();
        if (regCustomer.getAccountNum() != s) {
            System.out.println("previous acc. no. is galat !!");
            s = sc.nextInt();
        }
 
        System.out.println("Enter Amount to Deposit:");
        int DepoAmount = sc.nextInt();
        System.out.println("Deposited "+ DepoAmount +" Successfully!");
        regCustomer.deposit(DepoAmount);//depositing money
        System.out.println("New Balance: "+ regCustomer.getBalance());

        System.out.println("Press Enter to continue..."); 
        sc.nextLine();
        System.out.println("-------------------------------------------");
        this.WithdrawMoney();
    }
    //paise nikal lo
    public void WithdrawMoney() {
        System.out.println("=========================================== ");
        System.out.println("Withdraw Money ");
        System.out.println("=========================================== ");
        System.out.println("Enter Account Number: "+"AC");
        Scanner sc = new Scanner(System.in);
        int acn = sc.nextInt();
        if(acn != regCustomer.getAccountNum()){
            acn = sc.nextInt();
        }
        System.out.println("Account number is Correct");
        System.out.println("Enter Amount to Withdraw");
        int credit = sc.nextInt();
        if(credit < regCustomer.getBalance()){
            regCustomer.setTotalamount(credit);
        }
        System.out.println("Withdrawn"+credit+"Successfully!");
        System.out.println("New Balance"+regCustomer.getBalance());
        System.out.println("Press Enter to continue..."); 
        sc.nextLine();
        System.out.println("-------------------------------------------");
        this.TransferMoney();
    }
    public void TransferMoney() {
            System.out.println("=========================================== ");
            System.out.println("Transfer Money ");
            System.out.println("=========================================== ");
            System.out.print("Enter Account Number: "+"AC");
            Scanner sc = new Scanner(System.in);
            int acn = sc.nextInt();
            if(acn != regCustomer.getAccountNum()){
                System.out.println("Mismatched");
                System.out.print("Enter Account Number: "+"AC");
                acn = sc.nextInt();
            }
            System.out.print("Enter Reciever Account Number: "+"AC");
            int racn = sc.nextInt();
            System.out.print("Enter Amount to Transfer: ");
            int tamount = sc.nextInt();
            System.out.println("Transfer Successful!"+tamount+ "Sent to "+ racn);
            regCustomer.setTransferInfo(tamount,racn);
            regCustomer.setTotalamount(tamount);

            System.out.print("New Balance: "+regCustomer.getBalance());
            System.out.println("Press Enter to continue..."); 
            sc.nextLine();
            System.out.println("-------------------------------------------");
            this.ViewAccountDetails();
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
                        if(obj1.regCustomer.getName() != null){
                            System.out.println("Pahle account create karo");
                            break;
                        }
                        else obj1.OpenNewAccount();
                        break;
                    case 3:
                        if(obj1.regCustomer.getName() != null){
                            System.out.println("Pahle account create karo");
                            break;
                        }
                        else obj1.DepositMoney();
                        break;
                    case 4:
                        if(obj1.regCustomer.getName() != null){
                            System.out.println("Pahle account create karo");
                            break;
                        }
                        else obj1.WithdrawMoney();;
                        break;
                    case 5:
                        if(obj1.regCustomer.getName() != null){
                            System.out.println("Pahle account create karo");
                            break;
                        }
                        else obj1.TransferMoney();;
                        break;
                    case 6:
                        if(obj1.regCustomer.getName() != null){
                            System.out.println("Pahle account create karo");
                            break;
                        }
                        else obj1.ViewAccountDetails();;
                        break;
                    case 7:
                        if(obj1.regCustomer.getName() != null){
                            System.out.println("Pahle account create karo");
                            break;
                        }
                        else obj1.ViewTransactionHistory();;
                        break;
                    case 8:
                        if(obj1.regCustomer.getName() != null){
                            System.out.println("Pahle account create karo");
                            break;
                        }
                        else obj1.Exit();
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