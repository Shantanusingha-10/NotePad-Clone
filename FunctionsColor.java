import java.awt.Color;

public class FunctionsColor {
    Gui gui;
    
    public FunctionsColor(Gui gui){
        this.gui=gui;
    }
    public void changeColor(String color){
        switch (color) {
            case "White":
                gui.window.getContentPane().setBackground(Color.white);
                gui.textArea.setBackground(Color.white);
                gui.textArea.setForeground(Color.black);
                break;
            case "Black":
                gui.window.getContentPane().setBackground(Color.black);
                gui.textArea.setBackground(Color.black);
                gui.textArea.setForeground(Color.white);
                break;
            case "Blue":
                gui.window.getContentPane().setBackground(Color.BLUE);
                gui.textArea.setBackground(Color.BLUE);
                gui.textArea.setForeground(Color.white);
                break;
        }
    }
}
