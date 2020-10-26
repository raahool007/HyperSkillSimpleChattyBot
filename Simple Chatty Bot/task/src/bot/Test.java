package bot;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner ( System.in ) ;
        long inputNumber = scanner.nextLong();
        int targetNumber = (int) Math.log10(inputNumber);
        while(factorial ( targetNumber ) <= inputNumber) {
            targetNumber++;
        }
        System.out.println(targetNumber);


        /*int oldTargetNumber = 0;
        int targetNUmber = (int) Math.sqrt(inputNumber);
        int lowerBound = 0;
        System.out.println(targetNUmber);
*/
        /*while (true){
            if( factorial (targetNUmber) > inputNumber ) {
                oldTargetNumber = targetNUmber;
                targetNUmber = (targetNUmber + lowerBound) / 2 ;
                System.out.println( "targetNUmber "+targetNUmber);
            }
            if( factorial ( targetNUmber ) < inputNumber ) {
                targetNUmber = oldTargetNumber ;
                lowerBound = ( lowerBound + targetNUmber ) / 2;
                System.out.println("lowerbound "+ lowerBound);
            }
            System.out.println();
            if(lowerBound >= targetNUmber) break;
        }*/
        /*System.out.println(lowerBound+" "+factorial(lowerBound));*/

    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

}