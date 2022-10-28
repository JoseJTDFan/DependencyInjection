package injection;

public class juego {
	
	private String nombre;
	private robotActual robot;
	
	public juego(String pnombre, robotActual probot) {
		this.nombre = pnombre;
		this.robot = probot;
	}
	
	public void empezarJuego() {
		System.out.println("Jugador: "+this.nombre);
		this.robot.jugar();
	}
}
