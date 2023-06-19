package geometri;

public class Lingkaran {
    
    private final double radius;  
    
    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public double hitungLuas() {
        return Math.PI * Math.pow(radius, 2);
    }
  
    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }
}