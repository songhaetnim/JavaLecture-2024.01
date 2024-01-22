package ch09_modifier.sec11_account;

public class Account {
   private int balance;
   public static final int MIN_BALANCE = 0;
   public static final int MAX_BALANCE = 1000000;
   
   public Account(int balance) {
      this.balance = balance;
   }

   public int getBalance() {
      return balance;
   }

   public void setBalance(int balance) {
      if (balance <= MIN_BALANCE || balance >= MAX_BALANCE)
         return;
      this.balance += balance;
//      if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
//         this.balance += balance;
   }
   
   
}


