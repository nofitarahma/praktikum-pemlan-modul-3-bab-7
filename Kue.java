public abstract class Kue { //deklarasi abstract class
    private String nama; //deklarasi variable nama
    private double harga;//dekalarasi variable harga
    //constructor buat inisialisasi object
    public Kue(String nama, double harga) {
        this.nama = nama; //isinya nama
        this.harga = harga; //isinya harga
    }
    //getter yang mengembalikan nilai nama
    public String getNama() {
        return nama;
    }
    //setter yang mengambil nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    //getter yang mengembalikan nilai harga
    public double getHarga() {
        return harga;
    }
    //setter yang mengambil nilai harga
    public void setHarga(double harga) {
        this.harga = harga;
    }
    //deklarasi abstract method hitungHarga()
    public abstract double hitungHarga();
    //method yang fungsinya untuk menampilkan data
    public String toString(){
        //mengembalikan string yang menampilkan data
        return 
        "Nama Kue          : " + nama +
        "\nHarga Kue Perbiji : " + String.format("Rp. %,.2f", harga) + 
        "\nHarga Akhir       : " + String.format("Rp. %,.2f", hitungHarga());
    }
}
