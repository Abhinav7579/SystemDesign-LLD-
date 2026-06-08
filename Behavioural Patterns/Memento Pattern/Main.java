
public class Main {
    public static void main(String[] args) {
        TextEditor editor=new TextEditor();
        Caretaker caretaker=new Caretaker();
        editor.write("hello world");
        caretaker.saveState(editor);
        editor.write("hello abhinav");
        caretaker.saveState(editor);
        caretaker.undo(editor);
        System.out.println(editor.getContent());
    }
    
}
