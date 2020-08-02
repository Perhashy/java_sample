public class Sample8 {

  // private static void fizzbuzz(int num) {
  //   if (num % 15 == 0) {
  //     System.out.println("FizzBuzz");
  //   } else if (num % 5 == 0) {
  //     System.out.println("Buzz");
  //   } else if (num % 3 == 0) {
  //     System.out.println("Fizz");
  //   } else {
  //     System.out.println(num);
  //   }
  // }
  private static String fizzbuzz(int num) {
    if (num % 15 == 0) {
      return "FizzBuzz";
    } else if (num % 5 == 0) {
      return "Buzz";
    } else if (num % 3 == 0) {
      return "Fizz";
    } else {
      return Integer.toString(num);
    }
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 20; i++) {
      // fizzbuzz(i);
      System.out.println(fizzbuzz(i));
    }
  }
}