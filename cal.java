public class cal{
    /**
     * This method is used to add two numbers.
     * @param num1
     * @param num2
     */
    static void addition(int num1, int num2){
          System.out.print("Addition of given numbers = ");
          System.out.println(num1 + num2);
    }     

    /**
     * This method is used to subtract two numbers.
     * @param num1
     * @param num2
     */
    static void subtraction(int num1, int num2){
          System.out.print("Subtraction of given numbers = ");
          System.out.println(num1 - num2);
    }     

    /**
     * This method is used to multiply two numbers.
     * @param num1
     * @param num2
     */
    static void multiplication(int num1, int num2){
          System.out.print("Multiplication of given no.s = ");
          System.out.println(num1 * num2);
    }     

    /**
     * This method is used to divide two numbers.
     * @param num1
     * @param num2
     */
    static void division(int num1, int num2){
          System.out.print("Division of given given no.s = ");
          System.out.println(num1 / num2);
    }     

    /**
     * This method is used to modulo divide two numbers.
     * @param num1
     * @param num2
     */

    static void moduloDivision(int num1, int num2){
          System.out.print("ModuloDivision of given no.s = ");
          System.out.println(num1 % num2);
    }

    public static void main(String args[]){
          //method call from main method
          addition(20, 10);
          subtraction(40, 30);
          multiplication(20, 30);
          division(20, 4);
          moduloDivision(20, 3);
    }
}

