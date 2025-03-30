package designPattern.factoryDesignPattern.example3;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        try {
            Document doc1 = DocumentFactory.documentFactoryMethod("pdf");
            String pdfDoc = doc1.render();
            System.out.println(pdfDoc);

            Document doc2 = DocumentFactory.documentFactoryMethod("word");
            String wordDoc = doc2.render();
            System.out.println(wordDoc);

            Document doc3 = DocumentFactory.documentFactoryMethod("excel");
            String excelDoc = doc3.render();
            System.out.println(excelDoc);

            Document doc4 = DocumentFactory.documentFactoryMethod("page");
            String page = doc4.render();
        }
        catch(Exception e){
            System.out.println("please add a valid key : " + e.getMessage());
            }

    }
}
