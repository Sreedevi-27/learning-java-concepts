package objectCasting;

class SingletonClass {
    private SingletonClass(){
    }

    private static SingletonClass instance;

    public static SingletonClass getInstance(){
        if(instance == null)
            instance = new SingletonClass();
        return  instance;

    }
}

public class SingletonMainClass{
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}