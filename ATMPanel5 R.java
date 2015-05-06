//code from Unit5-ATM Part2/3

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;

public class ATMPanel5 extends JFrame
	{
	  private JPanel ATMKeyPadPanel, displayPanel, actionPanel, mainPanel;
	  private JButton[] numberButtons = new JButton[10];
	  private JButton enterButton, clearButton, zeroButton;
      private String input="";
      private JButton withdrawButton, withdrawButton2, withdrawButton3, depositButton, quitButton;
	  private boolean pinEntered = false;
      private JPasswordField passwordField;

    //public ATMPanel5()
    //{}
    public ATMPanel5()
        {
			displayPanel = new JPanel();
			displayPanel.setBackground(Color.CYAN);
			displayPanel.setLayout(new FlowLayout());
			displayPanel.setSize(new Dimension(400,250));


            passwordField = new JPasswordField();
            passwordField.setFont(new Font("MS San Serif", Font.BOLD, 30));
            displayPanel.add(passwordField, BorderLayout.NORTH);

			actionPanel = new JPanel();
			actionPanel.setBackground(Color.GRAY);
			actionPanel.setSize(new Dimension(300,60));
		//	actionPanel.setLayout(new BorderLayout);

            withdrawButton = new JButton("1st Withdraw");
            withdrawButton.addActionListener(new EnterListener());
            actionPanel.add(withdrawButton);

            displayPanel.add(actionPanel, BorderLayout.LINE_START);

            add(displayPanel);
            setVisible(true);
            displayPanel.setLayout(new BorderLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            withdrawButton2 = new JButton("2nd Withdraw");
            withdrawButton2.addActionListener(new ActionListener()
              {
				 public void actionPerformed(ActionEvent e)
				   	   {
				 	     input+=e.getActionCommand();
				 		 passwordField.setText(input);
				 		 System.out.println(input);
	                  }
		     });
            actionPanel.add(withdrawButton2);

            withdrawButton3 = new JButton("3rd Withdraw");
            withdrawButton3.addActionListener(new EnterListener());
            actionPanel.add(withdrawButton3);

            depositButton = new JButton("Deposit");
            depositButton.addActionListener(new ClearListener());
            actionPanel.add(depositButton);

            quitButton = new JButton("Quit");
            quitButton.addActionListener(new ClearListener());
            actionPanel.add(quitButton);

			ATMKeyPadPanel = new JPanel();
			ATMKeyPadPanel.setBackground(Color.GRAY);
			actionPanel.setSize(new Dimension(400,300));
			ATMKeyPadPanel.setLayout(new GridLayout(4,3));

            for(int i=0; i<9; i++)
            {
				numberButtons[i] = new JButton(String.valueOf(i+1));
				numberButtons[i].addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent e)
				{
				   input+=e.getActionCommand();
				   passwordField.setText(input);
				   System.out.println(input);
				}
					});
				ATMKeyPadPanel.add(numberButtons[i]);
			}

            clearButton = new JButton("Clear");
            clearButton.addActionListener(new ClearListener());
            ATMKeyPadPanel.add(clearButton);

            zeroButton = new JButton("0");
            zeroButton.addActionListener(new ActionListener()
               {
				 public void actionPerformed(ActionEvent e)
				   	   {
				 	     input+=e.getActionCommand();
				 		 passwordField.setText(input);
				 		 System.out.println(input);
	                   }
			   });
            ATMKeyPadPanel.add(zeroButton);

            enterButton = new JButton("\u21B5");
            enterButton.addActionListener(new EnterListener());
            ATMKeyPadPanel.add(enterButton);

            displayPanel.add(ATMKeyPadPanel, BorderLayout.CENTER);

            add(displayPanel);
            setVisible(true);
            pack();
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //private void addButtons(JPanel pnl, int amount)
			//  {
			//      for(int i=0; i<amount; i++)
			//      pnl.add(new JButton("Btn" +1));
	        //  }
			
			//  *******************************************************
			//  Create Main Panel mainPanel
			//  *******************************************************
			mainPanel = new JPanel();
			//mainPanel.setLayout(FlowLayout);
			mainPanel.setPreferredSize(new Dimension(600,600));
			mainPanel.setBackground(Color.black);
			//mainPanel.add();  //  User instruction
			mainPanel.add(displayPanel);
			//mainPanel.add(actionPanel);
			//mainPanel.add(ATMKeyPadPanel);
			mainPanel.setVisible(true);
		}
	  class ClearListener implements ActionListener
	  {
	   public void actionPerformed(ActionEvent e)
	    {
	      passwordField.setText("");
	      input="";
		}
    }

    class EnterListener implements ActionListener
		  {
		   public void actionPerformed(ActionEvent e)
		    {
		      if(pinEntered)
		      {
				  JOptionPane.showMessageDialog(null,"Welcome!");
			  }
			  else
			  {
			     JOptionPane.showMessageDialog(null,"Incorrect Password Please Try Again!");
			  }

			}
    }
}


