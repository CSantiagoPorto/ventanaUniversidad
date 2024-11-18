
public class Usuario {
private String usuario, contraseña,cargo;



public Usuario(String usuario, String contraseña) {
	super();
	this.usuario = usuario;
	this.contraseña = contraseña;
}

public Usuario(String usuario, String contraseña, String cargo) {
	super();
	this.usuario = usuario;
	this.contraseña = contraseña;
	this.cargo = cargo;
}

public String getUsuario() {
	return usuario;
}

public String getContraseña() {
	return contraseña;
}

public String getCargo() {
	return cargo;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}

public void setContraseña(String contraseña) {
	this.contraseña = contraseña;
}

public void setCargo(String cargo) {
	this.cargo = cargo;
}

}
