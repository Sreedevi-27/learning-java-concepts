package datahiding.encapsulation;

// Encapsulation - Data hiding + Abstraction
public class Account {
    private double balance = 5000.0;

    public double getBalance() {
        // validate if the user can access the balance
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


//  A class is said to be tightly encapsulated if all the data member/variable in the class is private.
class TightlyEncapsulatedClass{
    private int a;
    private int b;
    private int c;
    private void setA(int a){
        this.a = a;
    }
}

// class A is NOT TIGHTLY ENCAPSULATED CLASS because it contains the variable x which is not private
class A extends TightlyEncapsulatedClass{
    int x;
}

// If the parent class is not tightly encapsulated then no other child class is tightly encapsulated.
// class B is NOT TIGHTLY ENCAPSULATED CLASS because it contains the variable x which is not private
class B extends A{
    private int y;
}

// It is NOT TIGHTLY ENCAPSULATED CLASS because it contains the variable c which is not private
class NotTightlyEncapsulatedClass{
    private int a;
    private int b;
    int c;
}

// It is NOT TIGHTLY ENCAPSULATED CLASS because it contains the variable c which is not private
class C extends NotTightlyEncapsulatedClass{
    private int x;
}