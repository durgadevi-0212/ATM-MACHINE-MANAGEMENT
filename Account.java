import java.text.DecimalFormat;
import java.util.*;
public class Account
{
Scanner input=new Scanner(System.in);
DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
/*set customer Number*/
public int setCustomerNumber(int customerNumber)
{
this.customerNumber=customerNumber;
return  customerNumber;
}
/*get customernumber*/
public int getCustomerNumber()
{
return  customerNumber;
}
/*get set pinnumber*/
public int setPinNumber(int pinNumber)
{
this.pinNumber=pinNumber;
return pinNumber;
}
/* get pinnumber*/
public int getPinNumber()
{
return  pinNumber;
}
/*checking bal*/
public double getCheckingBalance()
{
return checkingBalance;
}
/*saving bal*/
public double getSavingBalance()
{
return savingBalance;
}
/*checking withdraw*/
public double calcCheckingWithdraw(double amount)
{
checkingBalance=(checkingBalance-amount);
return checkingBalance;
}
/*saving withdraw*/
public double calcSavingWithdraw(double amount)
{
savingBalance=(savingBalance-amount);
return savingBalance;
}
/*checking deposit*/
public double calcCheckingDeposit(double amount)
{
checkingBalance=(checkingBalance+amount);
return checkingBalance;
}
/*saving deposit*/
public double calcSavingDeposit(double amount)
{
savingBalance=(savingBalance+amount);
return savingBalance;
}
/*check withdram ip*/
public void getCheckingWithdrawInput()
{
System.out.println("Checking Account balance: "+moneyFormat.format(checkingBalance));
System.out.println("Account you want to withdram from checking account: ");
double amount=input.nextDouble();
if((checkingBalance-amount)>=0)
{
calcCheckingWithdraw(amount);
System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance));
}
else
{
System.out.println("Blancing Cannot be negative: "+"\n");
}
}
/*saving withdraw ip*/
public void getSavingWithdrawInput()
{
System.out.println("Saving Account balance: "+moneyFormat.format(savingBalance));
System.out.println("Account you want to withdram from saving account: ");
double amount=input.nextDouble();
if((savingBalance-amount)>=0)
{
calcSavingWithdraw(amount);
System.out.println("New Checking Account Balance: "+moneyFormat.format(savingBalance));
}
else
{
System.out.println("Blancing Cannot be negative: "+"\n");
}
}
/*check deposit ip*/
public void getCheckingDepositInput()
{
System.out.println("Checking Account balance: "+moneyFormat.format(checkingBalance));
System.out.println("Account you want to deposit from checking account: ");
double amount=input.nextDouble();
if((checkingBalance+amount)>=0)
{
calcCheckingDeposit(amount);
System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance));
}
else
{
System.out.println("Blancing Cannot be negative: "+"\n");
}
}
/*saving deposit ip*/
public void getSavingDepositInput()
{
System.out.println("Saving Account balance: "+moneyFormat.format(savingBalance));
System.out.println("Account you want to deposit from saving account: ");
double amount=input.nextDouble();
if((savingBalance+amount)>=0)
{
calcSavingDeposit(amount);
System.out.println("New Checking Account Balance: "+moneyFormat.format(savingBalance));
}
else
{
System.out.println("Blancing Cannot be negative: "+"\n");
}
}
 
private  int customerNumber;
private int pinNumber;
private double checkingBalance=0;
private double savingBalance=0;
}










