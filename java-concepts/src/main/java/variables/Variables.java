package variables;

import java.util.HashMap;
import java.util.Map;

public class Variables {
    public static void main(String[] args) {
         Variables v = new Variables();
         int[] nums1 = {24,28,7,27,7,27,9,24,9,10};
         int[] nums2 = {12,29,9,7,5};
        int[] result = new int[2];
        Map<Integer, Integer> hm1 = new HashMap<>();
        Map<Integer, Integer> hm2 = new HashMap<>();

        for(int i=0; i<nums1.length; i++){
            if(hm1.containsKey(nums1[i])) hm1.put(nums1[i], hm1.get(nums1[i])+1);
            else hm1.put(nums1[i], 1);
        }

        for(int i=0; i<nums2.length; i++){
            if(hm2.containsKey(nums2[i])) hm2.put(nums2[i], hm2.get(nums2[i])+1);
            else hm2.put(nums2[i], 1);
        }

        for(Map.Entry<Integer, Integer> e : hm1.entrySet()){
            if(hm2.containsKey(e.getKey())){
                result[0] += hm1.get(e.getValue());
//                 result[1] += hm2.get(x);
            }
        }
        System.out.println(result[0]+"--"+result[1]);
    }

    public void m1(){

    }
}
