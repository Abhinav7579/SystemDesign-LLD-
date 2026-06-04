public class Dependency {
    public static void main(String[] args) {
        Document doc = new Document("Dependency Example Document");
        Printer printer = new Printer();

        // Printer depends on Document to print its content
        printer.print(doc);
    }
    
}
class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
class Printer{
    public void print(Document dc){
        System.out.println(dc.getContent());
    }
}