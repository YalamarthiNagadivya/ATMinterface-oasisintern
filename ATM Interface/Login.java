
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class Login extends JFrame {

  JTextField name;
  JTextField password;

  public Login() throws IOException {
    Font font = new Font("Segoe print", Font.BOLD, 20);

    JLabel login_name = new JLabel("Login Name");
    login_name.setFont(font);

    name = new JTextField();
    name.setFont(font);

    JLabel password_label = new JLabel("Password");
    password_label.setFont(font);

    password = new JTextField();
    password.setFont(font);

    JPanel formPanel = new JPanel();
    formPanel.setLayout(new GridLayout(4, 1, 5, 5));
    formPanel.setOpaque(false);
    formPanel.add(login_name);
    formPanel.add(name);
    formPanel.add(password_label);
    formPanel.add(password);

    JButton ok = new JButton("OK");
    ok.setFont(font);
    ok.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent ae) {
        try {
          fileToArray();
          Interface frame2 = new Interface();
          frame2.setVisible(true);
          dispose();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }

      }
    });

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(1, 1, 5, 5));
    buttonPanel.setOpaque(false);
    buttonPanel.add(ok);

    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    mainPanel.setBackground(new Color(128, 128, 255));
    mainPanel.setBorder(BorderFactory.createEmptyBorder(80, 80, 80, 80));
    mainPanel.add(formPanel, BorderLayout.NORTH);
    mainPanel.add(buttonPanel, BorderLayout.SOUTH);

    add(mainPanel);

    setTitle("Login Form");
    setSize(500, 500);
    setVisible(true);
    setLocationRelativeTo(null);
    setMinimumSize(new Dimension(300, 400));
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

  }

  public void fileToArray() throws IOException {

    String username = name.getText();
    String passField = password.getText();

    FileReader fr = new FileReader("Data.txt");
    Scanner scan = new Scanner(fr);
    scan.useDelimiter("[#\n]");

    while (scan.hasNext()) {
      String un = scan.next();
      String pw = scan.next();

      if (username.equals(un.trim()) && passField.equals(pw.trim())) {
        scan.close();
        // System.out.println("Welcome");

      }
    }
  }
}
