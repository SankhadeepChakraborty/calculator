package GUI;

import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.*;


import javax.swing.*;

import Constant.Commonconstant;

public class Calcu extends From {

  JTextField textfield;
  JButton[] numberButtons = new JButton[10];
  JButton[] functionButtons = new JButton[8];
  Font myFont = new Font("Ink Free",Font.BOLD,30);
  double num1 =0,num2 =0,result =0;
  char operator;
  
    public Calcu(){
        super("CALCULATOR");
        addGuiComponent();
    }

   public void addGuiComponent() {
    
    JLabel t = new JLabel("CALCULATOR") ;
    t.setBounds(350,30,650,50);
    t.setForeground(Commonconstant.Textcolor);
    t.setFont(new Font("Dialog",Font.BOLD,40));
    t.setHorizontalAlignment(SwingConstants.CENTER);

    JTextField tf =new JTextField();
    tf.setBounds(400,150,600,80); 
    tf.setBackground(Commonconstant.Secondarycolor);
    tf.setForeground(Commonconstant.Textcolor);
    tf.setFont(new Font("Dialog",Font.BOLD,25));

    //ON/OFF BUTTON
    JButton jb = new JButton("ON/OFF");
    jb.setBounds(400,250,150,50);
    jb.setBackground(Commonconstant.Button);
    
    //Number switch

    JButton jb1 = new JButton("1");
    jb1.setBounds(400,310,100,50);
    jb1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    numberButtons[0]=jb1;
     
    JButton jb2 = new JButton("2");
    jb2.setBounds(510,310,100,50);
    jb2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    numberButtons[1]=jb2;
     
    JButton jb3 = new JButton("3");
    jb3.setBounds(620,310,100,50);
    jb3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    numberButtons[2]=jb3;
    
    JButton jb4 = new JButton("4");
    jb4.setBounds(730,310,100,50);
    jb4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    numberButtons[3]=jb4;

    JButton jb5 = new JButton("5");
    jb5.setBounds(400,370,100,50);
    jb5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    numberButtons[4]=jb5;
   
    JButton jb6 = new JButton("6");
    jb6.setBounds(510,370,100,50);
    jb6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    numberButtons[5]=jb6;
     
    JButton jb7 = new JButton("7");
    jb7.setBounds(620,370,100,50);
    jb7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    numberButtons[6]=jb7;
     
    JButton jb8 = new JButton("8");
    jb8.setBounds(730,370,100,50);
    jb8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    numberButtons[7]=jb8;
    
    JButton jb9 = new JButton("9");
    jb9.setBounds(400,430,100,50);
    jb9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    numberButtons[8]=jb9;     

    JButton jb10 = new JButton("0");
    jb10.setBounds(520,430,200,50);
    jb10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    numberButtons[9]=jb10;
    
    for(int i=0;i<10;i++){
        
        numberButtons[i].setFont(myFont);
        numberButtons[i].setFocusable(false);

    }
   
    //Symbol button

    JButton sb1 = new JButton("+");
    sb1.setBounds(840,310,150,50);
    sb1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    functionButtons[0]=sb1;

     JButton sb2 = new JButton("-");
    sb2.setBounds(840,370,150,50);
    sb2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    functionButtons[1]=sb2;

    JButton sb3 = new JButton("*");
    sb3.setBounds(730,430,100,50);
    sb3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    functionButtons[2]=sb3;

    JButton sb4 = new JButton("/");
    sb4.setBounds(840,430,150,50);
    sb4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    functionButtons[3]=sb4;

    JButton sb5 = new JButton("=");
    sb5.setBounds(850,250,140,50);
    sb5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    functionButtons[4]=sb5;

    

    // Work buttons

   for(int i=0;i<10;i++){
    numberButtons[i] = new JButton(String.valueOf(i));
   

   }



         


     add(t);
    add(tf);
    add(jb);
    add(jb1);
    add(jb2);
    add(jb3);
    add(jb4);
    add(jb5);
    add(jb6);
    add(jb7);
    add(jb8);
    add(jb9);
    add(jb10);
    add(sb1);
    add(sb2);
    add(sb3);
    add(sb4);
    add(sb5);
    }





}
   

