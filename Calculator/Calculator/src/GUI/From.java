package GUI;

import javax.swing.*;

import Constant.Commonconstant;

public class From extends JFrame{
    public From(String title){
        super(title);
        setSize(1500,1500);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Commonconstant.Primarycolor);

    }

    
}
