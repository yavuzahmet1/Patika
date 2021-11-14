public interface IBanka {
    final String hostIpAdress="128.0.1.1.0";
    boolean connect(String ipAddress);
    boolean payment(double price,String cardNumber,String expiryDate,String cvc);
}
