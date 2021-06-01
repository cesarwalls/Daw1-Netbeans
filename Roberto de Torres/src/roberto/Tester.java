package roberto;

import java.util.Scanner;

public class Tester{
    public static void main(String[] args) {
        Alojamientos alojamientos=new Alojamientos();
        Scanner lector=new Scanner(System.in);
        int var;
        do{
            System.out.println("Menu");
            System.out.println("------------------");
            System.out.println("1.Agregar alojamiento");
            System.out.println("2.Consultar alojamiento");
            System.out.println("3.Actualizar categoria hotel");
            System.out.println("4.Listar ordenados por nombre");
            System.out.println("5.Guardar información binaria");
            System.out.println("6.Guardar información");
            System.out.println("7.Cargar informacion");
            System.out.println("8.Cargar informacion binaria");
            System.out.println("9.Eliminar alojamiento");
            System.out.println("10.Listar hoteles ordenados por puntuacion");
            System.out.println("11.Salir");
            System.out.println("-------------------");
            var=lector.nextInt();
            switch(var){
                case 1:
                    alojamientos.agregarAlojamientos();
                    break;
                case 2:
                    alojamientos.listarProvincia();
                    break;
                case 3:
                    alojamientos.actualizarCategoria();
                    break;
                case 4:
                    alojamientos.listar();
                    break;
                case 5:
                    GestorFicheros.guardarBinario(alojamientos.getAlojamientos());
                    break;
                case 6:
                    GestorFicheros.guardarFichero(alojamientos.getAlojamientos());
                    break;
                case 7:
                    alojamientos=new Alojamientos(GestorFicheros.cargarFichero());
                    break;
                case 8:
                    alojamientos=new Alojamientos(GestorFicheros.cargarBinario());
                    break;
                case 9:
                    alojamientos.eliminar();
                    break;
                case 10:
                    alojamientos.hotelesOrdenados();
                    break;
                case 11:
                    break;
                default:
                    System.out.println("Elige una opcion del 1 al 11");
                    break;
            }
                    
        }while(var!=11);
        
        
    }
    
    
}
