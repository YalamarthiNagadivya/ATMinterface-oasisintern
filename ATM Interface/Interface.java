import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Interface extends JFrame {

  public Interface() {
    initial();
  }

  public void initial() {
    JFrame frame = new JFrame();
    JLabel background = new JLabel(new ImageIcon("Cover Photo.jpg"));
    {
      setTitle("Interface");
      setSize(1000, 500);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setLayout(new BorderLayout());
      add(background);
      background.setLayout(new FlowLayout());
    }

    JPanel heading_container = new JPanel();
    JPanel content_container_left = new JPanel();
    JPanel content_container_right = new JPanel();
    JPanel OK_container = new JPanel();

    JLabel title = new JLabel("ATM");

    JButton withdraw = new JButton("1.Withdraw");
    JButton deposit = new JButton("2.Deposit");
    JButton transfer = new JButton("3.Transfer");
    JButton history = new JButton("4.History");
    JButton language = new JButton("5.Language");
    JButton exit = new JButton("6.Exit");
    // JButton ok = new JButton("OK");
    JButton back = new JButton("Back");

    {
      title.setFont(new Font("Lucida", Font.BOLD, 48));
      title.setForeground(Color.WHITE);
      title.setBorder(new EmptyBorder(15, 10, 15, 10));
    }

    {
      withdraw.setBorder(new EmptyBorder(10, 50, 10, 50));
      withdraw.setFont(new Font("Lucida", Font.BOLD, 24));
      withdraw.setBackground(Color.DARK_GRAY);
      withdraw.setForeground(Color.YELLOW);
      withdraw.setFocusable(false);
      withdraw.addActionListener(e -> {
        Withdraw frame2 = new Withdraw();
        frame2.setVisible(true);
        dispose();
      });

    }

    {
      deposit.setBorder(new EmptyBorder(0, 50, 10, 50));
      deposit.setFont(new Font("Lucida", Font.BOLD, 24));
      deposit.setBackground(Color.DARK_GRAY);
      deposit.setForeground(Color.YELLOW);
      deposit.setFocusable(false);

      deposit.addActionListener(e -> {
        Deposit frame2 = new Deposit();
        frame2.setVisible(true);
        dispose();
      });
    }
    {
      transfer.setBorder(new EmptyBorder(0, 50, 10, 50));
      transfer.setFont(new Font("Lucida", Font.BOLD, 24));
      transfer.setBackground(Color.DARK_GRAY);
      transfer.setForeground(Color.YELLOW);
      transfer.setFocusable(false);

      transfer.addActionListener(e -> {
        Transfer frame2 = new Transfer();
        frame2.setVisible(true);
        dispose();
      });
    }
    {
      history.setBorder(new EmptyBorder(0, 50, 10, 50));
      history.setFont(new Font("Lucida", Font.BOLD, 24));
      history.setBackground(Color.DARK_GRAY);
      history.setForeground(Color.YELLOW);
      history.setFocusable(false);

      history.addActionListener(e -> {
        Transaction_History frame2 = new Transaction_History();
        frame2.setVisible(true);
        dispose();
      });
    }

    {
      language.setBorder(new EmptyBorder(0, 50, 10, 50));
      language.setFont(new Font("Lucida", Font.BOLD, 24));
      language.setBackground(Color.DARK_GRAY);
      language.setForeground(Color.YELLOW);
      language.setFocusable(false);

      language.addActionListener(e -> {
        Language frame2 = new Language();
        frame2.setVisible(true);
        dispose();
      });
    }
    {
      exit.setBorder(new EmptyBorder(0, 50, 10, 50));
      exit.setFont(new Font("Lucida", Font.BOLD, 24));
      exit.setBackground(Color.DARK_GRAY);
      exit.setForeground(Color.YELLOW);
      exit.setFocusable(false);

      exit.addActionListener(e -> {
        dispose();
      });
    }

    // {
    // ok.setBorder(new EmptyBorder(20, 100, 20, 100));
    // ok.setFont(new Font("Lucida", Font.BOLD, 38));
    // ok.setBackground(Color.DARK_GRAY);
    // ok.setForeground(Color.YELLOW);
    // ok.setFocusable(false);
    // }
    {
      back.setBorder(new EmptyBorder(20, 80, 20, 90));
      back.setFont(new Font("Lucida", Font.BOLD, 38));
      back.setBackground(Color.DARK_GRAY);
      back.setForeground(Color.YELLOW);
      back.setFocusable(false);
      back.addActionListener(e -> {
        Language lan = new Language();
        lan.setVisible(true);
        dispose();
      });
    }
    {

      heading_container.setBackground(Color.yellow);
      heading_container.add(title);
    }

    {
      content_container_left.setLayout(new GridLayout(3, 1));
      content_container_left.add(withdraw);
      content_container_left.add(deposit);
      content_container_left.add(transfer);
    }
    {
      content_container_right.setLayout(new GridLayout(3, 1));
      content_container_right.add(history);
      content_container_right.add(language);
      content_container_right.add(exit);
    }
    {
      OK_container.add(back);
    }
    {
      add(heading_container, BorderLayout.NORTH);
      add(content_container_left, BorderLayout.WEST);
      add(content_container_right, BorderLayout.EAST);
      add(OK_container, BorderLayout.SOUTH);
    }
  }
}
