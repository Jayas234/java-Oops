/*Account Details
bookmark_border
subject Codingcasino 100 points
DESCRIPTION
Problem Statement - Account Details
Complete the class Account and AccountDetails as per the below requirement

class Account :

Create the following instance/static members:

accountNo : int
balance : double
accountType : String
counter :int static
Define parameterized constructor with two parameters to initialize balance and accountType. accountNo should be initialized by incrementing counter.

Implement the below operations:
void depositAmount(double amount)
To add amount to account balance
void printAccountDetails()
To display account details as per format given in Example Section
class AccountDetails :

Create main method and follow the below instructions.
Accept balance, account type and amount as input for two account objects from Console(Refer Example section for input format)
create first object using the input data and display account details
Deposit amount using the input data and display the new account balance
create second account object using the input data and display account details.
Set account balance to new balance using input data and display the new account balance
Example
Sample Input:
100.5 Savings 25.5				// balance type amount for first account
200 Current 50.5				// balance type amount for second account

Expected Output:
[Acct No : 1, Type : Savings, Balance : 100.5]
New Balance : 126.0
[Acct No : 2, Type : Current, Balance : 200.0]
New Balance : 50.5
Sample Input:
0 Current 100
0 Current 50

Expected Output:
[Acct No : 1, Type : Current, Balance : 0.0]
New Balance : 100.0
[Acct No : 2, Type : Current, Balance : 0.0]
New Balance : 50.0
Instructions
Do not change the provided class/method names unless instructed
Ensure your code compiles without any errors/warning/deprecations
Follow best practices while coding
Avoid too many & unnecessary usage of white spaces (newline, spaces, tabs, ...), except to make the code readable
Use appropriate comments at appropriate places in your exercise, to explain the logic, rational, solutions, so that evaluator can know them
Try to retain the original code given in the exercise, to avoid any issues in compiling & running your programs
Always test the program thoroughly, before saving/submitting exercises/project
For any issues with your exercise, contact your coach
Warnings
Take care of whitespace/trailing whitespace
Trim the output and avoid special characters
Avoid printing unnecessary values other than expected/asked output


EXECUTION TIME LIMIT
10 seconds   */


import java.util.*;

class Account {
   int accountNo;
   double balance;
   String accountType;
   static int counter;

   Account(double balance, String accountType) {
      counter++;
      this.accountNo = counter;
      this.balance = balance;
      this.accountType = accountType;
   }

   void depositAmount(double amount) {
      this.balance += amount;
   }

   void printAccountDetails() {
      System.out.println(
            "[Acct No : " + this.accountNo + ", Type : " + this.accountType + ", Balance : " + this.balance + "]");
   }
}


class AccountDetails {
   public static void run() {
      Scanner scanner = new Scanner(System.in);
      String first[] = scanner.nextLine().split(" ");
      String second[] = scanner.nextLine().split(" ");
      Account f = new Account(Double.parseDouble(first[0]), first[1]);
      f.depositAmount(Double.parseDouble(first[2]));
      f.printAccountDetails();
      Account ff = new Account(Double.parseDouble(second[0]), second[1]);
      ff.depositAmount(Double.parseDouble(second[2]));
      ff.printAccountDetails();
      scanner.close();
   }
}

class Source {
   public static void main(String args[]) {
      AccountDetails.run();
   }
}
