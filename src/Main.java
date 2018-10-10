public class Main {


    public double getLowestChangeAmount(double pay){

       double quarters =  pay % .25;


       double dimes = quarters % .10;

       double nickels = dimes % .5;

       return nickels;

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.getLowestChangeAmount(1.37);
    }
}
