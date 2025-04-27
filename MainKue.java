public class MainKue { //deklarasi kelas
    public static void main(String[] args) { //deklarasi main method
        //membuat array kue panjanganya 20
        Kue[] kue = new Kue[20];
        //array kue diisi object KuePesanan dan KueJadi serta datanya
        kue[0] = new KuePesanan("Kue Pesanan 1", 10000, 1);
        kue[1] = new KuePesanan("Kue Pesanan 2", 9000, 2);
        kue[2] = new KuePesanan("Kue Pesanan 3", 8000, 3);
        kue[3] = new KuePesanan("Kue Pesanan 4", 7000, 4);
        kue[4] = new KuePesanan("Kue Pesanan 5", 6000, 5);
        kue[5] = new KuePesanan("Kue Pesanan 6", 5000, 6);
        kue[6] = new KuePesanan("Kue Pesanan 7", 4000, 7);
        kue[7] = new KuePesanan("Kue Pesanan 8", 3000, 8);
        kue[8] = new KuePesanan("Kue Pesanan 9", 2000, 9);
        kue[9] = new KuePesanan("Kue Pesanan 10", 1000, 10);
        kue[10] = new KueJadi("Kue Jadi 1", 1000, 25);
        kue[11] = new KueJadi("Kue Jadi 2", 1500, 10);
        kue[12] = new KueJadi("Kue Jadi 3", 2000, 20);
        kue[13] = new KueJadi("Kue Jadi 4", 2500, 8);
        kue[14] = new KueJadi("Kue Jadi 5", 3000, 15);
        kue[15] = new KueJadi("Kue Jadi 6", 3500, 6);
        kue[16] = new KueJadi("Kue Jadi 7", 4000, 10);
        kue[17] = new KueJadi("Kue Jadi 8", 4500, 4);
        kue[18] = new KueJadi("Kue Jadi 9", 5000, 5);
        kue[19] = new KueJadi("Kue Jadi 10", 5500, 2);
        
        tampilkanSemuaKue(kue); //memanggil method tampilkanSemuaKue
        perhitunganKue(kue); //memanggil method perhitunganKue
        kueTermahal(kue); //memanggil method kueTermahal
        
    }
    static private int maksPanjang = 50; //deklaraasi atribut buat batas panjang
    //method agar kalimatnya di tengah baris
    private static String ditengah(String kata){
        int padding = maksPanjang - kata.length(); //buat menghitung sisa panjang baris setelah dikurangi kata
        int paddingKiri = (padding/2)-2; //ini untuk menghitung ukuran padding di sebelah kiri
        int paddingKanan = padding - paddingKiri- 4; //ini untuk menghitung ukuran padding di sebelah kanan
        return " ".repeat(paddingKiri) + kata + " ".repeat(paddingKanan); //menggabungkan antara spasi sepanjang padding kiri, kata, dan padding kanan
    }
    //method untuk membuat border ==== sepanjang maksPanjang
    public static void border1(){
        System.out.println("=".repeat(maksPanjang));
    }
    //method untuk membuat border ---- sepanjang maksPanjang
    public static void border2(){
        System.out.println("-".repeat(maksPanjang));
    }
    //method yang fungsinya untuk menampilkan semua Kue
    public static void tampilkanSemuaKue(Kue[] kue){
        border1(); //menampilkan border yang ====
        System.out.println("||" + ditengah("Data Semua Kue") + "||"); //menampilkan kata ditengah
        border1(); //menampilkan border yang ====
        //loop untuk cek setiap array kue
        for (Kue i : kue) {
            String jenisnya = ""; //inisialisasi variable string jenis kue
            //jika i objectnya KuePesanan
            if (i instanceof KuePesanan) {
                jenisnya = "Kue Pesanan"; //jenisnya menampilkan kue pesanan
            //jika i objectnya KueJadi
            } else if (i instanceof KueJadi) {
                jenisnya = "Kue Jadi"; //jenisnya menampilkan kue jadi
            }
            //menampilkan jenis kue di awal kemudian menampilkan data kue yang lain
            System.out.println("Jenis Kue         : " + jenisnya + "\n" + i);
            border2(); //menampilkan border yang ----
        }
    }
    //method yang fungsinya menghitung total harga sesuai ketentuan soal
    public static void perhitunganKue(Kue[] kue){
        double totalHargaSemuanya = 0; //inisialisasi variable
        double totalHargaKuePesanan = 0; //inisialisasi variable
        double totalBeratKuePesanan = 0; //inisialisasi variable
        double totalHargaKueJadi = 0; //inisialisasi variable
        double totalJumlahKueJadi = 0; //inisialisasi variable
        //loop untukcek setiap array kue
        for (Kue i : kue) {
            double harganya = i.hitungHarga(); //inisialisasi variable harganya dengan i.hitungHarga()
            totalHargaSemuanya += harganya; //total harga semuanya 
            //jika i objectnya KuePesanan
            if (i instanceof KuePesanan) {
                totalHargaKuePesanan += harganya; //menghitung total harga kue pesanan 
                totalBeratKuePesanan += ((KuePesanan)i).getBerat(); //menghitung total berat kue pesanan
            //jika i objectnya KueJadi
            } else if (i instanceof KueJadi) {
                totalHargaKueJadi += harganya; //menghitung total harga kue jadi
                totalJumlahKueJadi += ((KueJadi)i).getJumlah(); //menghitung total jumlah kue jadi
            }
        }
        border1(); //menampilkan border yang ====
        System.out.println("| " + ditengah("Data Perhitungan Kue") + " |"); //menampilkan kata ditengah
        border1(); //menampilkan border yang ====
        System.out.println("Total Harga Semua Kue         : " + String.format("Rp. %,.2f", totalHargaSemuanya)); //menampilkan totalHargaSemuanya
        System.out.println("Total Harga Semua Kue Pesanan : " + String.format("Rp. %,.2f", totalHargaKuePesanan)); //menampilkan totalHargaKuePesanan
        System.out.println("Total Berat Semua Kue Pesanan : " + String.format("%.0f", totalBeratKuePesanan)); //menampilkan totalBeratKuePesanan
        System.out.println("Total Harga Semua Kue Jadi    : " + String.format("Rp. %,.2f", totalHargaKueJadi)); //menampilkan totalHargaKueJadi
        System.out.println("Total Jumlah Semua Kue Jadi   : " + String.format("%.0f", totalJumlahKueJadi)); //menampilkan totalJumlahKueJadi
    }
    //method yang berfungsi untuk mencari kue dengan harga akhir yang terbesar
    public static void kueTermahal(Kue[] kue){
        Kue kueMahal = kue[0]; //inisialisasi sementara kue termahal
        //loop untuk cek setiap array kue
        for (Kue i : kue) {
            //jika nilai hitungHarga() i lebih besar dari nilai hitungHarga() dari kueMahal
            if (i.hitungHarga() > kueMahal.hitungHarga()) {
                kueMahal = i; //kueMahal menjadi i
            }
        }
        border1(); //menampilkan border yang ====
        System.out.println("| " + ditengah("Data Kue Termahal") + " |"); //menampilkan kata ditengah
        border1(); //menampilkan border yang ====
        System.out.println(kueMahal); //menampilkan data dari kue termahal
        border2(); //menampilkan border yang ----
    }
    
}
