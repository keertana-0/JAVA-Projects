import java.util.*;
class BankAccount{
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
     }
      void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }
    double checkBalance() {
        return balance;
    }
    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
public class bankManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        BankAccount account = new BankAccount(num, name, balance);
        System.out.print("Enter deposit amount: ");
        account.deposit(sc.nextDouble());
        System.out.print("Enter withdrawal amount: ");
        account.withdraw(sc.nextDouble());
        account.displayAccount();
    }
}