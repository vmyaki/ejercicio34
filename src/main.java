
public class main {

	public static void main(String[] args) {
		
		Arma arma1=new Arma();
		arma1.setNombre("Soy un arma");
		System.out.println(arma1.toString());
		
		ArmaBlanca armablanca1=new ArmaBlanca();
		armablanca1.setNombre("Soy un arma blanca");
		System.out.println(armablanca1.toString());
		
		ArmaFuego armafuego1=new ArmaFuego();
		armafuego1.setNombre("Soy un arma de fuego");
		System.out.println(armafuego1.toString());
		
	}

}
