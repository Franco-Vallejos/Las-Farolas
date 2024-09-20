package lasfarolas;

public class LasFarolas {

	public static void main(String[] args) {
		int y[] = {1, 4, 7, 11, 15, 26, 37};
		int r[] = {3, 5, 7, 6, 8, 9, 10};
		int x[] = {1, 4, 13, 16, 21, 25, 37, 45};
		
		try {
			Calle calle = new Calle(x, y, r);
			if(!calle.encenderLuces()) {
				System.out.println("Error, no se pudo iluminar todos los puntos de la calle");
			}
			else {
				calle.mostrarListadoDeLuces();				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
