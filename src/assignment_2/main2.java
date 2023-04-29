package assignment_2;
//•	Create a class Account with two overloaded constructors. The first constructor is used for initializing, the name of account holder, the account number and the initial amount in the account. The second constructor is used for initializing the name of the account and the current balance. The Account class is having method Deposite(), Withdraw(), and Get_Balance().
//Make the necessary assumption for data members and return types of methods. Create objects of Account class and use them.
class Account{
    String name;
    int accountNumber;
    double balance;

    public Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "Account name is " + this.name + " and balance is " + this.balance + " dollars.";
    }
}


public class main2 {
    public static void main(String[] args) {
        Account account1 = new Account("John", 123456789, 1000);
        Account account2 = new Account("Jane", 987654321, 2000);

        account1.deposit(1000);
        account2.withdraw(500);

        System.out.println(account1);
        System.out.println(account2);
    }
}

