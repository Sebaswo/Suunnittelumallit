package Strategy;

import java.util.Random;

public class Main {
    
    public static void main(String[] args) {

        int[] originalNums = new int[20000];
        int [] numsCopy1 = originalNums.clone();
        int [] numsCopy2 = originalNums.clone();
        Random rndm = new Random();
        
        Sorter sorter = new Sorter(new SelectionSort());
        ISort insertionSort = new InsertionSort();
        ISort quickSort = new QuickSort();

        for (int i = 0; i < 20000; i++) {
            originalNums[i] = rndm.nextInt(100000);
        }

        sorter.sortIt(originalNums);

        sorter.setStrategy(insertionSort);
        sorter.sortIt(numsCopy1);

        sorter.setStrategy(quickSort);
        sorter.sortIt(numsCopy2);

    }
}
