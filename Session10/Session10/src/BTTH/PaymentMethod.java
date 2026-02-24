package BTTH;

public abstract class PaymentMethod {

    protected String accountName;
    protected String paymentId;

    public PaymentMethod(String accountName, String paymentId) {
        this.accountName = accountName;
        this.paymentId = paymentId;
    }

    public abstract void validate();

    public String getAccountName() {
        return accountName;
    }

    public String getPaymentId() {
        return paymentId;
    }
}