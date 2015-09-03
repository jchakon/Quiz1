/*nombre, autor, año de publicación, código,
cantidad y área, esta última tiene cinco opciones: química, física, tecnología, cálculo y
programación*/
package quiz1;
import java.util.Scanner;

public class Libro {
    Scanner key=new Scanner(System.in);
    private String nombre;
    private String autor;
    private int año;
    private String codigo;
    private int cantidad;
    private String area;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    void Ingresarlibro(){
        int opc;
        System.out.println("Ingrese el nombre del libro");
        nombre=key.next();
        System.out.println("Ingrese el nombre del autor del libro");
        autor=key.next();
        System.out.println("Ingrese el año de publicación del libro");
        año=key.nextInt();
        System.out.println("Ingrese el código del libro");
        codigo=key.next();
        System.out.println("Ingrese la cantidad de libros que hay");
        cantidad=key.nextInt();
        System.out.println("Ingrese el área del libro");
        System.out.println("1.Física\n2.Química\n3.Tecnología\n4.Cálculo\n5.Programación");
        opc=key.nextInt();
        if(opc==1){
            area="fisica";
        }
        if(opc==2){
            area="quimica";
        }
        if(opc==3){
            area="tecnologia";
        }
        if(opc==4){
            area="calculo";
        }
        if(opc==5){
            area="programacion";
        }
    }
    
    void Actualizarlibro(){
      int opc=0;
      int opc1=0;  
      //do{  
        System.out.println("Qué atributo desea cambiar?");
        System.out.println("1.Nombre\n2.Autor\n3.Año de publicación\n4.Código de libros\n5.Cantidad de libros\n6.Área de libro\n7.Ninguno");
        opc1=key.nextInt();
        switch(opc1){
            case 1:
                System.out.println("Ingrese el nombre del libro");
                nombre=key.next();  
                break;
            case 2:
                System.out.println("Ingrese el nombre del autor del libro");
                autor=key.next();
                break;
            case 3:
                System.out.println("Ingrese el año de publicación del libro");
                año=key.nextInt();
                break;
            case 4:
                System.out.println("Ingrese el código del libro");
                codigo=key.next();
                break;
            case 5:
                System.out.println("Ingrese la cantidad de libros que hay");
                cantidad=key.nextInt();
                break;
            case 6:
                System.out.println("Ingrese el área del libro");
                System.out.println("1.Física\n2.Química\n3.Tecnología\n4.Cálculo\n5.Programación");
                opc=key.nextInt();
                if(opc==1){
                    area="fisica";
                }
                if(opc==2){
                    area="quimica";
                }
                if(opc==3){
                    area="tecnologia";
                }
                if(opc==4){
                    area="calculo";
                }
                if(opc==5){
                    area="programacion";
                }
                break;
            case 7:
                System.out.println("Ha decidido no hacer modificaciones");
                break;
            default:
                System.out.println("No es una opción válida");
                break;
            }                                       
      //};while (opc1!=7);  

    }
    void Eliminarlibro(){
        nombre=null;
        autor=null;
        año=0;
        codigo=null;
        cantidad=0;
        area=null;
    }
    void Buscarlibro(String nombre2){
      //  String nombre2;
      //  System.out.println("De qué libro desea ver la información disponible?");
      //  nombre2=key.next();
        if(nombre.compareTo(nombre2)==0){
            System.out.println("Nombre: "+nombre);
            System.out.println("Autor: "+autor);
            System.out.println("Año de publicación: "+año);
            System.out.println("Código: "+codigo);
            System.out.println("Cantidad: "+cantidad);
            System.out.println("Área: "+area);
        }
    }

}
