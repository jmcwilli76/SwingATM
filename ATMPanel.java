/*
  Name:  Jesse / Rena / Alejandro
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
  public JLabel lblInstruction, lblDisplay;
  public JPanel buttonPanel, keypadPanel;
  private boolean boolPinEntered = false;
  private String strInputText = "";
  //  The JLabel allows HTML code.  So we use it to give a nicer looking text message.
  private String strWelcomeMessage = "<html><center>Welcome<br>To Team #2's<br>Swing ATM program!<br>Written by:<br>Jesse<br>Rena<br>and<br>Alejandro<br><br>Please enter your pin number<br><br>Please use the on screen keypad.</center>";
  private String strDisplayText = "";
  public ATMPanel()
  {  //  This is our constructor.
    //  Add the instruction area.
	lblInstruction = new JLabel(strWelcomeMessage);
	lblInstruction.setVerticalTextPosition(JLabel.CENTER);
	lblInstruction.setHorizontalTextPosition(JLabel.CENTER);
	lblInstruction.setHorizontalAlignment(JLabel.CENTER);
	lblInstruction.setBackground(Color.white);
	lblInstruction.setOpaque(true);
	lblInstruction.setPreferredSize(new Dimension(350, 200));
	add(lblInstruction);
	//  Add the display area.
	lblDisplay = new JLabel(strDisplayText);
	lblDisplay.setVerticalTextPosition(JLabel.CENTER);
	lblDisplay.setHorizontalTextPosition(JLabel.CENTER);
	lblDisplay.setHorizontalAlignment(JLabel.CENTER);
	lblDisplay.setBackground(Color.gray);
	lblDisplay.setOpaque(true);
	lblDisplay.setPreferredSize(new Dimension(350, 60));
	add(lblDisplay);
	//  Create the listener
    ButtonListener listener = new ButtonListener();  //  Create our listener.  This will get passed to the panel classes.
	//  Add the Function buttons panel
	buttonPanel = new buttPanel(listener);  //  Call the class to create the button panel.
	add(buttonPanel);  //  Add the panel to the frame.
	//  Add the keypad buttons panel
	keypadPanel = new keyPanel(listener);  //  Call the class to create the key pad.
	add(keypadPanel);  //  Add the panel to the frame.
  }

  
  //  ****************************************  Testing  *************************************************
	public static void main(String[] args)
	{
	  String strProgramTitle = "Program 3 - ATM";
	  JFrame frame = new JFrame(strProgramTitle);  //  Create the initial frame and set the label.
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //  Set the default close operation.
	  ATMPanel panel = new ATMPanel();  //  Create an object from our ATMPanel.
	  frame.getContentPane().add(panel);  //  Add the newly created panel to the Frame.
      frame.pack();  //  This uses the layout manager to calculate the minimum size.
	  frame.setSize(new Dimension(400,450));  //  This over rides the layout managers min size.  Needs to be after pack.
	  frame.setResizable(false);  //  Stops the window from being resized.
	  frame.setVisible(true);  //  Set the window to visible.
	}
  
  //  ****************************************  Testing  *************************************************
  
  //  **********************************************************************************************
  //  **********  This is the button listener where all of the action will be performed.  **********
  private class ButtonListener implements ActionListener
  {
     public void actionPerformed(ActionEvent event)
     {  //  strInputText
	    String strButtonPressed = ((JButton) event.getSource()).getText().trim();
		if (strButtonPressed == "Quit")
		{  //  The user has clicked the Quit button.  Re initialize.
		  
		}
		if (boolPinEntered && strButtonPressed == "1st Withdraw")
		{  //  Only check the button if the PIN has been entered.
		  
		}
		else if (boolPinEntered && strButtonPressed == "2nd Withdraw")
		{  //  Only check the button if the PIN has been entered.
		  
		}
		else if (boolPinEntered && strButtonPressed == "3rd Withdraw")
		{  //  Only check the button if the PIN has been entered.
		  
		}
		else if (boolPinEntered && strButtonPressed == "Deposit")
		{  //  Only check the button if the PIN has been entered.
		  
		}
		else if (strButtonPressed == "Clear")
		{  //  Clear the contents of the input string.
		  strInputText = "";
		}
		else if (strButtonPressed == "Enter")
		{  //  Submit the input string to the next function.
		  
		}
		else
		{  //  Append to the input string.
		  strInputText = strInputText + strButtonPressed;
		}
	    displayText(strInputText);
     }
	 public void verifyPIN(Account currentAccount, String PIN)
	 {  //  This method will verify the PIN number with the account.
	   int intPIN = Integer.parseInt(PIN);
	   if (currentAccount.getAccountPIN() == intPIN)
	   {
	     boolPinEntered = true;
		 buttonPanel.enableButtons();
	   }
	   else
	   {
	     boolPinEntered = false;
		 buttonPanel.disableButtons();
	   }
	 }
	 public void displayText(String InputText)
	 {  //  This method will update the text to be displayed.
	   if (boolPinEntered)
	   {
	     lblDisplay.setText(InputText);
	   }
	   else
	   {
	     lblDisplay.setText(InputText);
	   }
	 }
  }
  //  **********  This is the button listener where all of the action will be performed.  **********
  //  **********************************************************************************************
  //  Validate PIN
  

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
    private JButton withdraw1, withdraw2, withdraw3, deposit;
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
	  //  Disable the buttons by default
	  //withdraw1.setEnabled(false);
	  //withdraw2.setEnabled(false);
	  //withdraw3.setEnabled(false);
	  //deposit.setEnabled(false);
	  //  Set default size of panel
	  pnlbLeft.revalidate();
	  //pnlbLeft.setSize(new Dimension(xCord,5 * yCord));
	  //  Add this panel to the calling panel
	  add(pnlbLeft);
	}
	public void enableButtons()
	{  //  Allow all the buttons to be disabled.
	  withdraw1.setEnabled(true);
	  withdraw2.setEnabled(true);
	  withdraw3.setEnabled(true);
	  deposit.setEnabled(true);
	}
	public void disableButtons()
	{  //  Allow all the buttons to be enabled.
	  withdraw1.setEnabled(false);
	  withdraw2.setEnabled(false);
	  withdraw3.setEnabled(false);
	  deposit.setEnabled(false);
	}
	public void disableWithdrawl()
	{  //  Disable all of the Withdraw buttons.
	  withdraw1.setEnabled(false);
	  withdraw2.setEnabled(false);
	  withdraw3.setEnabled(false);
	}
  }
}