//********************************************************************
//  Rena Rios     Minilab 8 Buttons
//  Java Foundations
//
//  Demonstrates the use of one listener for multiple buttons.
//********************************************************************

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.util.Random;



public class ATMDisplay extends JPanel
{
	  public int startValue = 50;//initialzes the starting value @ 50
      public JLabel label = new JLabel("" + startValue);

     public ATMDisplay()
   {
       JPanel buttonPanel = new JPanel(new FlowLayout());
       JFrame frame = new JFrame("Minilab 8 - Buttons");
       frame.setSize(new Dimension(400,300));
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setLayout(new FlowLayout());

	   buttonPanel.setBackground(Color.WHITE);
       buttonPanel.setLayout(new FlowLayout());

      JButton right= new JButton("Right");
      right.addActionListener(new ButtonListener());
	  JButton left = new JButton("Left");
      left.addActionListener(new ButtonListener());
      JButton center = new JButton("Center");
      center.addActionListener(new ButtonListener());



      buttonPanel.add(left);
      buttonPanel.add(center);
      buttonPanel.add(right);

      frame.add(buttonPanel);
      frame.add(label);
      frame.setVisible(true);
   }


   private class ButtonListener implements ActionListener
   {
	   public void actionPerformed(ActionEvent event)
      {
        Object source = event.getSource();

        label.setText("Pushes");
       }
   }
      public static void main(String[] args)
      { new ATMDisplay();
   }
  }

