package injection;

public class robotUno implements robotActual{
	
	public String nombre;
	public String tipo;
	public int niveldeDaño;
	
	public robotUno (String pnombre, String ptipo, int pniveldeDaño) {
		this.nombre = pnombre;
		this.tipo = ptipo;
		this.niveldeDaño = pniveldeDaño;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public int getNiveldeDaño() {
		return niveldeDaño;
	}

	@Override
	public void jugar() {
		System.out.println("Estas jugando con el robot UNO");
		System.out.println("Nombre: "+getNombre());
		System.out.println("Tipo: "+getTipo());
		System.out.println("Nivel de Daño: "+getNiveldeDaño());
	}

}
