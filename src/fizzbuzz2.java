import validation.Validator;

public class fizzbuzz2 {
    public static void main(String[] args) {
        int start = Validator.getInt("What's your Starting number?");
        int end = Validator.getInt("What's the ending number?");

        doTheFizzBuzz(start, end);
    }

    public static void doTheFizzBuzz(int min, int max) {
        int i = min;
        while (i <= max) {
            if (i % 15 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
