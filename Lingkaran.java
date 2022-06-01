public class Lingkaran {
    float jari = 8;
    double phi = 3.14;
    
    public double Lingkaran(){
        return jari * jari * phi;
    }

    public double Keliling(){
        return(2 * jari * phi);
    }

    public void showl(){
        System.out.println("Lingkaran");
        System.out.println("Jari - jari Lingkaran   : "+jari);
        System.out.println("Phi Lingkaran           : "+phi);
        System.out.println("Luas Lingkaran          : "+Lingkaran());
        System.out.println("Luas Lingkaran          : "+Keliling());
        
    }
}
