public class ABankasi implements IBanka {
    private String bankaAdi;
    private String terminalId;
    private String password;

    public ABankasi(String bankaAdi, String terminalId, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalId = terminalId;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAdress) {
        System.out.println("Kullanıcı\t: " + ipAdress);
        System.out.println("Makina ip\t: " + hostIpAdress);
        System.out.println(this.bankaAdi + " bağlandı!");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expiryDate, String cvc) {
        System.out.println("Bankadan cevap bekleniyor!");
        System.out.println("İşlem başarılı!");
        return true;
    }


    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
