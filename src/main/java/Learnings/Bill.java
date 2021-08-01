package Learnings;

public class Bill {

    public static void main(String[] args) {
        int a = 250;
        //Amount of bill
//        <100 5
//            100<amount<200 5 +0.4*remaining
//            200<amount<300 5 +40+0.6*remaining
//            300<amount<400 5++40+60+0.7*remaining
//


        double b, c, d, e;
        b = 0.4; //100-200
        c = 0.6;//200-300
        d = 0.7;//300-400
        e = 50;
        System.out.println("Ascending");

        double f = a > 100 ? 50 : 60;

        f = a > 100 ? (a > 200 ? (a - 200) * c + 40+5 : ((a - 100) * b)+5) : 5;
        System.out.println(f);
    }
}
