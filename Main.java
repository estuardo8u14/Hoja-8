/**
 * 
 */
import java.io.*;
import java.util.*;
/**
 * @author Estuardo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        Operaciones op = new Operaciones();
        
       //Se lee el archivo de texto pero sigo sin saber como hacer para que ustedes lo lean ya pedi ayuda y no me han contestado perdon soy muy penoso en persona
       BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Estuardo\\Desktop\\JavaShit\\Hoja 8\\src"));
       String fichas = "";
       String bfRead;
       
        //guardando el archivo en una lista linea por linea
        List<String> list = new ArrayList<String>();
        while((fichas = bf.readLine()) != null){
            list.add(fichas);
        }
        
        //Se convierte la lista en un array
        String[] parts = list.toArray(new String[0]);
        
       
               
        //array de objetos tipo paciente
        Paciente[] paciente = new Paciente[parts.length];
        
        //Se guardan los datos en el array de objetos
        for( int i = 0; i < parts.length; i++){
            String[] datos = parts[i].split(", ");
            
            paciente[i] = new Paciente(datos[0], datos[1], datos[2]);
            //System.out.println(paciente[i]);
        }
               
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Lista de pacientes por atender el dia de hoy: ");
        for(int i = 0; i < paciente.length; i++){
            System.out.println(paciente[i]);
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        op.Ordenar(paciente);
        
    }
    

}
