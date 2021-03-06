//------------------------------------------------------------
// Rena Rios Program 3 ATM Java GUI Panel
//-------------------------------------------------------------
//****Need info on what needs to be deleted so the frame can
//****run this panel. The program won't run.... :(
//
//-------------------------------------------------------------

import java.awt.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import javax.swing.JFrame;
import java.util.Scanner;


//----------------------------------------------------------------
// This is the start of the ATM Display
//
//----------------------------------------------------------------
//***Is this where I should add the logic for the buttons?
//----------------------------------------------------------------
public ATMPanel2()
	{
		JLabel label = new JLabel(mystring);//best way I could think of showing the information on the screen.
		JLabel label2 = new JLabel("INPUT DISPLAY AREA");
        String mystring = "INSTRUCTIONS AREA/n Please enter your PIN on the numeric keypad or/n Then select one of the options below/n Which function would you like to use?";

        JFrame frame = new JFrame();
		frame.setSize(new Dimension(400,250));
	    frame.setResizable(false);        //set all frames to false, so they can't resize.
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new FlowLayout());

	    buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setLayout(new FlowLayout());

        frame.setLayout(new GridLayout(2,1));
        label.setPreferredSize(new Dimension(400,250));
        label2.setPreferredSize(new Dimension(400,50));
        label.setBackground(Color.WHITE);
        frame.add(label);
        frame.setVisible(true);

		}

	}


//------------------------------------------------------------------
// This is the start of the ATM Functions Class
//------------------------------------------------------------------

public class ATMPanel
{
   //-----------------------------------------------------------------
   //  Creates and displays the main program frame.
   //-----------------------------------------------------------------
   public ATMPanel()
   {
      JPanel pnlbLeft = new JPanel();
      JFrame frame = new JFrame();
      frame.setSize(new Dimension(300,60));
      frame.setResizable(false);
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
      { new ATMPanel();

   }
}

//---------------------------------------------------------------
// This is the start of the ATM Keypad Class
//---------------------------------------------------------------

public class ATMKeyPad
{
   //-----------------------------------------------------------------
   //  Creates and displays the main program frame.
   //-----------------------------------------------------------------
   public ATMKeyPad()
   {
      JPanel pnlbRight= new JPanel(new GridLayout(4,4,5,5));
      JFrame frame = new JFrame();
      frame.setSize(new Dimension(300,300));
      frame.setResizable(false);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new GridLayout(2,2));

      passwordField = new JPasswordField
      passwordField.setFont(new Font("MS San Serif", Font.BOLD, 30));
      displayPanel.add(passwordField, BorderLayout.North)

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

      ///got password code from Unit5-ATM Part2/3 Youtube

      JButtons.addActionListener(new ActionListener())
      {
       public void actionPerformed(ActionEvent e())
        {
          passwordField.setText(e.getActionCommand());
          System.out.println(e.getActionCommand());
	    }
      });

      public static void main(String[] args)
      { new ATMKeyPad();
   }
