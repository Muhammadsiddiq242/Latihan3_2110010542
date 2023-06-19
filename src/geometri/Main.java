package geometri;

public class Main {
    
    public static void main(String[] args){
        Lingkaran lingkaran = new Lingkaran(5.0);
    
        System.out.println("Hasil Luas lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Hasil keliling Lingkaran: " + lingkaran.hitungKeliling());

        PersegiPanjang persegipanjang = new PersegiPanjang(2.0, 6.0);
    
        System.out.println("Hasil Luas persegipanjang: " + persegipanjang.hitungLuas());
        System.out.println("Hasil keliling persegipanjang: " + persegipanjang.hitungKeliling());
    }
}