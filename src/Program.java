import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Program {
    public static boolean isSpacePress = false;

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("Flappy Bird");
        window.setSize(400,700);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GamePanel panel = new GamePanel();
        panel.setSize( new Dimension(400, 700));
        window.add(panel);
        window.pack();

        KeyAdapter keyHandler = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_SPACE) {
                    isSpacePress = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_SPACE) {
                    isSpacePress = false;
                }
            }
        };

        window.addKeyListener(keyHandler);
        window.setVisible(true);
    }
}
