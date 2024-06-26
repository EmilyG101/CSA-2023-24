public class MetroCard {
    // Instance variables
    private String cardHolderName; // Name of the cardholder
    private double balance; // Current balance on the card
    private String cardNumber;
    private String expireDate;
  
    // TODO: Add any other relevant instance variables here (e.g., card number, expiration date)

    // Constructor
    // TODO: Complete the constructor to initialize the instance variables
    public MetroCard(String name, double money, String number, String date) {
        cardHolderName = name;
        balance = money;
        cardNumber = number;
        expireDate = date;
        // Initialize other instance variables as needed
    }

    // Getter methods
    // TODO: Create a getter method for each instance variable
    public String toString(){
      return "Name: " + cardHolderName + "\nbalance: " + balance + "\ncard number: " + cardNumber + "\nexpiration date: " + expireDate;
    }
    public String getCardHolderName() {
        return cardHolderName;
    }

    public double getBalance() {
        // Complete this method to return the card's balance
      return balance;
    }

    // TODO: Add getter methods for any other instance variables you added

    // Setter methods
    // TODO: Create a setter method for each instance variable that should be changeable after object creation
    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName; //makes instance varible equal to a varible with the same name, uses .this just in case u don't want to use a different variable.
    }

    // TODO: Complete this method to allow updating the card's balance
    public void setBalance(double balance) {
      this.balance = balance;
    }

    // TODO: Add setter methods for any other instance variables you added
    public void setCardNumber(String cardNumber){
      this.cardNumber = cardNumber;
    }

    public void setNewExpireDate(String expireDate){
      this.expireDate = expireDate;
    }

  
    // TODO: Add any other methods that might be relevant for a MetroCard (e.g., addFunds, useCard)
    public double addFunds(double funds){
      balance += funds;
      return balance;
    }
public void useCard() {
    if(balance > 2.9){
      balance -= 2.9;
      System.out.println("Go");
    }else{
      System.out.println("Your card has insufficient balance");
    }
  }
}

