package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayUsingJavaStreamAPI {
    public static void main(String[] args) {
        Integer[] originalArray = new Integer[]{1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8};
        removeDuplicates(originalArray);
    }

    public static void removeDuplicates(Integer[] origArray) {
        List<Integer> listWithoutDuplicates = Arrays.asList(origArray)
                .stream()
                .distinct()
                .collect(Collectors.toList());
        listWithoutDuplicates.sort(Comparator.naturalOrder());

        System.out.println(listWithoutDuplicates);
    }
}
