import java.util.*;

public class Main {
    public static void main(String[] args) {


class Account {
    String accountHolderName;
    String accountNo;
    String ifscCode;
    double balance;

    
    Account(String accountHolderName, String accountNo, String ifscCode, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNo = accountNo;
        this.ifscCode = ifscCode;
        this.balance = balance;
    }

    
    void debitAmount(double amount) {
        if (amount > this.balance) {
            System.out.println("❌ Insufficient balance!");
        } else {
            this.balance -= amount;
            System.out.println("✅ " + amount + " debited successfully.");
        }
    }

    
    void displayBalance() {
        System.out.println("💰 Current balance: ₹" + this.balance);
    }

    
    void displayAccount() {
        System.out.println("🧾 Account Details:");
        System.out.println("Name      : " + this.accountHolderName);
        System.out.println("Account No: " + this.accountNo);
        System.out.println("IFSC Code : " + this.ifscCode);
        displayBalance();
    }
}

        Scanner sc = new Scanner(System.in);

        
        Account acc = new Account("Prashant Kumar Sharma", "1234567890", "SBIN0001234", 5000.0);
        acc.displayAccount();

        
        System.out.print("\nEnter amount to debit: ");
        double amount1 = sc.nextDouble();
        acc.debitAmount(amount1);
        acc.displayBalance();

        
        System.out.print("\nEnter another amount to debit: ");
        double amount2 = sc.nextDouble();
        acc.debitAmount(amount2);
        acc.displayBalance();

        sc.close();
    }
}
