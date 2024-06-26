public class RationalNumber {
  // instance variables
  private int numerator;
  private int denominator;
  


  // constructor(s)
  public RationalNumber(){
    this.numerator = 0;
    this.denominator = 1;
  }
  public RationalNumber(int n, int d){
    numerator = n;
    denominator = d;
  }

  // other methods
  public void printRational(){
    String fraction = numerator + "/" + denominator;
    System.out.println("Your rational number is: " + fraction);
    
  }
  public void negate(){
    String num = "";
    num += numerator;
    if(num.substring(0,1).equals("-")){
      String fraction = num.substring(1) + "/" + denominator;
      System.out.println("Your negated rational number is: " + fraction);
    }else{
      String fraction = numerator + "/" + denominator;
      System.out.println("Your negated rational number is -" + fraction);
    }
  }
  public void invert(){
    String num = "";
    num += numerator;
    if(num.substring(0,1).equals("-")){
      String fraction = "-" + denominator +"/"+ num.substring(1);
      System.out.println("Your inverted rational number is: " + fraction);
    }else{
      String fraction = denominator + "/" + numerator;
      System.out.println("Your inverted rational number is: " + fraction);
    }
  }
  public double toDouble(){
    double rationalNum = (double)numerator/denominator;
    return rationalNum;
  }
  public String reduceNewFrcation(double numerator, double denominator){
    double n = numerator;
    double d = denominator;
    double temp = 0.0;
    while(d != 0){
      temp = d;
      d = n % d;
      n = temp;
    }
    numerator /= n;
    denominator /= n;
    int convertNum = (int) numerator;
    int convertDen = (int) denominator;
    String fraction = convertNum + "/" + convertDen;
    return fraction;
  }
  public void add(int num, int den){
    String newFraction = "";
    double addDecimal = (double)num/den;
    double oldDecimal = (double)numerator/denominator;
    double total = addDecimal + oldDecimal;
    double newNum = (total)
    * 100;
    double newDeno = 100.0;
    newFraction += reduceNewFrcation(newNum, newDeno);
    System.out.println("Added together, your new fraction is: " + newFraction);
  }
  public String reduceOriginalFrcation(){
    double n = numerator;
    double d = denominator;
    double temp = 0.0;
    while(d != 0){
      temp = d;
      d = n % d;
      n = temp;
    }
    numerator /= n;
    denominator /= n;
    int convertNum = (int) numerator;
    int convertDen = (int) denominator;
    String fraction = convertNum + "/" + convertDen;
    return fraction;
  }
}
