public abstract class Produk {
    private String nama;
    private double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Abstract method untuk mendapatkan tipe produk (makanan atau minuman)
    public abstract String getTipe();

    // Abstract method untuk menampilkan informasi produk
    public abstract void tampilInfo();
}