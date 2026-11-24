class BankAccount{
    long accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(long accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposit amount : "+amount);
        }else{
            System.out.println("Invalid amount for deposit.");
        }
    }
    void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid withdrawl amount");
        }else if(balance >= amount){
            balance = balance - amount;
            System.out.println("Withdrawl amount : " + amount);
        }else{
            System.out.println("Insufficient balance for withdraw!");
        }
    }
    void checkBalance(){
        System.out.println("Current balance : "+balance);
    }
    void accountDetails(){
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance : " + balance);
    }

   
}
    public class bank {
        public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount(608009,"Raj",9000);
        BankAccount acc2 = new BankAccount(608010, "Avi", 9500);

        System.out.println("Account 1");
        System.out.println(acc1.accountHolderName + " --> Bank Details\n");
        acc1.deposit(1500);
        acc1.withdraw(700);
        acc1.checkBalance();
        acc1.accountDetails();

        System.out.println("\nAccount 2");
        System.out.println(acc2.accountHolderName + " --> Bank Details\n");
        acc2.deposit(2000);
        acc2.withdraw(1000);
        acc2.checkBalance();
        acc2.accountDetails();


    }
}
