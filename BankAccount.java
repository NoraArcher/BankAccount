public class BankAccount {

  private double balance;
  private int accountID;
  private String password;

  public BankAccount (String p, int a) {
    password = p;
    accountID = a;
    balance = 0.0;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public boolean deposit(double amount) {
    if (amount > 0.0) {
      balance += amount;
      return true;
    }
    return false;
  }

  public boolean withdraw(double amount) {
    if ((amount > balance) || (amount < 0)) {
      return false;
    }
    balance =- amount;
    return true;
  }

    public String toString() {
      return ("" + accountID + "\t" + balance);
    }

}
