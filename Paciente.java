/**
 * 
 */

/**
 * @author Estuardo
 *
 */
public class Paciente implements Comparable <Paciente> {
	//Atributos del paciente
private String nombre;
private String descripcion;
private String CodigoEmergencia;

public Paciente(String nombre, String descripcion, String CodigoEmergencia) {

	this.nombre=nombre;
	this.descripcion=descripcion;
	this.CodigoEmergencia= CodigoEmergencia;
}
public int compareTo(Paciente p) {
	return this.getCodigoEmergencia().compareTo(p.getCodigoEmergencia());
}
public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getCodigoEmergencia() {
    return CodigoEmergencia;
}

public void setCodigoDeEmergencia(String CodigoEmergencia) {
    this.CodigoEmergencia = CodigoEmergencia;
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}
public  String toString(){

    return this.getNombre() +" |  "+this.getDescripcion()+" | "+this.getCodigoEmergencia();
}
}




