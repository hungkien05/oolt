import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public void gameLoop() {
        long lasttime = System.currentTimeMillis();
        while (true) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lasttime > 1000/60) {
                this.repaint();
                lasttime = currentTime;
            }

        }
    }
}

