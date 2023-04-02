public class Minuman extends Produk {
    private String tipe;

    public Minuman(String nama, double harga) {
        super(nama, harga);
        this.tipe = "Minuman";
    }

    // Implementasi abstract method dari class Produk
    public String getTipe() {
        return tipe;
    }

    // Implementasi abstract method dari class Produk
    public void tampilInfo() {
        System.out.println("Minuman: " + getNama() + ", Harga: " + getHarga());
    }
}