package Exercise_1.Behavioural.Image_Compression_Tool;

public class ImageCompressor {
    private CompressionStrategy strategy;

    public void setCompressionStrategy(CompressionStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Compression strategy cannot be null.");
        }
        this.strategy = strategy;
    }

    public void compressImage(String fileName) {
        if (strategy == null) {
            throw new IllegalStateException("Compression strategy not set.");
        }
        strategy.compress(fileName);
    }
}
