public class BTTH {

    public static class BankAccount {
        private String accountNumber;
        private String ownerName;
        private double balance;

        public BankAccount() {
            this.accountNumber = "000";
            this.ownerName = "Unknown";
            this.balance = 0;
        }

        public BankAccount(String accountNumber, String ownerName, double balance) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            setBalance(balance);
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            if (balance >= 0) {
                this.balance = balance;
            } else {
                System.out.println("So du khong hop le!");
            }
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            } else {
                System.out.println("So tien nap khong hop le!");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Khong du so du de rut!");
            }
        }

        public void printInfo() {
            System.out.println("So tai khoan: " + accountNumber);
            System.out.println("Chu tai khoan: " + ownerName);
            System.out.println("So du: " + balance);
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("AC01", "Quydz", 500000);
        BankAccount acc2 = new BankAccount();

        acc1.deposit(200000);
        acc1.withdraw(100000);

        acc2.deposit(300000);
        acc2.withdraw(500000);

        acc1.printInfo();
        acc2.printInfo();
    }
}
