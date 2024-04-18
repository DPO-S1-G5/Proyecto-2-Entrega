package Modelo;

public class Administrador 
{
	private String nombre;
	private String correo;
	private String telefono;
	
	private int ID;
	
	
	public Administrador()
	{
		
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}
	

}
