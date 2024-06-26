class Main {
  public static void main(String[] args) {
    // use the link below to access the specifications
    // https://books.trinket.io/thinkjava2/chapter11.html
    System.out.print("Exercise 4 from Think Java Chapter 11: ");
    System.out.println("Rational Number");
    RationalNumber f1 = new RationalNumber(1,4);
    f1.printRational();
    f1.negate();
    f1.invert();
    System.out.println("Your fraction as a decimal is: " + f1.toDouble());
    System.out.println("your reduced fraction is: "+f1.reduceOriginalFrcation());
    f1.add(2,4);

    // show that each method you developed works below:
  }
}
