import java.util.Scanner;

public class InsSortInt {
    public static void main (String[] args){
        int[] numsArray = new int [1000];
        Scanner scan = new Scanner(new File("randInts.txt"));
        for (int i = 0; i<numsArray.length; i++){
            numsArray[i] = scan.nextInt();
        }
        sort(numsArray);
        System.out.println(numsArray[0] + ":" + numsArray[999]);
    }

    public static void sort (int[] array){
        for (int i =1; i<array.length; i++){
            int current = array[i];
            int first = i-1;
            while (array[first] >=0 && array[first] >= current){
                first = current;
                current = (first-1);
                first--;
            }
        }
    }
}