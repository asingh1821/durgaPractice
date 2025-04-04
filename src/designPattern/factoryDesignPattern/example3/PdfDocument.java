package designPattern.factoryDesignPattern.example3;

public class PdfDocument implements Document{

    @Override
    public String render(){
        return "rendering Pdf documents";
    }


}
