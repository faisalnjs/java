package resources;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloGui extends JFrame {
  public HelloGui() {
    super("GUI Demo");
    Container c = getContentPane();
    c.setBackground(Color.CYAN);
    c.setLayout(new FlowLayout());
    c.add(new JLabel(" Hello, GUI!", 10));
  }

  public static void main(String[] args) {
    HelloGui window = new HelloGui();
    window.setBounds(300, 300, 200, 100);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}
