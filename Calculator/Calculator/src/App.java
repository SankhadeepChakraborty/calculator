import javax.swing.SwingUtilities;

import GUI.Calcu;
import GUI.From;

public class App {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable(){
          public void run(){
            //instance of LoginformGUI
           new Calcu().setVisible(true);
           //new Registerformgui().setVisible(true);
          }  
        });
    }
}
