import java.util.Scanner;
public class Geometricos {
Scanner sc =new Scanner(System.in);
  
String Nombre_figura;    
double radio=0;
double base=0;
double altura=0;
double longitud_lados=0;
double diametro=0;
public Geometricos(String nombre_figura, double radio, double base, double altura, double longitud_lados, double diametro) {
    Nombre_figura = nombre_figura;
    this.radio = radio;
    this.base = base;
    this.altura = altura;
    this.longitud_lados = longitud_lados;
    this.diametro= diametro;
}
public double calcular_area_circulo(){
    return Math.PI*Math.pow(radio,2);
}
public double calcular_area_rectangulo(){
    return base/altura;
}
public double calcular_area_cuadrado(){
    return longitud_lados*longitud_lados;
}
public double calcular_area_triangulo(){
    return (base*altura)/2;
}
// Me quede atrapado en el perimetro del tringulo ya que solo tengo la base y la altura pero no se el valor de los lados//
public double calcular_perimetro_circulo(){
    return Math.PI*diametro;
}
public double calcular_perimetro_rectangulo(){
    return 2*base+2*altura;
}
    public double calcular_perimetro_cuadrado(){
        return longitud_lados+longitud_lados+longitud_lados+longitud_lados;

    }
    public void imprimir(){
  
    //Intente usar un metodo swich pero la variable que me lee la opcion no me funciona//    
        System.out.println("La figura "+ Nombre_figura);
        System.out.println("Radio " +radio);
        System.out.println("Base "+ altura);
        System.out.println("Altura " +altura);
        System.out.println("Longitud de lados "+ longitud_lados);
        System.out.println("Diametro" + diametro);
        System.out.println("area_circulo "+ calcular_area_circulo());
        System.out.println("area_rectangulo "+ calcular_area_rectangulo());
        System.out.println("area_cuadrado "+ calcular_area_cuadrado());
        System.out.println("area_triangulo "+ calcular_area_triangulo());
        System.out.println("perimetro_circulo()" + calcular_perimetro_circulo());
        System.out.println("perimetro_cuadrado()" + calcular_perimetro_cuadrado());
        System.out.println("perimetro_rectangulo()" + calcular_perimetro_rectangulo());
        System.out.println("");
    }
        public static void main(String[] args) {
            Geometricos geometricos1= new Geometricos("Circulo", 10, 0, 0, 0, 5);
            System.out.println("Circulo :");
            geometricos1.imprimir();

            Geometricos geometricos2= new Geometricos("Rectangulo", 0, 5, 8, 0, 0);
            System.out.println("Rectangulo");
            geometricos2.imprimir();

            Geometricos geometricos3= new Geometricos("Cuadrado", 0, 0, 0, 4, 0);
            System.out.println("Cuadrado");
            geometricos3.imprimir();
    }
}
//La verdad lo hice a la carrera y a ultimo momento porque tenia miedo de no saber como usar el metodo constructor si hay que usar get o set
