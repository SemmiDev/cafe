import java.util.ArrayList;
import java.util.List;

public class Penjualan {
    private String tanggal;
    private List<Produk> daftarProduk = new ArrayList<>();
    private double totalPenjualan;
    private PaymentType jenisPembayaran;

    public Penjualan(String tanggal) {
        this.tanggal = tanggal;
    }

    public void tambahProduk(Produk produk) {
        System.out.println("Produk " + produk.getNama() + " berhasil ditambahkan");
        daftarProduk.add(produk);
    }

    public void hitungTotalPenjualan() {
        for (Produk produk : daftarProduk) {
            totalPenjualan += produk.getHarga();
        }
    }

    public double getTotalPenjualan() {
        return totalPenjualan;
    }

    public void setJenisPembayaran(PaymentType jenisPembayaran) {
        this.jenisPembayaran = jenisPembayaran;
    }

    public PaymentType getJenisPembayaran() {
        return jenisPembayaran;
    }

    // Polimorfisme: method pembayaran yang dapat menerima parameter berbagai jenis pembayaran
    public void prosesPembayaran(Pembayaran pembayaran) {
        pembayaran.prosesPembayaran(totalPenjualan);
    }

    public void tampilkanDetails() {
        System.out.println("Tanggal " + tanggal);
        System.out.println("Produk yang terjual " + tanggal);
        for (Produk p : daftarProduk) {
            System.out.println("\t" + p.getNama());
        }
        System.out.println("Total penjualan " + totalPenjualan);
        System.out.println("Jenis Pembayaran " + jenisPembayaran.name());
    }
}