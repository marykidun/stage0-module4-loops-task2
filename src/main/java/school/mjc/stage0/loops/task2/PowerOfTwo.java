package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void printPower(int power) {
        int number = 2;
        while (power < 0) {
            System.out.println("too much power");
            break;
        }
          if (power >=0) {
             System.out.println(Math.pow(number, power));

         }
        number++;
    }
    public static void main(String[] args) {
        printPower(6);
    }
}
