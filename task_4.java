import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        /*
         * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
         * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
         */

         Scanner input = new Scanner(System.in);
         System.out.println("Введите строку: ");
         String text = input.nextLine();
         if (text == "")
         {
            throw new RuntimeException("Пустые строки вводить нельзя!");
           
         }
         System.out.println(text);
         input.close();
         
    }
}
