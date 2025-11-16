class Bank {
    int balance;

    public Bank(int bal) {
        System.out.println("In Bank");
        this.balance = bal;
    }

    public void showBalance() {
        System.out.printf("Available Balance: %s\n", balance);
    }

    public void deposit(int amt) {
        System.out.printf("Deposit Amt: %s\n", amt);
        this.balance += amt;
    }
    
    public void withdraw(int amt) {
        System.out.printf("Withdraw Amt: %s\n", amt);
        this.balance -= amt;
    }
}




class HDFC extends Bank {
    public HDFC(int b) {
        super(b);
        System.out.println("In HDFC");
    }
}

class SBI extends Bank {
    public SBI(int b) {
        super(b);
    }

    @Override
    public void withdraw(int amt) {
        super.withdraw(amt + 100);
    }
}

class Main {
    public static void main(String[] args) {
        SBI acc1 = new SBI(1000);
        acc1.showBalance();
        acc1.deposit(500);
        acc1.showBalance();
        acc1.withdraw(300);
        acc1.showBalance();
    }
}
//CW: Add methods: deposit(amt) and withdraw(amt)