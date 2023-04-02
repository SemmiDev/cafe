public class Makanan extends Produk {
    private String tipe;

    public Makanan(String nama, double harga) {
        super(nama, harga);
        this.tipe = "Makanan";
    }

    // Implementasi abstract method dari class Produk
    public String getTipe() {
        return tipe;
    }

    // Implementasi abstract method dari class Produk
    public void tampilInfo() {
        System.out.println("Makanan: " + getNama() + ", Harga: " + getHarga());
    }
}