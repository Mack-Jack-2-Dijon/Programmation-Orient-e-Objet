public class Classroom {
  public static void main(String[] args) {
    Wilder first = new Wilder("Robert",false);
    Wilder second = new Wilder("Doe", true);

    System.out.println(first.getName());
    System.out.println(second.isAware());
    
    first.setName("John");

    System.out.println(first.getName());
    
    System.out.println(second.whoAmI());

    System.out.println(first.whoAmI());
    
  }
  
}