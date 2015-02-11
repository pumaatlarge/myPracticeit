package chapter2;

/**
 * Created by AlienLi on 2015-02-10.
 *
 * Question: print StarFigure as below
 *      ////////////////\\\\\\\\\\\\\\\\
        ////////////********\\\\\\\\\\\\
        ////////****************\\\\\\\\
        ////************************\\\\
        ********************************
 */
public class Q2_20 {
    public static void main(String[] args){
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 0; j < -4 * i + 20 ; j++) {
                System.out.print("/");
            }
            for (int j = 0; j < 8 * i - 8; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < -4 * i + 20 ; j++) {
                System.out.print("\\");
            }
            System.out.println();

        }
    }
}
