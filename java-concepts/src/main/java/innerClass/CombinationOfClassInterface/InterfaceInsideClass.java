package innerClass.CombinationOfClassInterface;

public class InterfaceInsideClass {
    interface Vehicle{
        int getNumberOfWheels();
    }

    class Bus implements Vehicle{
        @Override
        public int getNumberOfWheels() {
            return 6;
        }
    }

    class Auto implements Vehicle{
        @Override
        public int getNumberOfWheels() {
            return 3;
        }
    }

    public static void main(String[] args) {

    }
}
