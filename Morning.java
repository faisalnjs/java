//Chapter 3 Question 12 (a)

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Morning extends JFrame
  implements ActionListener {
  private EasySound rooster;
  private Color color = Color.WHITE;

  /**
   *   Constructor
   */
  public Morning()
  {
    super("Morning");
    rooster = new EasySound("roost.wav");
    rooster.play();
  }

  public void actionPerformed(ActionEvent e)
  {
    rooster.play();
    Container c = getContentPane();
    if (color == Color.WHITE)
      color = Color.BLACK;
    else
      color = Color.WHITE;
    c.setBackground(color);
    repaint();
  }

  public static void main(String[] args)
  {
    Morning morning = new Morning();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);
    Timer clock = new Timer(5000, morning);
    clock.start();
  }
}  
