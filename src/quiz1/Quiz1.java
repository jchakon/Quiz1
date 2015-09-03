package quiz1;
import java.util.Scanner;

public class Quiz1 {


    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int a=0;
        int b=0;
        int k=0;
        int array[]=new int[5];
        String help;
        
        for(int j=0;j<5;j++){
            array[j]=0;
        }
        
        Prestamo[] libros=new Prestamo[5];
        for(int i=0;i<5;i++){
            libros[i]=new Prestamo();
        }
        do{
            System.out.println("**********MENU**********");
            System.out.println("1.Ingresar libro\n2.Modificar libro\n3.Eliminar libro\n4.Ver información de libro\n5.Hacer préstamo\n6.Devolver libro\n7.Ver libros prestados\n8.Salir");
            a=key.nextInt();

            switch(a){
                case 1:
                    System.out.println("Ingresar libro 1,2,3,4 ó 5");
                    b=key.nextInt();
                    if((b==1)&&array[0]==0){
                        libros[0].Ingresarlibro();
                        array[0]=1;
                    }else if((b==2)&&array[1]==0){
                        libros[1].Ingresarlibro();
                        array[1]=1;
                    }else if((b==3)&&array[2]==0){
                        libros[2].Ingresarlibro();
                        array[2]=1;
                    }else if((b==4)&&array[3]==0){
                        libros[3].Ingresarlibro();
                        array[3]=1;
                    }else if((b==5)&&array[4]==0){
                        libros[4].Ingresarlibro();
                        array[4]=1;
                    }else{
                        System.out.println("Libro ocupado");
                    }                    
                    break;
                case 2:
                    System.out.println("Qué libro desea modificar?");
                    help=key.next();
                    for(k=0;k<5;k++){
                        if(array[k]==1){
                            if(libros[k].getNombre().compareTo(help)==0){
                                libros[k].Actualizarlibro();
                            }
                        }    
                    }
                    break;
                case 3:
                    System.out.println("Qué libro desea eliminar?");
                    help=key.next();
                    for(k=0;k<5;k++){
                        if(array[k]==1){
                            if(libros[k].getNombre().compareTo(help)==0){
                                libros[k].Eliminarlibro();
                                array[k]=0;
                                libros[k].setContador(0);
                                libros[k].setPrestado(0);
                                libros[k].setCedula(null);
                            }
                        }    
                    }
                    break;
                case 4:
                    System.out.println("De qué libro desea ver la información?");
                    help=key.next();
                    for(k=0;k<5;k++){
                        if(array[k]==1){
                            if(libros[k].getNombre().compareTo(help)==0){
                                libros[k].Buscarlibro(help);

                            }
                        }else{
                                System.out.println("El libro no existe en la posición"+k);
                            }    
                    }
                    break;
                case 5:
                    System.out.println("Qué libro desea prestar?");
                    help=key.next();
                    for(k=0;k<5;k++){
                        if(array[k]==1){
                            if(libros[k].getNombre().compareTo(help)==0){
                                libros[k].Prestarlibro(help);
                            }
                        }    
                    }
                    break;
                case 6:
                    System.out.println("Qué libro desea entregar?");
                    help=key.next();
                    for(k=0;k<5;k++){
                        if(array[k]==1){
                            if(libros[k].getNombre().compareTo(help)==0){
                                libros[k].Devolverlibro(help);
                            }
                        }    
                    }
                    break;
                case 7:
                    for(k=0;k<5;k++){
                        if(array[k]==1){
                            libros[k].Librosprestados();
                        }
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }while(a!=8);
        
        
    }
    
}
