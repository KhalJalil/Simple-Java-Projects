import javax.swing.JFrame;
public class DrawPanelTest extends JFrame{

    public static void main (String[] args){

        JFrame theFrame = new JFrame();
        DrawPanel drawPanel = new DrawPanel();

        theFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        theFrame.add(drawPanel);
        theFrame.setSize(680,708);
        theFrame.setVisible(true);
    }
}
