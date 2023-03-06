package Strategy;

public class Sorter {
    
    private ISort strategy;
    private int[] sortedArr;

    public Sorter(ISort strategy) {
        this.strategy = strategy;
    }

    public int[] sortIt(int[] arr) {
        long start = System.currentTimeMillis();
        sortedArr = strategy.sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("Sorting took " + (end - start) + " ms with " + strategy.getName());
        return sortedArr;
    }

    public void setStrategy(ISort strategy) {
        this.strategy = strategy;
    }
}
