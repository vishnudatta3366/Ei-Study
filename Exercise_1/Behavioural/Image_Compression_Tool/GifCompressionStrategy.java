package Exercise_1.Behavioural.Image_Compression_Tool;

public class GifCompressionStrategy implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        if (fileName == null || !fileName.endsWith(".gif")) {
            throw new IllegalArgumentException("Invalid GIF file.");
        }
        System.out.println("Compressing " + fileName + " using GIF compression.");
    }
}
