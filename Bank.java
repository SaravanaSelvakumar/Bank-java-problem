public class Bank {
    public static void main(String[] args) {
        BankAccount user_1 = new BankAccount();
        BankAccount user_2 = new BankAccount();
        user_1.deposit(600);
        user_1.withDraw(12000);
        System.out.println("currenet balance : " + user_1.balance);
    }
}

class BankAccount {
    int accountNumber = 122436773;
    int balance = 20000;
    
    public int deposit(int amount) {
        return balance += amount;
    }

    public int withDraw(int am) {
        return balance -= am;
    }
}

