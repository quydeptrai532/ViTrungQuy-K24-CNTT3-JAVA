package BTTH;

public class Main {

    public static void main(String[] args) {

        Payable creditCard = new CreditCard(
                "Nguyen Van A",
                "CC001",
                "1234567890123456",
                "123",
                10000
        );

        Payable eWallet = new EWallet(
                "Tran Van B",
                "EW001",
                "0987654321",
                5000
        );

        // Đa hình
        ((PaymentMethod) creditCard).validate();
        creditCard.pay(2000);

        System.out.println("----------------");

        ((PaymentMethod) eWallet).validate();
        eWallet.pay(3000);

        System.out.println("----------------");

        // Anonymous Class - Reward Points
        Payable rewardPoints = new Payable() {
            @Override
            public void pay(double amount) {
                int points = (int) (amount * 10);
                System.out.println("Thanh toán bằng điểm thưởng.");
                System.out.println("Số điểm đã sử dụng: " + points);
            }
        };

        rewardPoints.pay(100);
    }
}