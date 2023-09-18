import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



       /*
        Ödev 1
         boolean bark = true;
        int hour = -1;
        System.out.println(shouldWakeUp(bark, hour));
        */

        /*3.Ödev System.out.println(isCatPlaying(false, 35));*/

        /*2.Ödev : *System.out.println(hasTeen(23,33,42)); */

/*
        4. Ödev

        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number :");
        double firstNumber = scanner.nextDouble();
        System.out.println("Second Number :");

        double secondNumber = scanner.nextDouble();

        System.out.println("Radius :");

        double radius = scanner.nextDouble();
        System.out.println(area(firstNumber,secondNumber));
        System.out.println(area(radius));
*/

    }
    /*

    4. Ödev

    public static double area(double firstParam , double secondParam){
        if((firstParam < 0) ||(secondParam <0)){
            return -1;
        }else if ((firstParam>0) || (secondParam > 0)){
            return (firstParam * secondParam);
        }
    return 0;
    }
    public static double area(double radius){
        if(radius < 0){
            return -1;
        }else {
            return (radius*radius*Math.PI);
        }
    }




*/


    /*2. Ödev */
    /*
    public static boolean hasTeen(int firstParam, int secondParam , int thirdParam){
        if((firstParam > 12 && firstParam<20) || (secondParam> 12 && secondParam<20)|| (thirdParam>12 && thirdParam<20)){
            return true;
        }else{
            return false;
        }
    }
*/



    /*

     3. ödev

    public static boolean isCatPlaying(boolean session, int degree) {

        if(session && (degree > 24 && degree < 46)) {
            return false;
        }else if (!session && (degree>35)){
            return false;
        }else if(!session && (degree > 24 && degree < 46)){
            return true;
        }
    return false;
    }
    */


    /**
     *
     * @param bark köpeğin havlaması degeri
     * @param hour köpeğin havlama saati
     * @return
     */

    /* Ödev 1
    public static boolean shouldWakeUp(boolean bark,int hour ){

        if(bark && (hour>20 && hour <= 23)){
            return true;
        }else if(bark &&( hour >=0 && hour <8)){
            return true;
        }else{
            return false;
        }
    }
}
 */
}
