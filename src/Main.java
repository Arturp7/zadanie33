import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        MathTasks task1 = new MathTasks();

        System.out.println(task1.isEven(10));
        System.out.println(task1.isOdd(9));
        System.out.println(task1.circleField(10));
        System.out.println(task1.power(10));

    }
}
