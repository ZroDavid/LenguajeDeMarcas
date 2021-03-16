
public class profesor {

	private String nombre;
	private int dni;
	private int tel;
	
	private profesor(String nombre, int dni, int tel) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.tel = tel;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
	
	
}
