package Facade;

public class CPU {

    long pos;
    
    public void freeze() {
        System.out.println("CPU froze");
    }

    public void jump(long position) {
        pos = position;
        System.out.println("CPU jumped to memory location " + pos);
    }

    public void execute() {
        System.out.println("CPU executed code at memory location " + pos);
    }
}
