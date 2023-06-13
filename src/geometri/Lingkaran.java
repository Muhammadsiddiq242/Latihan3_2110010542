
package geometri;


public class Lingkaran {
    
      //membuat variabel
  private double radius;  
  
    //membuat method luas
  double setLuas(){
      return Math.PI*Math.pow(radius,2);
  }
  
     //membuat method keliling
  double setKeliling(){
      return 2*Math.PI*radius;
  }
}
