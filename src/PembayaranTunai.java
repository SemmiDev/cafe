public class PembayaranTunai implements Pembayaran {
    private double jumlahBayar;

    public PembayaranTunai(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public double kembalian(double total) {
        return jumlahBayar - total;
    }

    // Implementasi method dari interface Pembayaran
    public void prosesPembayaran(double total) {
        System.out.println("--------------------------------");
        System.out.println("Jumlah Bayar = " + jumlahBayar);
        System.out.println("Uang Anda = " + total);
        System.out.println("Kembalian = " + kembalian(total));
        System.out.println("--------------------------------");
    }
}
