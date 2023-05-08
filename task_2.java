

public class task_2 {
    public static void main(String[] args) {
        /*
         * Если необходимо, исправьте данный код 
         * try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

         */
        // Здесь ошибка в том, что не задан массив, программа не понимает, что такое intArray[8]?
        // Задим массив, к примеру:
          int []intArray = new int [10];
         try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         } // также не хватает ArrayIndexOutOfBoundsException, если уж мы ввели массив.
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
         }
    }
}
