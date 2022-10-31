package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void printFactorialRow(int printToInclusive) {
       int counter = 1;
       int fact = 1;
       while (counter <= printToInclusive) {

           fact = fact * counter;
           System.out.println(fact);
           counter++;
       }

    }
    public static void main(String[] args) {
        printFactorialRow(10);
    }
}
