package collection.cursors;

import java.util.Enumeration;
import java.util.Vector;
/*
 i) For legacy classes only
 ii) Can only read the object. No remove or replacement methods
 */
public class EnumerationExample {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i=0; i<10; i++)
            vector.add(i);
        Enumeration enumeration = vector.elements();
        while(enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement());
    }
}
