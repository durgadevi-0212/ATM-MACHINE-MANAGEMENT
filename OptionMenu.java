import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;
public class OptionMenu extends Account
{
Scanner menuIp=new Scanner(System.in);
DecimalFormat money=new DecimalFormat("'$'###,##0.00");
HashMap<Integer,Integer> data=new HashMap<>();
/* validating the login info*/
public void getLogin() throws IOException
{
int x=1;
do
{
try
{
data.put(1234567,8900);
data.put(4567890,8990);
System.out.println("---->WELCOME TO ATM PROJECT!<----");
System.out.println("Enter Your Customer Number: ");
setCustomerNumber(menuIp.nextInt());
System.out.println("Enter Your Pin Number: ");
setPinNumber(menuIp.nextInt());
}
catch(Exception e)
{
System.out.println("\n"+"Invalid Characters.only Numbers."+"\n");
x=2;
} 
for(Entry<Integer,Integer> entry:data.entrySet())
{
if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber())
{
getAccountType();
}
}
System.out.println("\n"+"Wrong Customer Number or PinNumber."+"\n");
}while(x==1);
}
/*display account type*/
public void getAccountType()
{
System.out.println("Select the Account you want to access: ");
System.out.println("Type1-->Checking Account");
System.out.println("Type2-->Saving Account");
System.out.println("Type3-->Exit");
System.out.println("Choice: ");
selection =menuIp.nextInt();
switch(selection)
{
case 1:
      getChecking();
      break;
case 2:
      getSaving();
      break;
case 3:
      System.out.println("Thank You for using this ATM,bye. ");
      break;
default:
      System.out.println("\n"+"Invalid Choice."+"\n");
      getAccountType();
}
}

/*Display Checking Acoount menu*/
public void getChecking()
{
System.out.println("Checking Account: ");
System.out.println("Type1-->View Balance");
System.out.println("Type2-->Withdraw Funds");
System.out.println("Type3-->Deposit Funds");
System.out.println("Type4-->Exit");
System.out.println("Choice: ");
selection =menuIp.nextInt();
switch(selection)
{
case 1:     
       System.out.println("Checking Account Balance: "+moneyFormat.format(getCheckingBalance()));
       getAccountType();
       break;
case 2:
      getCheckingWithdrawInput();
      getAccountType();
      break;
case 3:
      getCheckingDepositInput();
      getAccountType();
      break;
case 4:
     System.out.println("Thank You for using this ATM,bye. ");
      break;
default:
      System.out.println("\n"+"Invalid Choice."+"\n");
      getChecking();
}
} 
/* Savings*/
public void getSaving()
{
System.out.println("Saving Account: ");
System.out.println("Type1-->View Balance");
System.out.println("Type2-->Withdraw Funds");
System.out.println("Type3-->Deposit Funds");
System.out.println("Type4-->Exit");
System.out.println("Choice: ");
selection =menuIp.nextInt();
switch(selection)
{
case 1:     
       System.out.println("Saving Account Balance: "+moneyFormat.format(getSavingBalance()));
       getAccountType();
       break;
case 2:
      getSavingWithdrawInput();
      getAccountType();
      break;
case 3:
      getSavingDepositInput();
      getAccountType();
      break;
case 4:
     System.out.println("Thank You for using this ATM,bye. ");
      break;
default:
      System.out.println("\n"+"Invalid Choice."+"\n");
      getSaving();
}
}
int selection;
}



 


















