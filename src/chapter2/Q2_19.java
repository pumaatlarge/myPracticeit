package chapter2;

/**
 * Created by springtree on 2/10/2015.
 */
public class Q2_19 {
    // my own answer, but it doesn't work when SIZE = 1
    public static final int SIZE = 1;
    public static void main(String[] args) {
        /*for (int i = 0; i < SIZE * SIZE; i++)   {
            for (int j = 0; j < SIZE * SIZE ; j++) {
                if (i % (SIZE + 1) == 0 && j % (SIZE + 1) == 0)   {
                    System.out.print("+");
                }
                else if (i % (SIZE + 1) == 0)    {
                    System.out.print("=");
                }
                else if (j % (SIZE + 1) == 0) {
                    System.out.print("|");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();*/

        printLine();
        System.out.println();
        printWindow();
        printLine();
        System.out.println();
        printWindow();
        printLine();
        }

         static void printLine() {
             System.out.print("+");
             for (int i = 0; i < SIZE; i++) {
                 System.out.print("=");
             }
             System.out.print("+");
             for (int i = 0; i < SIZE; i++) {
                 System.out.print("=");
             }
             System.out.print("+");

         }
         static void printWindow(){
             for (int j = 0; j < SIZE; j++) {
                 System.out.print("|");

                 for (int i = 0; i < SIZE; i++) {
                     System.out.print(" ");
                 }

                 System.out.print("|");
                 for (int i = 0; i < SIZE; i++) {
                     System.out.print(" ");
                 }

                 System.out.print("|");
                 System.out.println();
             }

         }



    }

