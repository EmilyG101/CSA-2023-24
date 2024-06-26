public class Main {
  public static void main(String[] args) {
    MetroCard c1 = new MetroCard("Ebby",139.67, "230973372", "1/17/2030");
    System.out.println(c1.getCardHolderName());
    System.out.println(c1.getBalance());
    System.out.println(c1.addFunds(20));
    c1.useCard();
    System.out.println(c1.toString());
  }
}
