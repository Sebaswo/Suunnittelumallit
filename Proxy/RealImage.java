package Proxy;

public class RealImage implements Image {
    private final String filename;
    private final String date;
    private final double fileSize;

    public RealImage(String filename, String date, double fileSize) {
        this.filename = filename;
        this.date = date;
        this.fileSize = fileSize;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

    @Override
    public void showData() {
        System.out.println("Name of image: " + filename + ", date: " + date + ", file size: " + fileSize + "KB");
    }
}
