package collection.hashtable;

import java.util.Hashtable;

public class HashTableExample{
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(new Temp(5), "A");   // 5%11=5
        hashtable.put(new Temp(2), "B");   // 2%11=2
        hashtable.put(new Temp(6), "C");   // 6%11=6
        hashtable.put(new Temp(15), "D");  // 15%11=4
        hashtable.put(new Temp(23), "E");  // 23%11=1
        hashtable.put(new Temp(16), "F");  // 16%11=5
        System.out.println(hashtable);
   /*
   Initial capacity of Hashtable is 11. The elements will be printed in the order Top to Bottom and Right to Left

       10 |             |
        9 |             |
        8 |             |
        7 |             |
        6 | 6=C         |
        5 | 5=A, 16=F   |
        4 | 15=D        |
        3 |             |
        2 | 2=B         |
        1 | 23=E        |
        0 |_____________|
    */


        Hashtable hashtable1 = new Hashtable();
        hashtable1.put(new Temp1(5), "A");   // 5%9=5
        hashtable1.put(new Temp1(2), "B");   // 2%9=2
        hashtable1.put(new Temp1(6), "C");   // 6%9=6
        hashtable1.put(new Temp1(15), "D");  // 15%9=6
        hashtable1.put(new Temp1(23), "E");  // 23%9=5
        hashtable1.put(new Temp1(16), "F");  // 16%9=57
        System.out.println(hashtable1);

   /*
   Initial capacity of Hashtable is 11. The elements will be printed in the order Top to Bottom and Right to Left

       10 |             |
        9 |             |
        8 |             |
        7 | 16=F        |
        6 | 6=C, 15=D   |
        5 | 5=A, 23=F   |
        4 |             |
        3 |             |
        2 | 2=B         |
        1 |             |
        0 |_____________|
    */

    }
}

class Temp{
    int i;
    Temp(int i){
        this.i = i;
    }

    public int hashCode(){
        return i;
    }

    public String toString(){
        return i+"";
    }
}

class Temp1{
    int i;
    Temp1(int i){
        this.i = i;
    }

    public int hashCode(){
        return i%9;
    }

    public String toString(){
        return i+"";
    }
}