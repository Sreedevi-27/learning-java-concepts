package interfacePackage;

interface E{
    void print();
    static void printStatic(){
        System.out.println("Interface E");
    }
}

class G implements E{
    @Override
    public void print(){
        System.out.println("Class G implements E");
    }

    static void printStatic(){
        System.out.println("Interface G");
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        E e = new G();
        e.print();
        E.printStatic();

        G g = new G();
        g.printStatic();
    }
}

