package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Dummy {
    public static void main(String[] args) {
        Dummy.func();
    }

    public static  void func(){
        int[] groupSizes = {3,3,3,3,3,1,3};
        List<List<Integer>> finalGroupOfPeople = new ArrayList<>();
        Map<Integer, List<Integer>> countGroups = new TreeMap<>();
        for (int index=0; index<groupSizes.length ; index++) {
            List<Integer> group = countGroups.getOrDefault(groupSizes[index], new ArrayList<>());
            group.add(index);
            countGroups.put(groupSizes[index], group);
        }
        finalGroupOfPeople.addAll(Dummy.func2(countGroups));
    }

    public static List<List<Integer>> func2(Map<Integer, List<Integer>> countGroups) {
        List<List<Integer>> finalList = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : countGroups.entrySet()) {
            int groupCount = entry.getKey();
            List<Integer> groupOfPeople = entry.getValue();
            for (int i = 0; i < groupOfPeople.size(); ) {
                finalList.add(groupOfPeople.subList(i, i + groupCount));
                i += groupCount;
            }
        }
        return finalList;
    }
}

interface A{
     void m1();
}

interface B{
    void m1();
}