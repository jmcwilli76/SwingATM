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
      JFrame frame = new JFrame("Program 3 - ATM");
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  ATMPanel5 panel = new ATMPanel5();
	  frame.add(panel);

      
      
      frame.pack();
	  frame.setSize(new Dimension(800,600));
	  frame.setVisible(true);
   }
}
