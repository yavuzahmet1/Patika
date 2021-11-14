public class BBankasi implements IBanka{
    @Override
    public boolean connect(String ipAddress) {
        return false;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expiryDate, String cvc) {
        return false;
    }
}
