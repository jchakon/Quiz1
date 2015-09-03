/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;
import java.util.Scanner;

public class Prestamo extends Libro{
    Scanner key=new Scanner(System.in);
    private String cedula;
    private int prestado;
    private int contador;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getPrestado() {
        return prestado;
    }

    public void setPrestado(int prestado) {
        this.prestado = prestado;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    
    void Prestarlibro(String namep){
       // String namep;
        int cantp;
        System.out.println("Ingrese su número de cédula");
        cedula=key.next();
     //   System.out.println("Ingrese el nombre del libro que desea prestar");
       // namep=key.next();
        System.out.println("Ingrese la cantidad de libros a prestar");
        cantp=key.nextInt();
        if(getNombre().compareTo(namep)==0){
            contador=contador+cantp;
            if(contador>0){
            prestado=1;
            }else{
                prestado=0;
            }
            setCantidad(getCantidad()-cantp);
        }
        
    }
    
    void Devolverlibro(String namep){
       // String namep;
        int cantp;
    //    System.out.println("Ingrese el nombre del libro que desea entregar");
    //    namep=key.next();
        System.out.println("Ingrese la cantidad de libros a entregar");
        cantp=key.nextInt();
        if(getNombre().compareTo(namep)==0){
            contador=contador-cantp;
            if(contador>0){
            prestado=1;
            }else{
                prestado=0;
            }
            setCantidad(getCantidad()+cantp);
        }
    }
    
    void Librosprestados(){
        if(prestado==1){
            System.out.println("Nombre del libro: "+getNombre());
            System.out.println("Número de libros prestados: "+contador);
        }else{
            System.out.println("No hay coincidencias ");
        }
    }
    
}
