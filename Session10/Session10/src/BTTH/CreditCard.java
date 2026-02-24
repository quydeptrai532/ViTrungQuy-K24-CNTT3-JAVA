package BTTH;

public class CreditCard extends PaymentMethod implements Payable {

    private String cardNumber;
    private String cvv;
    private double creditLimit;

    public CreditCard(String accountName, String paymentId,
                      String cardNumber, String cvv, double creditLimit) {
        super(accountName, paymentId);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
    }

    @Override
    public void validate() {
        if (cardNumber.length() == 16) {
            System.out.println("Thẻ hợp lệ.");
        } else {
            System.out.println("Số thẻ không hợp lệ!");
        }
    }

    @Override
    public void pay(double amount) {
        if (amount <= creditLimit) {
            creditLimit -= amount;
            System.out.println("Thanh toán thành công bằng Credit Card.");
            System.out.println("Hạn mức còn lại: " + creditLimit);
        } else {
            System.out.println("Vượt quá hạn mức tín dụng!");
        }
    }
}