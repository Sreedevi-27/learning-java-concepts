package multithreading;

public class InterThreadComm {
    public static void main(String[] args) {
        OddEven p = new OddEven();
        Odd odd = new Odd(p);
        odd.start();
        Even even = new Even(p);
        even.start();
    }
}

class Odd extends Thread{
    OddEven p;
    Odd(OddEven p){
        this.p = p;
    }

    @Override
    public void run() {
        try {
            p.printOdd();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Even extends Thread{
    OddEven p;
    Even(OddEven p){
        this.p = p;
    }

    @Override
    public void run() {
        try {
            p.printEven();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class OddEven{
    int i=1;
    public synchronized void printEven() throws InterruptedException {
        while(i<10){
            if(i%2==0) {
                System.out.println(i++);
            }else {
                notify();
                wait();
            }
        }
    }

    public synchronized void printOdd() throws InterruptedException {
        while(i<10){
            if(i%2!=0) {
                System.out.println(i++);
            }else{
                notify();
                wait();
            }
        }
    }
}
