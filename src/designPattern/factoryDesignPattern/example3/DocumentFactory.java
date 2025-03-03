package designPattern.factoryDesignPattern.example3;

public interface DocumentFactory {

    public static Document documentFactoryMethod(String documentsType) throws NotAValidKeyException{
        if(documentsType.equalsIgnoreCase("pdf")){
            return new PdfDocument();
        } else if (documentsType.equalsIgnoreCase("excel")) {
            return new ExcelDocument();
        }else if (documentsType.equalsIgnoreCase("word")) {
            return new WordDocument();
        }
       throw new NotAValidKeyException("The entered is wrong");
    }
}
