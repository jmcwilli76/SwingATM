public class Account
{


private int accountNumber;
private int accountPIN;
private double accountBalance;
private double maxWithdrawal = 100;
private double maxDeposit = 500;
private String primaryFirstName;
private String primaryLastName;
private String primaryPrefix;
private String primaryDisplay;

public Account(int acctNumber, int acctPIN, String FName, String LName)
{
	accountNumber = acctNumber;
	accountPIN = acctPIN;
	primaryFirstName = FName;
	primaryLastName = LName;
}
public void setaccountNumber(int acctNumber )
{
	accountNumber = acctNumber;
}
public void setaccountPin(int acctPIN)
{
	accountPIN = acctPIN;
}
public void setprimaryFirstName(String first)
{
	primaryFirstName = first;
}
public String getprimaryFirstName()
{
	return primaryFirstName;
}
public void setprimaryLastName(String last)
{
	primaryLastName = last;
}
public String getprimaryLastname()
{
	return primaryLastName;
}
public void setaccountBalance(double Balance)
{
	accountBalance = Balance;
}
public void setmaxWithdrawal(double MaxW)
{
	maxWithdrawal = MaxW;
}
public void setmaxDeposit(double MaxD)
{
	maxDeposit = MaxD;
}
public void setPrimaryPrefix(String Prefix)
{
	primaryPrefix = Prefix;
}
public void setPrimaryDisplay(String Display)
{
	primaryDisplay = Display;
}
public int getAccountPIN()
{
	return accountPIN;
}
public double getaccountBalance()
{
	return accountBalance;
}
public double getmaxWithdrawal()
{
	return maxWithdrawal;
}
public double getmaxDeposit()
{
	return maxDeposit;
}
public String getPrimaryFirstName()
{
	return primaryFirstName;
}
public String getPrimaryLastName()
{
	return primaryLastName;
}
public String getprimaryPrefix()
{
	return primaryPrefix;
}
public String getprimaryDisplay()
{
	return primaryDisplay;
}
public int getaccountNumber()
{
	return accountNumber;
}

public static void main(String[] args)
{


	//int acctNumber, int acctPIN, String FName,String LName
Account myaccount = new Account(1234, 7777, "First", "Last");
System.out.println(myaccount.getprimaryFirstName());
System.out.println(myaccount.getaccountNumber());
System.out.println(myaccount.getAccountPIN());
System.out.println(myaccount.getprimaryFirstName());
System.out.println(myaccount.getPrimaryLastName());
System.out.println(myaccount.getaccountBalance());
System.out.println(myaccount.getmaxWithdrawal());
System.out.println(myaccount.getmaxDeposit());
System.out.println(myaccount.getprimaryPrefix());
System.out.println(myaccount.getprimaryDisplay());

myaccount.setaccountNumber(4567);
myaccount.setaccountPin(3333);
myaccount.setprimaryFirstName("Fname");
myaccount.setprimaryLastName("Lname");
myaccount.setaccountBalance(200);
myaccount.setmaxWithdrawal(1000);
myaccount.setmaxDeposit(2000);
myaccount.setPrimaryPrefix("Mr.");
myaccount.setPrimaryDisplay("Disp");

System.out.println(myaccount.getprimaryFirstName());
System.out.println(myaccount.getaccountNumber());
System.out.println(myaccount.getAccountPIN());
System.out.println(myaccount.getprimaryFirstName());
System.out.println(myaccount.getPrimaryLastName());
System.out.println(myaccount.getaccountBalance());
System.out.println(myaccount.getmaxWithdrawal());
System.out.println(myaccount.getmaxDeposit());
System.out.println(myaccount.getprimaryPrefix());
System.out.println(myaccount.getprimaryDisplay());


}


}
