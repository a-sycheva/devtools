public class LiveCodingDemo {
  public static void main(String [] args) {
    findMax(new int[]{42});
  }

  static void printFizzBuzz(int n) {

    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("fizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("fizz");
      } else if (i % 5 == 0) {
        System.out.println(("Buzz"));
      } else {
        System.out.println(i);
      }
    }
  }

  static void sumEven(int[] numbers) {

    int sum = 0;

    for (int number : numbers) {

      if (number % 2 == 0) {
        sum += number;
      }

    }

    System.out.println(sum);

  }

  static void findMax(int[] numbers) {

    if (numbers.length == 0 || numbers == null) {

      throw new IllegalArgumentException("List of numbers is empty!");
    }

    int maxValue = numbers[0];

    for (int number : numbers) {
      if (number > maxValue) {

        maxValue = number;

      }
    }
    System.out.println(maxValue);
  }
}
