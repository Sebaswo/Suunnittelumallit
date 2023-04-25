package Facade;

public class ComputerFacade {
    
    private CPU cpu;
    private HardDrive hd;
    private Memory mem;
    private long kBootAddress = 0x7C00;
    private long kBootSector = 0;
    private int kSectorSize = 8;


    
    public ComputerFacade() {
        cpu = new CPU();
        hd = new HardDrive();
        mem = new Memory();
    }

    public void start() {
        cpu.freeze();
        mem.load(kBootAddress, hd.read(kBootSector, kSectorSize));
        cpu.jump(kBootAddress);
        cpu.execute();
    }
}
