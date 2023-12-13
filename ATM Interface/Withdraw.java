import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class Withdraw extends JFrame {

  public Withdraw() {
    initial();
  }

  public void initial() {
    setTitle("Withdraw action");
    setSize(500, 400);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setVisible(true);
    getContentPane().setBackground(Color.YELLOW);

    JPanel heading = new JPanel();
    JPanel panel1 = new JPanel();

    JTextField value = createJTextField();

    JLabel title = new JLabel("Withdraw");
    JLabel amount_value = new JLabel("Enter amount :");
    JButton ok = new JButton("OK");
    {
      ok.setFont(new Font("Lucida", Font.BOLD, 24));
      ok.addActionListener(e -> {
        dispose();
      });
    }
    {
      amount_value.setForeground(Color.BLACK);
      amount_value.setFont(new Font("Lucida", Font.BOLD, 24));
    }

    {
      value.setBorder(new EmptyBorder(10, 10, 10, 40));
    }
    {
      title.setFont(new Font("Lucida", Font.BOLD, 38));
      title.setForeground(Color.black);

    }
    heading.add(title);
    {
      panel1.setBorder(new EmptyBorder(50, 50, 50, 50));
      panel1.setBackground(Color.YELLOW);
      panel1.add(amount_value);
      panel1.add(value);
      panel1.add(ok);
    }

    add(heading, BorderLayout.NORTH);
    add(panel1, BorderLayout.CENTER);
  }

  public JTextField createJTextField() {
    JTextField textField = new JTextField(6);
    return textField;
  }
}
