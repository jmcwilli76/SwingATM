//********************************************************************
//  Rena Rios     Minilab 8 Buttons
//  Java Foundations
//
//  Demonstrates the use of one listener for multiple buttons.
//********************************************************************
import java.awt.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import javax.swing.JFrame;

public class ATMKeyPad
{
   //-----------------------------------------------------------------
   //  Creates and displays the main program frame.
   //-----------------------------------------------------------------
   public ATMKeyPad()
   {
      JPanel pnlbRight= new JPanel(new GridLayout(4,4,5,5));
      JFrame frame = new JFrame();
      frame.setSize(new Dimension(640,480));
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new GridLayout(2,2));

      pnlbRight.setBackground(Color.WHITE);

      pnlbRight.setLayout(new GridLayout(4,4,5,5));

      //pnlBottom.add(buttons);

      JButton b1 = new JButton("1");
      JButton b2 = new JButton("2");
      JButton b3 = new JButton("3");
      JButton b4 = new JButton("4");
      JButton b5 = new JButton("5");
      JButton b6 = new JButton("6");
      JButton b7 = new JButton("7");
      JButton b8 = new JButton("8");
      JButton b9 = new JButton("9");
      JButton b0 = new JButton("0");
      JButton clear = new JButton("Clear");
      JButton enter = new JButton("Enter");

      pnlbRight.add(b1);
      pnlbRight.add(b2);
      pnlbRight.add(b3);
      pnlbRight.add(b4);
      pnlbRight.add(b5);
      pnlbRight.add(b6);
      pnlbRight.add(b7);
      pnlbRight.add(b8);
      pnlbRight.add(b9);
      pnlbRight.add(b0);
      pnlbRight.add(clear);
      pnlbRight.add(enter);

      frame.add(pnlbRight);
      frame.setVisible(true);
  }
      private void addButtons(JPanel pnl, int amount)
      {
        for(int i=0; i<amount; i++)
        pnl.add(new JButton("Btn" +1));
	  }

      public static void main(String[] args)
      { new ATMKeyPad();
   }
}
