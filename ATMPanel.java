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
    //  Add the instruction area.
	JLabel lblInstruction = new JLabel("INSTRUCTIONS AREA e.g. Please Enter pin on the numberic keypad");
	lblInstruction.setVerticalTextPosition(JLabel.CENTER);
	lblInstruction.setHorizontalTextPosition(JLabel.CENTER);
	lblInstruction.setBackground(Color.white);
	lblInstruction.setOpaque(true);
	lblInstruction.setPreferredSize(new Dimension(350, 200));
	add(lblInstruction);
	//  Add the display area.
	JLabel lblDisplay = new JLabel("Display AREA e.g. Entered text shows up here.");
	lblDisplay.setVerticalTextPosition(JLabel.CENTER);
	lblDisplay.setHorizontalTextPosition(JLabel.CENTER);
	lblDisplay.setBackground(Color.gray);
	lblDisplay.setOpaque(true);
	lblDisplay.setPreferredSize(new Dimension(350, 60));
	add(lblDisplay);
	//  Create the listener
    ButtonListener listener = new ButtonListener();  //  Create our listener.  This will get passed to the panel classes.
	//  Add the Function buttons panel
	JPanel buttonPanel = new buttPanel(listener);  //  Call the class to create the button panel.
	add(buttonPanel);  //  Add the panel to the frame.
	//  Add the keypad buttons panel
	JPanel keypadPanel = new keyPanel(listener);  //  Call the class to create the key pad.
	add(keypadPanel);  //  Add the panel to the frame.
  }

  
  //  ****************************************  Testing  *************************************************
	public static void main(String[] args)
	{
	  JFrame frame = new JFrame("Program 3 - ATM");  //  Create the initial frame and set the label.
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //  Set the default close operation.
	  ATMPanel panel = new ATMPanel();  //  Create an object from our ATMPanel.
	  frame.getContentPane().add(panel);  //  Add the newly created panel to the Frame.
      frame.pack();  //  This uses the layout manager to calculate the minimum size.
	  frame.setSize(new Dimension(400,450));  //  This over rides the layout managers min size.  Needs to be after pack.
	  frame.setResizable(false);  //  Stops the window from being resized.
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
	  //  Add this panel to the calling panel
	  add(pnlbRight);
	}

	}  //  Button Panel
  private class buttPanel extends JPanel
  {
    public buttPanel(ButtonListener listener)
	{  //  Create the inner panel
	  JPanel pnlbLeft = new JPanel();
	  //  Set the layout manager
	  pnlbLeft.setLayout(new BoxLayout(pnlbLeft, BoxLayout.Y_AXIS));
	  //  Create the buttons
	  JButton withdraw1 = new JButton("1st Withdraw  ");
	  JButton withdraw2 = new JButton("2nd Withdraw ");
	  JButton withdraw3 = new JButton("3rd Withdraw  ");
	  JButton deposit = new JButton("      Deposit       ");
	  JButton quit = new JButton("          Quit          ");
	  //  Set the button size
	  int xCord = 150;
	  int yCord = 40;
	  //withdraw1.setPreferredSize(new Dimension(xCord, yCord));
	  //withdraw2.setPreferredSize(new Dimension(xCord, yCord));
	  //withdraw3.setPreferredSize(new Dimension(xCord, yCord));
	  //deposit.setPreferredSize(new Dimension(xCord, yCord));
	  //quit.setPreferredSize(new Dimension(xCord, yCord));
	  //  Add the buttons
	  pnlbLeft.add(withdraw1);
	  pnlbLeft.add(withdraw2);
	  pnlbLeft.add(withdraw3);
	  pnlbLeft.add(deposit);
	  pnlbLeft.add(quit);
	  //  Add the listenre
	  withdraw1.addActionListener(listener);
	  withdraw2.addActionListener(listener);
	  withdraw3.addActionListener(listener);
	  deposit.addActionListener(listener);
	  quit.addActionListener(listener);
	  //  Set default size of panel
	  pnlbLeft.revalidate();
	  //pnlbLeft.setSize(new Dimension(xCord,5 * yCord));
	  //  Add this panel to the calling panel
	  add(pnlbLeft);

	}
  }
}