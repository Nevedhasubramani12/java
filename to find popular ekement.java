//.Find popular element in an array

import java.util.HashMap;

public class PopularElement {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 1, 2, 1, 1, 3, 3, 3, 3};
        
       
        findPopularElement(arr);
    }

    public static void findPopularElement(int[] arr) {
        int N = arr.length;
        int threshold = N / 4;

        HashMap<Integer, Integer> elementCount = new HashMap<>();

                for (int num : arr) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        
        for (int num : elementCount.keySet()) {
            if (elementCount.get(num) > threshold) {
                System.out.println(num);
                return;
            }
        }

                System.out.println(-1);
    }
}
