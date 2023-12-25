package objectCasting;

// While type-casting the objects, two reference variables will be pointing to the single object.
public class ObjectTypeCasting1 {
    public static void main(String[] args) {
        String str = new String("sree");
        Object obj = (Object) str;
        System.out.println(str==obj);
        // For the same object [new String("sree")], the variables str and obj will be pointed.

        Integer integer = new Integer(10);
        Number number = (Number) integer;
        Object object = (Object) number;
        System.out.println(integer==number);
        System.out.println(number==object);
        System.out.println(integer==object);
    }
}
