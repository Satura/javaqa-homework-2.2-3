public class CreditPaymentService {
    public int calculate (int amount, int term){

        double k = (0.0999/12*Math.pow(1+0.0999/12,term))/(Math.pow(1+0.0999/12,term) - 1);
        return (int) (amount*k);
    }
}
