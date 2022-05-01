public class Main {
    public static void main(String[] args) {
        CreditPaymantService service = new CreditPaymantService();

        double p1 = service.calculate(1_000_000, 1, 9.9);
        System.out.println(p1);

        double p2 = service.calculate(1_000_000, 2, 9.9);
        System.out.println(p2);

        double p3 = service.calculate(1_000_000, 3, 9.9);
        System.out.println(p3);


    }
}