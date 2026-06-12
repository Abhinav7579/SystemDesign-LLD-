public class CommandPattern {
    public static void main(String[] args) {
        TextEditor te=new TextEditor();
         Button bt=new Button();
        BoldCommand bc=new BoldCommand(te);
       
        bt.setCommand(bc);
        bt.onclick();
    }
}

interface Command {
    void execute();
}

class BoldCommand implements Command {

    private TextEditor editor;
    public BoldCommand(TextEditor editor){
        this.editor=editor;
    }

     @Override
     public void execute(){
        editor.BoldText();
     }
}
 class Button{

    private Command command;
    public void setCommand(Command command){
        this.command=command;
    }
    
    public void onclick(){
        command.execute();
    }
 }

class TextEditor{
    public void BoldText(){
        System.out.println("the text have been bolded");
    }

     public void ItallicText(){
        System.out.println("the text have been Italicized");
    }

}