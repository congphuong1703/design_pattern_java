package proxy;

public class ProxyImage implements ImageService {

    private RealImage realImage;
    private String url;

    public ProxyImage(RealImage realImage, String url) {
        this.realImage = realImage;
        this.url = url;
    }

    public ProxyImage(String url) {
        this.url = url;
    }

    @Override
    public void showImage() {
        if (realImage == null) {
            realImage = new RealImage(this.url);
        } else {
            System.out.println("Image already existed: " + this.url);
        }
        realImage.showImage();
    }

}
