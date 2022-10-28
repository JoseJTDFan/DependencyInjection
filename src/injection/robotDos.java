package injection;

public class robotDos extends robotUno implements robotActual {

	public robotDos (String pnombre, String ptipo, int pniveldeDaño) {
		super(pnombre,ptipo,pniveldeDaño);
	}
	@Override
	public void jugar() {
		System.out.println("Estas jugando con el robot DOS");
		System.out.println("Nombre: "+getNombre());
		System.out.println("Tipo: "+getTipo());
		System.out.println("Nivel de Daño: "+getNiveldeDaño());
	}

}
