package Facade;

public class HardDrive {
    char[] data = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

    public char[] read(long lba, int size) {
        int index = 0;
        char[] readData = new char[size];
        for (long i = lba; i < lba+size; i++) {
            readData[index] = data[(int) i];
            index++;
        }
        System.out.println("Read data from hard drive at logical block addressing: " + lba + "-" + (lba+size-1));
        return readData;
    }
}
