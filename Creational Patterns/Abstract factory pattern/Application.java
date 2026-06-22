
interface Button{
    void render();
}

interface ScrollBar{
    void scroll();
}


class WindowsButton implements Button{
    @Override
    public void render(){
        System.out.println("rendring windows button");
    }
}

class MacButton implements Button{
    @Override
    public void render(){
        System.out.println("rendring mac button");
    }
}

class WindowsScrollBar implements ScrollBar{
    @Override
    public void scroll(){
        System.out.println("scrolling for windows ");
    }
}

class MacScrollBar implements ScrollBar{
    @Override
    public void scroll(){
        System.out.println("scrolling for mac");
    }
}


//abstract factory interface

interface UIFactory{
    Button createButton();
    ScrollBar createScrollBar();
}


//concrete implimentation 

class WindowsFactory implements UIFactory{

    @Override
    public Button createButton(){
        return new WindowsButton();
    }

    @Override
    public ScrollBar createScrollBar(){
        return new WindowsScrollBar();
    }
}

class MacFactory implements UIFactory{
     @Override
    public Button createButton(){
        return new MacButton();
    }

    @Override
    public ScrollBar createScrollBar(){
        return new MacScrollBar();
    }

}


//client code
public class Application {

    private Button button;
    private ScrollBar scrollBar;

    public Application(UIFactory factory){
        this.button=factory.createButton();
        this.scrollBar=factory.createScrollBar();
    }

    public void renderUI(){
        button.render();
        scrollBar.scroll();
    }
    public static void main(String[] args) {
        
        UIFactory windowsFactory=new WindowsFactory();
        Application app=new Application(windowsFactory);
        app.renderUI();

    }
    
}
