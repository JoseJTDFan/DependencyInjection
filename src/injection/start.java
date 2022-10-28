package injection;

public class start {
	
	public static void main(String args[]){
		
		robotActual robotJuego = new robotUno("Matatuercas3000","Electrico",100);
		juego juego = new juego ("Jose", robotJuego);
		juego.empezarJuego();
	}
}