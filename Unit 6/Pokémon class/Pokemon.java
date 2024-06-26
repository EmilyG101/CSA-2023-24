public class Pokemon{
  private int health;
  private String name;
  private int attackPower;
  private String element;




  public Pokemon(int h, String n, int a, String e){
    health = h;
    name = n;
    attackPower = a;
    element = e;
  }
  public void newName(String name){
    this.name = name;
  }
  public void totalHealth(int health){
    this.health = health;
  }
  public void totalAP(int attackPower){
    this.attackPower = attackPower;
  }
  public void element(String element){
    this.element = element;
  }
  public void pokemon(){
    System.out.println("Pokemon name: " + name);
    System.out.println("Pokemon health: " + health);
    System.out.println("Pokemon attack power: " + attackPower);
    System.out.println("Pokemon element: " + element);
    
  }



  

}
