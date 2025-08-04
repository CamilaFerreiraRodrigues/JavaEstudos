package model.services;

public interface OnlinePaymentService {

    //taxa de pagamento

    public double paymentFee(double amount);
    public double interest(double amount, Integer months);
}
