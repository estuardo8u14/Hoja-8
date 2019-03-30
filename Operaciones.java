/**
 * 
 */

/**
 * @author Estuardo
 *
 */
public class Operaciones {
	 public void Ordenar(Paciente[] paciente){
	        
	        VectorHeap<Paciente> vector = new VectorHeap();
	        for(int i=0; i<paciente.length; i++) {
	        	vector.add(paciente[i]);
	        }
	        
	        	while(!vector.isEmpty()) {
	        		System.out.println("Paciente atendido: \n"+vector.remove());
	        	}
}
	 
} 
