public class nested_if {

  public static void main(String[] args) {
    //     int marks = 70;
    //     if (marks <= 40) System.out.println("you could not clear the test"); else {
    //       System.out.println("you clear the test");
    //       if (marks >= 70) System.out.println(
    //         "you clear the test with distenction"
    //       );
    //       if (marks >= 60) System.out.println("you clear the test first class");
    //       if (marks >= 50) System.out.println(
    //         "you clear the test second class"
    //       ); else System.out.println("you clear the test third class");
    //     }
    //   }
    // }

    int marks = 33;
    if (marks >= 40) {
      System.out.println("you clear the test");
      //  else {
      //     System.out.println("you  not cleared the test");
      if (marks < 50) System.out.println("cleared with third class"); else if (
        marks < 60
      ) System.out.println("cleared with second class"); else if (
        marks < 70
      ) System.out.println("cleared with third class"); else System.out.println(
        " with distenction"
      );
    } else System.out.println("not clear the test");
  }
}
