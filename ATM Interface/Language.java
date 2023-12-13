import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Language extends JFrame {

  public Language() {

    Font heading_font = new Font("Arial", Font.BOLD, 36);
    Font content_font = new Font("Arial", Font.PLAIN, 30);
    Color labelColor = new Color(128, 128, 255);
    JLabel heading_title = new JLabel("SELECT LANGUAGE");
    heading_title.setFont(heading_font);
    heading_title.setForeground(labelColor);

    JButton language1, language2, language3, ok;

    language1 = new JButton("English");
    language2 = new JButton("Hindi");
    language3 = new JButton("Telugu");
    ok = new JButton("OK");

    language1.setFont(content_font);
    language1.setForeground(Color.BLACK);
    language1.setBackground(labelColor);
    language1.setFocusable(false);
    language1.setMnemonic('E');
    language1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
        try {
          Login log = new Login();
          log.setVisible(true);
          dispose();
        } catch (IOException io) {

        }
      }
    });
    language1.setBorder(new EmptyBorder(25, 100, 25, 100));

    language2.setFont(content_font);
    language2.setForeground(Color.BLACK);
    language2.setBackground(labelColor);
    language2.setFocusable(false);
    language2.setMnemonic('H');
    language2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
        try {
          Login log = new Login();
          log.setVisible(true);
          dispose();
        } catch (IOException io) {

        }
      }
    });
    language2.setBorder(new EmptyBorder(25, 100, 25, 100));

    language3.setFont(content_font);
    language3.setForeground(Color.BLACK);
    language3.setBackground(labelColor);
    language3.setFocusable(false);
    language3.setMnemonic('T');
    language3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
        try {
          Login log = new Login();
          log.setVisible(true);
          dispose();
        } catch (IOException io) {

        }
      }
    });
    language3.setBorder(new EmptyBorder(25, 100, 25, 100));

    ok.setFont(heading_font);
    ok.setForeground(Color.YELLOW);

    JPanel content = new JPanel();
    content.setSize(500, 500);
    content.setBackground(labelColor);

    content.add(language1);
    content.add(language2);
    content.add(language3);

    JPanel heading = new JPanel();
    heading.setBorder(new EmptyBorder(50, 50, 50, 50));
    heading.setSize(500, 100);
    heading.setBackground(Color.WHITE);
    heading.add(heading_title);

    setTitle("Language");
    setSize(500, 600);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);

    add(heading, BorderLayout.NORTH);
    add(content, BorderLayout.CENTER);
  }

  public void initial() {

    setTitle("Languages");

    setSize(500, 500);

    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    setVisible(true);

    setBackground(Color.BLACK);

    JPanel heading_container = new JPanel();
    JPanel content_container_left = new JPanel();
    // JPanel content_container_right = new JPanel();
    JPanel back_container = new JPanel();
    JLabel title = new JLabel("SELECT LANGUAGE");

    JButton language1 = new JButton("ENGLISH");
    JButton language2 = new JButton("ENGLISH");
    JButton language3 = new JButton("ENGLISH");
    JButton language4 = new JButton("ENGLISH");
    JButton language5 = new JButton("ENGLISH");
    JButton language6 = new JButton("ENGLISH");
    {
      title.setForeground(Color.YELLOW);
      title.setFont(new Font("Italic", Font.BOLD, 38));
      title.setBorder(new EmptyBorder(30, 0, 30, 0));
    }

    {
      language1.setFont(new Font("Lucida", Font.BOLD, 18));

      language1.addActionListener(e -> {
        Login frame2;
        try {
          frame2 = new Login();
          frame2.setVisible(true);
          dispose();
        } catch (IOException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }

      });

      language2.setFont(new Font("Lucida", Font.BOLD, 18));

      language3.setFont(new Font("Lucida", Font.BOLD, 18));

    }
    {
      content_container_left.setLayout(new GridLayout(3, 1, 100, 100));
      content_container_left.setSize(500, 500);
      content_container_left.setBackground(Color.GREEN);
      content_container_left.add(language1);
      content_container_left.add(language2);
      content_container_left.add(language3);

    }
    // {

    // content_container_right.setLayout(new GridLayout(3, 1, 30, 30));
    // content_container_right.setBackground(Color.GREEN);
    // content_container_right.setSize(500, 500);
    // content_container_right.add(language4);
    // content_container_right.add(language5);
    // content_container_right.add(language6);
    // }

    {
      heading_container.setBackground(Color.BLACK);
      heading_container.add(title);
    }

    add(heading_container, BorderLayout.NORTH);

    add(content_container_left, BorderLayout.WEST);

    // add(content_container_right, BorderLayout.EAST);

    add(back_container, BorderLayout.SOUTH);
  }

  public void setButtonSize(JButton button, int width, int height) {
    Dimension bDim = new Dimension(width, height);
    button.setPreferredSize(bDim);
    button.setMaximumSize(bDim);
  }

}
