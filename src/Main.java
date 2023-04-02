public class Main {
    public static void main(String[] args) {
        Makanan nasiGoreng = new Makanan("Nasi Goreng", 25000);
        Minuman jusMangga = new Minuman("Jus Mangga", 10000);
        Makanan mieAyam = new Makanan("Mie Ayam", 20000);

        Penjualan penjualan1 = new Penjualan("1 April 2023");
        penjualan1.tambahProduk(nasiGoreng);
        penjualan1.tambahProduk(jusMangga);
        penjualan1.tambahProduk(mieAyam);

        penjualan1.hitungTotalPenjualan();
        penjualan1.setJenisPembayaran(PaymentType.TUNAI);

        Pembayaran pembayaran1 = new PembayaranTunai(100_000);
        penjualan1.prosesPembayaran(pembayaran1);

        penjualan1.tampilkanDetails();
    }
}