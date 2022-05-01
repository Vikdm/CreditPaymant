public class CreditPaymantService {

    public double calculate(double credit, double period, double percent) {

        double n = period * 12;
        double i = percent / 100 / 12;
        double k11 = (1 + i);
        double k12 = Math.pow(k11, n);
        double k1 = i * k12;
        double k2 = k12 - 1;
        double koef = k1 / k2;
        double pay = koef * credit;
        return pay;


    }
}
