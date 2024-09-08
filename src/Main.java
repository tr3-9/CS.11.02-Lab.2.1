/**
 *****************************************************************************************************
 * By writing your name in the space provided below, you are honouring the CIS academic honesty pledge
 * “I have neither given nor received unauthorized aid on this piece of work.”
 * NAME:
 *****************************************************************************************************
 */

public class Main {

    public static void main(String[] args) {

    }
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c, int d) {
        int firstSum = add(a, b);
        int secondSum = add(c, d);
        return add(firstSum, secondSum);
    }

    public static String greeting(String name) {
        return "早上好， " + name;
    }

    public static String afternoonGreeting(String name) {
        return "下午好" + name;
    }

    public static String triple(String name) {
        return name + name + name;
    }

    public static int half(int a) {
        return a/2;
    }

    public static int roundPositiveValueToNearestInteger(double value) {
        return (int) Math.round(value);
    }


}






