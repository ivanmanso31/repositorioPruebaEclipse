
public class HolaMundo {
	
	String saludo;
	
	public HolaMundo() {
		
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public void saludo() {
		saludo="Hola mundo.";
		System.out.println(saludo);
	}
	
	public void despedida() {
		saludo="Adios mundo";
		System.out.println(saludo);
	}
}
