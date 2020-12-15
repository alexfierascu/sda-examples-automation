package collections.list;

/*Display how many numbers from a give list have the value bigger than n
 *
 * eg: check(myList,7) = 3, where myList = [1,2,5,7,8,9,10]
 * */

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList();
        myList.add(12);
        myList.add(23);
        myList.add(44);
        myList.add(5);
        myList.add(7);
        myList.add(1);
        System.out.println(countNumbersBiggerThanFromList(myList, 7));

        List<Integer> mySecondList = new ArrayList() {{
            add(1);
            add(2);
            add(3);
            add(23);
            add(44);
            add(5);
            add(7);
            add(1);
        }};

        System.out.println(countNumbersBiggerThanFromList(mySecondList, 2));
    }

    public static int countNumbersBiggerThanFromList(List<Integer> myList, int limit) {
        int counter = 0;
        for (int element : myList) {
            if (element > limit) {
                counter++;
            }
        }
        return counter;
    }
}
