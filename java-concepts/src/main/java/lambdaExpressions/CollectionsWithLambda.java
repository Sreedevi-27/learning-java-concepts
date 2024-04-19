package lambdaExpressions;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsWithLambda {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(19);
        al.add(47);
        al.add(92);
        al.add(10);
        al.add(8);
        al.add(26);
        System.out.println(al);
        ArrayList<Integer> newAL = new ArrayList<>();
        newAL.addAll(al);
        Collections.sort(al, new MyComporartor());
        System.out.println(al);

        System.out.println(newAL);
        Comparator<Integer> com = (i1, i2) -> (i1<i2) ? 1 : (i2<i1) ? -1 : 0;
        Collections.sort(newAL, com);
        System.out.println(newAL);
    }
}

class MyComporartor implements Comparator<Integer>{
    @Override
    public int compare(Integer i1, Integer i2) {
//        if(i1 < i2) return 1;
//        else if(i2 < i1) return -1;
//        return 0;

        return (i1<i2) ? 1 : (i2<i1) ? -1 : 0 ;
    }
}
