import java.util.Scanner;
import java.io.File;

public class InsSortInt {
    public static void main(String[] args) {
        int[] numsArray = new int[1000];
        try {
            Scanner scan = new Scanner(new File("randInts.txt"));
            int i = 0;
            while (scan.hasNextInt() && i < numsArray.length) {
                numsArray[i] = scan.nextInt();
                i++;
            }
            scan.close();
            sort(numsArray, i); // Pass the number of valid elements to the sort method
            System.out.println(numsArray[0] + ":" + numsArray[Math.min(999, i - 1)]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sort(int[] array, int size) {
        for (int i = 1; i < size; i++) {
            int current = array[i];
            int j = i - 1;
            // Move elements of array[0..i-1] that are greater than current to one position ahead
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
}


