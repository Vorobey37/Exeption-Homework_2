import java.util.Scanner;

/**
 * task_1
 */
public class task_1 {

    public static void main(String[] args) {
        /*
         * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
         *  и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
         * вместо этого, необходимо повторно запросить у пользователя ввод данных.
         */

         Scanner input = new Scanner (System.in);
         float number = 0;

         while (number == 0) {
            System.out.println("Введите дробное число (типа float): ");
            try {
                String text = input.nextLine();
                number = Float.parseFloat(text);
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат, попробуйте снова: ");
            }
         }
         System.out.println(number);
         input.close();
    }
}