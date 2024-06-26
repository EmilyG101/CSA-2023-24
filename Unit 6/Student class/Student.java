import java.util.Arrays;
public class Student{
  //fields, instance variables
  private String name;
  private int osis;
  private int gradeLevel;
  private int[] array = new int[5];

  //constructor method
  public Student(String n, int o, int g, int[] a){
    name = n;
    osis = o;
    gradeLevel = g;
    array = a;
    }
  //other methods
  public void userInfo(){
    System.out.println("Name: " + name);
    System.out.println("osis number: " + osis);
    System.out.println("Your grade level: " + gradeLevel);
    System.out.println("Your grades: " + Arrays.toString(addScores(array)));
    System.out.println("The average of your grades are: " + average(addScores(array)));
  }
  public double average(int[] array){
    double average = 0.0;
    for(int i : array){
      average += i;
    }
    return average/array.length;
    
  }
  public int[] addScores(int[] array){
    int[] newArray = new int[6];
    int rand = (int)(Math.random()* 100);
    for(int i = 0; i< array.length; i++){
      newArray[i] = array[i];
    }
    
      newArray[newArray.length-1] = rand;
  
  return newArray;
  }

  
}
