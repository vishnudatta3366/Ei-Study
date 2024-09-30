package Exercise_1.Behavioural.Image_Compression_Tool;

public class ImageCompressionDemo {
    public static void main(String[] args) {
        ImageCompressor compressor = new ImageCompressor();

        compressor.setCompressionStrategy(new JpegCompressionStrategy());
        compressor.compressImage("photo.jpeg");

        compressor.setCompressionStrategy(new PngCompressionStrategy());
        compressor.compressImage("diagram.png");

        compressor.setCompressionStrategy(new GifCompressionStrategy());
        compressor.compressImage("animation.gif");
    }
}
