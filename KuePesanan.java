public class KuePesanan extends Kue { //deklarasi kelas KuePesanan turunan dari kelas Kue
    private double berat; //deklarasi atribut berat
    //constructor buat inisialisasi object
    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga); //manggil constructor parent class
        this.berat = berat; //isinya berat
    }
    //getter yang mengembalikan nilai berat
    public double getBerat() {
        return berat;
    }
    //setter yang mengambil nilai berat
    public void setBerat(double berat) {
        this.berat = berat;
    }
    //implementasi hitung harga
    public double hitungHarga(){
        //mengembalikan nilai harga akhir = harga perbiji kali beratnya
        return getHarga() * berat; 
    }
}
