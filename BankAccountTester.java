public class BankAccountTester {

  public static void main(String[] args) {
    BankAccount ba1 = new BankAccount("MalteseFalcon", 7879);
    BankAccount ba2 = new BankAccount("Nairobi313phant", 4563);

//to test BankAccount code
    ba1.deposit(900);
    ba1.withdraw(400);
    ba1.withdraw(1000);

    ba2.deposit(90-80);
    ba2.withdraw(-3);

    System.out.println("Bank Account 1 has $" + ba1.getBalance());
    System.out.println("Bank Account 2 is account number" + ba2.getAccountID());
    System.out.println("(i): " + ba2.toString());
  }

}
