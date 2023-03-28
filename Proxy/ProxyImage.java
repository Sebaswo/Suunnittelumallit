package Proxy;

class ProxyImage implements Image {
    private final String filename;
    private final String date;
    private final double fileSize;
    private RealImage image;
    
    public ProxyImage(String filename, String date, double fileSize) {
        this.filename = filename;
        this.date = date;
        this.fileSize = fileSize;
    }

    @Override
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename, date, fileSize);
        }
        image.displayImage();
    }

    @Override
    public void showData() {
            System.out.println("Name of image: " + filename + ", date: " + date + ", file size: " + fileSize + "KB");
    }
    
}