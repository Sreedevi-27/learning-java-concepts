package datahiding;

// Declaring the variables as private and accessing those variables using a public method
// Advantage - security

class Bank {
    private double balance = 5000.0;

    public double getBalance() {
        // validate if the user can access the balance
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class PersonA {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.getBalance());
    }
}