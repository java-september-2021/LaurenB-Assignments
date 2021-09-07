package test;

public class Bird {
    private String color;
    private String size;

    // Constructor
    public Bird(String color, String s) {
        this.color = color;
        size = s;
    }

    public String fizzBuzz(int number) {
        if (number % 5 == 0 && number % 3 == 0)
            return "FizzBuzz";

        if (number % 5 == 0)
            return "Fizz";

        if (number % 3 == 0)
            return "Buzz";
        return Integer.toString(number);
    }

    public String print() {
        return "Fizz Buzz Object";
    }

    public String toString() {
        return "Bird's feathers are " + this.color + ", its size is " + size;
    }

    public static String learnMore() {
        return "Birds are super cool.  There are so many different species...";
    }
}