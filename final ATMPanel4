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

public class ATMPanel4 extends JFrame
	{
	  private JPanel ATMKeyPadPanel, displayPanel, actionPanel;
	  private JButton [] numberButtons = new JButton[10];
	  private JButton enterButton, clearButton, zeroButton;
      private String input="";
      private JButton withdrawButton;// 2withdrawButton, 3withdrawButton, depositButton, quitButton;

      private JPasswordField passwordField;

        public ATMPanel4()
        {
			displayPanel = new JPanel();
			displayPanel.setBackground(Color.CYAN);
			displayPanel.setLayout(new BorderLayout());

            passwordField = new JPasswordField();
            passwordField.setFont(new Font("MS San Serif", Font.BOLD, 30));
            displayPanel.add(passwordField, BorderLayout.NORTH);

			actionPanel = new JPanel();
			actionPanel.setBackground(Color.GRAY);
			actionPanel.setLayout(new GridLayout(1,2));

            withdrawButton = new JButton("1st Withdraw");
            withdrawButton.addActionListener(new EnterListener());
            actionPanel.add(withdrawButton);

           // 2withdrawButton = new JButton("2nd Withdraw");
           // 2withdrawButton.addActionListener(new ActionListener()
           //    {
			//	 public void actionPerformed(ActionEvent e)
			//	   	   {
			//	 	     input+=e.getActionCommand();
			//	 		 passwordField.setText(input);
			//	 		 System.out.println(input);
	       //            }
			//   });
           // ATMKeyPadPanel.add(2withdrawButton);

           // 3withdrawButton = new JButton("3rd Withdraw");
           // 3withdrawButton.addActionListener(new EnterListener());
           // ATMKeyPadPanel.add(3withdrawButton);

           // depositButton = new JButton("Deposit");
           // depositButton.addActionListener(new ClearListener());
           // ATMKeyPadPanel.add(depositButton);

           // quitButton = new JButton("Quit");
           // quitButton.addActionListener(new ClearListener());
           // ATMKeyPadPanel.add(quitButton);

			ATMKeyPadPanel = new JPanel();
			ATMKeyPadPanel.setBackground(Color.GRAY);
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
		      if(Authentication.authenticatePIN(input))
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


