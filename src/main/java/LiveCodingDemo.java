public class LiveCodingDemo {

  public static void main(String [] args) {

    System.out.println(findMax(new Integer[] {null, 1, 2, 3, 0}));
  }

  public static int findMax(Integer[] numbers) {

    if (numbers == null || numbers.length == 0) {
        return Integer.MIN_VALUE;
      }

    int maxValue = Integer.MIN_VALUE;

    for (Integer number : numbers) {

      if (number != null && number > maxValue) {
          maxValue = number;
        }

    }
    return maxValue;
  }

}
