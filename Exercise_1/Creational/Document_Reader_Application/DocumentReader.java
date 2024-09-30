public class DocumentReader {
    public static void main(String[] args) {
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        pdfFactory.openDocument();

        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.openDocument();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.openDocument();
    }
}
