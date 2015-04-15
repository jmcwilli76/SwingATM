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
	  JButton left = new JButton("Left");
      JButton center = new JButton("Center");

      buttonPanel.add(left);
      buttonPanel.add(center);
      buttonPanel.add(right);

      frame.add(buttonPanel);
      frame.setVisible(true);
   }

      private void addButtons(JPanel pnl, int amount)
      {
        for(int i=0; i<amount; i++)
        pnl.add(new JButton("Btn" +1));
	  }

      public static void main(String[] args)
      { new ATMDisplay();
   }
}

