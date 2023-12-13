import java.io.IOException;

import javax.swing.SwingUtilities;

public class Main {

  public static void main(String[] args) {

    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        // Interface log = new Interface();
        // Interface action = new Interface();
        Language lan = new Language();
        // Deposit depo = new Deposit();
      }
    });

  }

}