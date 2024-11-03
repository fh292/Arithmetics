public class Arithmetics {
    public static void main(String[] args) {
        //Using Java arithmetics convert the amount to US Dollars, using this formula:
        //Kuwaiti Dinar to US Dollars:   Amount in KWD x 3.25
        double amountKWD = 86;
        double amountUS = amountKWD * 3.25;
        System.out.println(amountKWD +" KWD = " + amountUS + " USD");

        //convert USD to KWD
        double amountUS2 = 100;
        double amountKWD2 = amountUS2/3.25;
        System.out.printf(amountUS2 +" USD = " + "%.2f KWD " , amountKWD2);
        System.out.println(" ");

        //convert EUR to KWD
        double amountEUR = 100;
        double amountKWD3 = amountEUR/3.33;
        System.out.println(amountEUR +" EUR = " + amountKWD3 +" KWD " );



    }
}
