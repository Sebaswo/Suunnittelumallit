package Facade;

public class Memory {
    
    public void load(long position, char[] data) {
        System.out.println("Loaded data into memory position " + position + ":");
        for (char mem: data) {
            System.out.println(mem);
        }
    }
}
