/*
  Name:  Jesse McWilliams / Rena Rios / Alejandro
  Prog:  Program 3 – Swing ATM
  Date:  2015-05-05
*/
/*
  
*/

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
      JFrame frame = new JFrame("Program 3 - ATM");  //  Create the initial frame and set the label.
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //  Set the default close operation.
	  ATMPanel panel = new ATMPanel();  //  Create an object from our ATMPanel.
	  frame.getContentPane().add(panel);  //  Add the newly created panel to the Frame.
      frame.pack();  //  This uses the layout manager to calculate the minimum size.
	  frame.setSize(new Dimension(800,600));  //  This over rides the layout managers min size.  Needs to be after pack.
	  frame.setVisible(true);  //  Set the window to visible.
   }
}
