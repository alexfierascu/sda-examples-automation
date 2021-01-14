package beginner;

//https://www.javatpoint.com/java-program-to-remove-duplicate-element-in-an-array
//https://dev.to/jsp/remove-duplicates-from-array-2k2d
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        // Array with duplicate elements
        int arr[] = {10, 20, 20, 30, 30, 40, 50, 50};
        int c = removeDuplicateElements(arr);
        for (int i = 0; i < c; i++)
            System.out.print(arr[i] + " ");
    }


    public static int removeDuplicateElements(int[] arr) {
        int length = arr.length;
        if (length == 0 || length == 1) {
            return length;
        }
        int[] temp = new int[length];
        int j = 0;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[length - 1];
        // Changing original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }
}
