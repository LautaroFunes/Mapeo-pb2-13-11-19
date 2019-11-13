public class Usuario {

	private String nombre;
	private String email;
	private String password;

	public Usuario(String nombre, String email, String password) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return " y el nombre=" + nombre + ", email=" + email + ", password=" + password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
