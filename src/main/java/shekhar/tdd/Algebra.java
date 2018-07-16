package shekhar.tdd;

public class Algebra {

    public Algebra() {}

    public double sum(double a, double b) {
        return a+b;
    }

    public double multiply(double x, double y) {
        if (x > 999) {
            throw new IllegalArgumentException("X should be less than 1000");
        }
        return x * y;
    }

    public String concat(String text1, String text2, String delimiter) {
        StringBuilder builder = new StringBuilder();
        builder.append(text1).append(" ").append(delimiter).append(" ").append(text2);
        return builder.toString();
    }

}
