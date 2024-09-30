package Exercise_1.Behavioural.Image_Compression_Tool;

public class JpegCompressionStrategy implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        if (fileName == null || !fileName.endsWith(".jpeg")) {
            throw new IllegalArgumentException("Invalid JPEG file.");
        }
        System.out.println("Compressing " + fileName + " using JPEG compression.");
    }
}