package lambdaExpressions;

public class MulthithreadingWithLambda {
    public static void main(String[] args) {
        Runnable r = () -> {
            for(int i=1; i<=10; i++) System.out.println("Thread 1");
        };

        Thread thread = new Thread(r);
        thread.start();
        for(int i=1; i<=10; i++) System.out.println("Main Thread");
    }
}
