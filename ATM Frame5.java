//********************************************************************
//  Rena Rios     Minilab 8 Buttons
//  Java Foundations
//
//  Demonstrates the use of one listener for multiple buttons.
//********************************************************************
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class ATM
{
   //-----------------------------------------------------------------
   //  Creates and displays the main program frame.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Minilab 8 - Buttons");
      frame.setSize(new Dimension(600,400));
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	  frame.getContentPane().add(new ATMPanel4());

      frame.setVisible(true);
      ATMPanel4 panel = new ATMPanel4();
      frame.pack();
   }
}
