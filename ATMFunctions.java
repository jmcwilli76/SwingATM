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

public class ATMFunctions
{
   //-----------------------------------------------------------------
   //  Creates and displays the main program frame.
   //-----------------------------------------------------------------
   public ATMFunctions()
   {
      JPanel pnlbLeft = new JPanel();
      JFrame frame = new JFrame();
      frame.setSize(new Dimension(150,300));
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new GridLayout(0,1));

      JLabel text = new JLabel("My Label");
      JButton test = new JButton("test");
      JButton withdraw2 = new JButton("2nd Withdraw");
      JButton withdraw3 = new JButton("3rd Withdraw");
      JButton deposit = new JButton("Deposit Button");
      JButton quit = new JButton("Quit");
      JButton withdraw1 = new JButton("1st Withdraw");

      //pnlbLeft.setBackground(Color.WHITE);

      pnlbLeft.add(withdraw1);
      pnlbLeft.add(withdraw2);
      pnlbLeft.add(withdraw3);
      pnlbLeft.add(deposit);
      pnlbLeft.add(quit);

      frame.add(pnlbLeft);
      frame.setVisible(true);
  }

      public static void main(String[] args)
      { new ATMFunctions();

   }
}
