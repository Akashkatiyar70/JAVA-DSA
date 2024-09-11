public class simple_if {

  public static void main(String[] args) {
    int marks = 30;
    if (marks < 40) {
      System.out.println("more hard work is required");
      marks = marks + 5;
    }
    System.out.println("your marks are :" + marks);
  }
}
