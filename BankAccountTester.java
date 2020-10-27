public class BankAccountTester {

  public static void main(String[] args) {
    BankAccount ba1 = new BankAccount(7879, "MalteseFalc0n");
    BankAccount ba2 = new BankAccount(4563, "Nairobi313phant");

//to test BankAccount code
    ba1.deposit(900.0);
    ba1.withdraw(400.0);
    ba1.withdraw(1000.0);

    ba2.deposit(90.0-80.0);
    ba2.withdraw(-3.0);
    ba2.setPassword("da5Kennwort");

    System.out.println("Bank Account 1 has $" + ba1.getBalance());
    System.out.println("Bank Account 2 is account number " + ba2.getAccountID());
    System.out.println(ba2.toString());
  }

}
