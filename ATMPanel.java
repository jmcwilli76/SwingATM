/*
  Name:  Jesse McWilliams / Rena Rios / Alejandro
  Prog:  Program 3 – Swing ATM
  Date:  2015-05-05
*/
/*
  
*/
//  Import the modules we need.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//  Declare our class
public class ATMPanel extends JPanel
{
  public ATMPanel()
  {  //  This is our constructor.
    ButtonListener listener = new ButtonListener();  //  Create our listener.  This will get passed to the panel classes.
	JPanel instructionPanel = new instPanel(listener);  //  Call the method to create the instruction panel.
	JPanel displayPanel = new dispPanel(listener);  //  Call the class to create the display panel.
	JPanel keypadPanel = new keyPanel(listener);  //  Call the class to create the key pad.
	add(keypadPanel);  //  Add the panel to the frame.
	JPanel buttonPanel = new buttPanel(listener);  //  Call the class to create the button panel.
	add(buttonPanel);  //  Add the panel to the frame.
  }

  
  //  ****************************************  Testing  *************************************************
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
  
  //  ****************************************  Testing  *************************************************
  
  
  //  This is the button listener where all of the action will be performed.
  private class ButtonListener implements ActionListener
  {
     public void actionPerformed(ActionEvent event)
     {
	    //  This is where the logic goes.  ******************************************************************
     }
  }

  //  Instruction Panel
  private class instPanel extends JPanel
  {
    public instPanel(ButtonListener listener)
	{
	  
	}
  }

  //  Display Panel
  private class dispPanel extends JPanel
  {
    public dispPanel(ButtonListener listener)
	{
	  
	}
  }

  //  Key Pad Panel
  private class keyPanel extends JPanel
  {
    public keyPanel(ButtonListener listener)
	{
	  JPanel pnlbRight= new JPanel(new GridLayout(4,4,5,5));
	  pnlbRight.setBackground(Color.WHITE);
	  pnlbRight.setLayout(new GridLayout(4,4,5,5));
	  //  Create the buttons.
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
	  //  Add the buttons.
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
	  //  Add the listener.
	  b1.addActionListener(listener);
	  b2.addActionListener(listener);
	  b3.addActionListener(listener);
	  b4.addActionListener(listener);
	  b5.addActionListener(listener);
	  b6.addActionListener(listener);
	  b7.addActionListener(listener);
	  b8.addActionListener(listener);
	  b9.addActionListener(listener);
	  b0.addActionListener(listener);
	  clear.addActionListener(listener);
	  enter.addActionListener(listener);
	}

	}  //  Button Panel
  private class buttPanel extends JPanel
  {
    public buttPanel(ButtonListener listener)
	{
	  JPanel pnlbLeft = new JPanel();
	  //  Create the buttons
	  JButton withdraw1 = new JButton("$10 Withdraw");
	  JButton withdraw2 = new JButton("$20 Withdraw");
	  JButton withdraw3 = new JButton("$40 Withdraw");
	  JButton deposit = new JButton("Deposit");
	  //  Add the buttons
	  pnlbLeft.add(withdraw1);
	  pnlbLeft.add(withdraw2);
	  pnlbLeft.add(withdraw3);
	  pnlbLeft.add(deposit);
	  //  Add the listenre
	  withdraw1.addActionListener(listener);
	  withdraw2.addActionListener(listener);
	  withdraw3.addActionListener(listener);
	  deposit.addActionListener(listener);

	}
  }
}