import javax.swing.*;

public class CopyPanelMain {

    public static void main (String []args){

        JFrame theWindow = new JFrame();
        CopyPanel copyPanel = new CopyPanel();

        theWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theWindow.setSize(660,770);

        theWindow.add(copyPanel);
        theWindow.setVisible(true);
    }
}
