//********************************************************************
//  Rena Rios     ATM.Java for the Frame
//  Java Foundations
//
//  Operates the main ATM Functions
//********************************************************************

import javax.swing.JFrame;

public class ATM
{
   //-----------------------------------------------------------------
   //This is the final ATM Java that will get info from the Panel.
   //I'm not understanding how this will pull from the panel so 
   //at this point it's not running.
   //
   //Creates and displays the main program frame.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("ATM Program");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(400,600);
      frame.getContentPane().add(new ATMPanel());
      frame.setVisible(true);
   }
}
