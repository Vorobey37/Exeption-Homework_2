public class task_3 {
    
        /*
         * Дан следующий код, исправьте его там, где требуется (задание 3
         * public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

         */

         public static void main(String[] args) throws Exception {
            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = { 1, 2 };
                abc[3] = 9;
            } /*catch (Throwable ex) {
                System.out.println("Что-то пошло не так...");
            } это общее исключение, его нужно вставить в конец.*/ 
            /*catch (NullPointerException ex) {
                System.out.println("Указатель не может указывать на null!");
            } может здесь имеется ввиду ошибка деления на ноль?*/
            catch (ArithmeticException ex) {
                System.out.println("На ноль делить нельзя!");
            }
            catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера!");
            }
            catch (Throwable ex) {
                System.out.println("Что-то пошло не так...");
            }
         }
         /*public static void printSum(Integer a, Integer b) throws FileNotFoundException {
            System.out.println(a + b);
         } может здесь имеется ввиду, что нужно прокинуть ошибку, если один из аргументов null?*/

         public static void printSum(Integer a, Integer b) throws NullPointerException {
            System.out.println(a + b);
         }

         
    
}
