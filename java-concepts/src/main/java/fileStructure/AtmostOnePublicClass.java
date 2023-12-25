// A java class can contain atmost one Package name
// Package statement should be the first statement in a java file

// import java.util.ArrayList; -> This gives compile time error
package fileStructure;

import java.util.ArrayList;

// A java class can contain any number of classes, but almost one PUBLIC class.
// If any one of the class in a java file is public, then the file name should be that class name

public class AtmostOnePublicClass {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
    }
}

class A1 {
    public static void main(String[] args) {

    }

}

class A2 {

}
