import java.util.*;

public class ArrayUnion {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {3, 4, 5, 6};

        Set<Integer> union = new LinkedHashSet<>();
        union.addAll(Arrays.asList(arr1));
        union.addAll(Arrays.asList(arr2));

        System.out.println("Union of arrays: " + union);
    }
}
