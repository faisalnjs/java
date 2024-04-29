import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloAction extends JPanel
    implements ActionListener {
  private int xPos, yPos;
  private static String text = "East or West";

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.fillRect(xPos - 30, yPos - 25, 130, 40);
    g.setColor(Color.RED);
    g.drawString(text, xPos, yPos);
  }

  public void actionPerformed(ActionEvent e) {
    xPos--;
    if (xPos < -100)
      xPos = getWidth();

    repaint();
  }

  static class TimerListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      if (text.equals("Java is Best"))
        text = "East or West";
      else
        text = "Java is Best";
    }
  }

  public static void main(String[] args) {
    JFrame window = new JFrame("Action Demo");
    window.setBounds(300, 300, 300, 100);
    HelloAction panel = new HelloAction();
    panel.setBackground(Color.CYAN);
    Container c = window.getContentPane();
    c.add(panel);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    panel.xPos = panel.getWidth();
    panel.yPos = panel.getHeight() / 2;
    Timer clock = new Timer(30, panel);
    clock.start();
    Timer timer = new Timer(2000, new TimerListener());
    timer.start();
  }
}
