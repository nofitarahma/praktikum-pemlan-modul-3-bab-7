public class KueJadi extends Kue{ //deklarasi kelas KueJadi turunan dari kelas Kue
    private double jumlah; //deklarasi atribut jumlah
    //constructor buat inisialisasi object
    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga); //manggil constructor parent class
        this.jumlah = jumlah; //isinya jumlah
    }
    //getter yang mengembalikan nilai jumlah
    public double getJumlah() {
        return jumlah;
    }
    //setter yang mengambil nilai jumlah
    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
    //implementasi hitung harga
    public double hitungHarga(){
        //mengembalikan nilai harga akhir = harga perbiji kali jumlahnya kali 2
        return getHarga() * jumlah * 2;
    }
}
