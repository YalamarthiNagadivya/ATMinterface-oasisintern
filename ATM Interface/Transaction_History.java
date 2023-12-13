import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Transaction_History extends JFrame {

  public Transaction_History() {
    setTitle("Transaction History");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    setSize(800, 500);
    setVisible(true);

    JPanel pane = new JPanel();
    JPanel content = new JPanel();
    JLabel title = new JLabel("Transaction History");
    title.setFont(new Font("Lucida", Font.BOLD, 38));

    content.setBackground(Color.YELLOW);
    pane.add(title);
    add(pane, BorderLayout.NORTH);
    add(content, BorderLayout.CENTER);
  }
}
