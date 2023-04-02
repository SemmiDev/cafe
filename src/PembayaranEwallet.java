public class PembayaranEwallet implements Pembayaran {
    private EwalletSupport namaEwallet;
    private String nomorTelepon;

    public PembayaranEwallet(EwalletSupport namaEwallet, String nomorTelepon) {
        this.namaEwallet = namaEwallet;
        this.nomorTelepon = nomorTelepon;
    }

    // Implementasi method dari interface Pembayaran
    public void prosesPembayaran(double total) {
        System.out.println("Total: " + total);
        System.out.println("Pembayaran dengan " + namaEwallet.name());
        System.out.println("Nomor telepon: " + nomorTelepon);
    }
}