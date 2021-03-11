import javax.swing.JPanel;
import java.awt.*;

public class CopyPanel extends JPanel{

    public void paint(Graphics g){

        super.paint(g);
       // thePanel.getHeight();
        g.drawLine(100,200,500,200);
        g.drawString("Theworld", 400,500);

    }
}
