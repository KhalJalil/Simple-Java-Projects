import java.awt.Graphics;
import javax.swing.JPanel;


public class DrawPanel extends JPanel {

    public void paint(Graphics g){

        super.paint(g);

        int height = getHeight();
        int width = getWidth();
        int steps = 40;
        int count = 0;
        int count2 = 0;
        int count3= 0;
        int count4 = 0;
        //int timesFour = 4;
        g.drawLine(0,0,0,getHeight());


        for (int i = 0 ; i<=15 ; i++) {
            g.drawLine(width, 0, width - steps, height-steps );
            g.drawLine(0, 0, steps, height - steps);
            g.drawLine(0, height, height -steps, width -steps );
            g.drawLine(width, height, width - steps, steps);
            steps += 40;

            }


        //g.drawLine(100,400, width,height);

       // g.drawLine(100,100,500,500);

       // g.drawLine(100,500, 500,100);
    }
}
