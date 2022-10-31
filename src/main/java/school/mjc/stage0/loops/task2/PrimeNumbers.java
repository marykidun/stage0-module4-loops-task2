package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (counter <= printToInclusive) {
            if (counter % 1 == 0 && counter % counter == 0 && counter % 2 != 0 && counter % 3 != 0)
            System.out.println(counter);
            counter++;
        }

    }
        public static void main (String[]args){
            printPrimeNumbers(10);
        }
    }
