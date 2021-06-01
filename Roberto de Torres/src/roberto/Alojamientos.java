package roberto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Alojamientos implements Serializable{
    private ArrayList<Alojamiento> alojamientos;

    public Alojamientos(ArrayList<Alojamiento> alojamientos) {
        this.alojamientos = alojamientos;
    }

    public Alojamientos() {
        alojamientos=new ArrayList();
        for (int i = 0; i < 10; i++) {
            if(i%2==0)
                alojamientos.add(new Hotel());
            else
                alojamientos.add(new CasaRural());
            
        }
    }

    public ArrayList<Alojamiento> getAlojamientos() {
        return alojamientos;
    }

    public void setAlojamientos(ArrayList<Alojamiento> alojamientos) {
        this.alojamientos = alojamientos;
    }
    public void agregarAlojamientos(){
        for (int i = 0; i < 5; i++) {
            if(i%2==0)
                alojamientos.add(new Hotel());
            else
                alojamientos.add(new CasaRural());
            
        }
    }
    public void listarProvincia(){
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce la provincia");
        String provincia=lector.nextLine();
        Boolean ninguno=true;
        
        for (int i = 0; i < alojamientos.size(); i++) {
            if(alojamientos.get(i).getProvincia().equalsIgnoreCase(provincia)){
                System.out.println(alojamientos.get(i).toString());
                ninguno=false;
            }
                 
        }if(ninguno){
                System.out.println("No se ha encontrado alojamientos por esa provincia");
            }
    }
    public void actualizarCategoria(){
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce el nombre del hotel");
        String nombre=lector.nextLine();
        Boolean ninguno=true;
        for (int i = 0; i < alojamientos.size() && ninguno; i++) {
            if(alojamientos.get(i).getNombre().equalsIgnoreCase(nombre) && alojamientos.get(i) instanceof Hotel){
                boolean valido=false;
                do{
                    System.out.println("Introduce puntuacion nueva");
                    int var=lector.nextInt();
                    try{
                        Errores.prueba(var);
                       ((Hotel)alojamientos.get(i)).setCategoria(var);
                        valido=true;
                    }catch(Puntuacion ex){
                        System.out.println(ex.getMessage());
                    }
                }while(!valido);
                ninguno=false;
            }
                
        }if(ninguno)
            System.out.println("No se ha encontrado ninguno hotel por ese nombre");
    }
    public void listar(){
        ArrayList aux=alojamientos;
        Collections.sort(aux);
        for (int i = 0; i < aux.size(); i++) {
            System.out.println(aux.get(i).toString());
        }
    }
    public void eliminar(){
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduce la provincia");
        String provincia=lector.nextLine();
        Boolean ninguno=true;
        for (int i = alojamientos.size()-1; i >=0 ; i--) {
            if(alojamientos.get(i).getProvincia().equalsIgnoreCase(provincia)){
                ninguno=false;
                System.out.println("Se ha encontrado el siguiente alojamiento:");
                System.out.println(alojamientos.get(i).toString());
                System.out.println("Seguro que quieres eliminarlo?");
                String pregunta=lector.nextLine();
                if(pregunta.equalsIgnoreCase("Si"))
                    alojamientos.remove(i);
            }
        }
        if(ninguno){
            System.out.println("No se ha encontrado ningun alojamiento por esa provincia");
        }
    }
    public void hotelesOrdenados(){
        Scanner lector=new Scanner(System.in);
        ArrayList<Hotel> hoteles=new ArrayList();
        for (int i = 0; i < alojamientos.size(); i++) {
           if(alojamientos.get(i) instanceof Hotel){
               hoteles.add((Hotel)alojamientos.get(i));
           }
        }
        Collections.sort(hoteles, new porPuntuacion());
        System.out.println("Quieres mostrarlo del reves?");
                String pregunta=lector.nextLine();
                if(pregunta.equalsIgnoreCase("Si"))
                    Collections.reverse(hoteles);
        for (int i = 0; i < hoteles.size(); i++) {
            System.out.println(hoteles.get(i).toString());
        }
        
    }
    
    
    
}
