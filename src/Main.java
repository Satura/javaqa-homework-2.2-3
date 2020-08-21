public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платеж при сумме 1 000 000 на 1 год: " +
                service.calculate(1_000_000,12));
        System.out.println("Ежемесячный платеж при сумме 1 000 000 на 2 года: " +
                service.calculate(1_000_000,24));
        System.out.println("Ежемесячный платеж при сумме 1 000 000 на 3 года: " +
                service.calculate(1_000_000,36));

    }
}
