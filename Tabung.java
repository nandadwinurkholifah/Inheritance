public class Tabung extends Lingkaran{
    float jari = 8;
    double phi = 3.14;
    double t = 3;

    public double Volume(){
        return phi * jari * jari * t;
    }

    public double Luasper(){
        return 2 * phi * jari * (jari + t);
    }
    
    public void showl(){
        super.showl();
        System.out.println(" ");
        System.out.println("Tabung");
        System.out.println("Volume Tabung adalah    : "+Volume());
        System.out.println("Luas Tabung adalah      : "+Luasper());
    }
}
