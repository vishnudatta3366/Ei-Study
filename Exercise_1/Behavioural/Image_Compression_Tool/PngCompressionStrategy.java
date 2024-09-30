package Exercise_1.Behavioural.Image_Compression_Tool;

public class PngCompressionStrategy implements CompressionStrategy {
    @Override
    public void compress(String fileName) {
        if (fileName == null || !fileName.endsWith(".png")) {
            throw new IllegalArgumentException("Invalid PNG file.");
        }
        System.out.println("Compressing " + fileName + " using PNG compression.");
    }
}
