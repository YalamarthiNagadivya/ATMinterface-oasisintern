import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Transfer extends JFrame {

  public Transfer() {
    setSize(600, 300);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);
    setTitle("Transfer");

    JPanel heading = new JPanel();
    JPanel main = new JPanel();
    JPanel okpanel = new JPanel();

    JLabel title = new JLabel("Tranfer");
    JLabel amount_value = new JLabel("Enter amount : ");
    JLabel account_number = new JLabel("Account Number : ");

    JTextField value = new JTextField(10);
    JTextField number = new JTextField(10);
    JLabel gap = new JLabel();

    JButton ok = new JButton("OK");

    gap.setBorder(new EmptyBorder(20, 20, 20, 20));
    {
      account_number.setFont(new Font("Lucida", Font.PLAIN, 30));
      account_number.setForeground(Color.BLACK);
      number.setFont(new Font("Lucida", Font.PLAIN, 30));
      number.setForeground(Color.BLACK);
    }
    {
      amount_value.setFont(new Font("Lucida", Font.PLAIN, 30));
      amount_value.setForeground(Color.BLACK);
      value.setFont(new Font("Lucida", Font.PLAIN, 30));
    }
    {
      title.setFont(new Font("Lucida", Font.BOLD, 30));
      title.setForeground(Color.BLACK);
    }
    {
      ok.setFont(new Font("Lucida", Font.PLAIN, 30));
      ok.setForeground(Color.BLACK);
      ok.setBackground(Color.YELLOW);
      // ok.setBorder(new EmptyBorder(0, 0, 160, 0));
      ok.setOpaque(false);
      ok.setFocusable(false);
      ok.addActionListener(e -> {
        dispose();
      });

    }
    heading.add(title);
    // main.setBorder(new EmptyBorder(160, 0, 0, 0));
    main.setBackground(Color.YELLOW);
    main.setLayout(new FlowLayout());
    main.add(account_number);
    main.add(number);
    main.add(gap);
    main.add(amount_value);
    main.add(value);
    // main.add(gap);
    okpanel.setBackground(Color.YELLOW);
    okpanel.add(ok);

    add(heading, BorderLayout.NORTH);
    add(main, BorderLayout.CENTER);
    add(okpanel, BorderLayout.SOUTH);
  }
}
