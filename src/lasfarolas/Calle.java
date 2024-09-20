package lasfarolas;

public class Calle {
	private int puntos[];
	private Farolas farolas[];
	
	public Calle(int puntos[], int faloras[], int radios[]) throws Exception {
		if(faloras.length != radios.length) {
			throw new Exception("La longitud del vector de falores difiere de la de los radios");
		}
		this.puntos = new int[puntos.length];
		this.farolas = new Farolas[faloras.length];
		
		for (int i=0; i<puntos.length; i++) {
			this.puntos[i] = puntos[i];
		}
		for (int i=0; i<faloras.length; i++) {
			this.farolas[i] = new Farolas(faloras[i], radios[i]);
		}
	}
	
	public boolean encenderLuces() {
		int posFarola=0;
		int min, max, punto;
		Farolas farola, farolaAnterior;
		farola = this.farolas[posFarola];
		farolaAnterior = farola;
		min = farola.getPos() - farola.getRange();
		max = farola.getPos() + farola.getRange();
		
		for(int i=0; i<puntos.length; i++) {
			punto=puntos[i];
			if(punto >= min && punto<=max) {
				if(farola.getEncendido()) {
					continue;
				}
				while((punto >= min && punto<=max) && posFarola<farolas.length) {
					farolaAnterior = farola;
					posFarola++;
					farola = this.farolas[posFarola];
					min = farola.getPos() - farola.getRange();
					max = farola.getPos() + farola.getRange();	
				}
				farolaAnterior.setEncendido();
				farola = farolaAnterior;
				min = farola.getPos() - farola.getRange();
				max = farola.getPos() + farola.getRange();	
			}
			else {
				posFarola++;
				farola = this.farolas[posFarola];
				min = farola.getPos() - farola.getRange();
				max = farola.getPos() + farola.getRange();
				while(!(punto >= min && punto<=max) && posFarola < farolas.length){
					farola = this.farolas[posFarola];
					min = farola.getPos() - farola.getRange();
					max = farola.getPos() + farola.getRange();
					posFarola++;
				}
				if(posFarola == farolas.length) {
					return false;
				}
				farola.setEncendido();
			}
		}
		return true;
	}

	public void mostrarListadoDeLuces() {
		for(int i=0; i<farolas.length; i++) {
			System.out.println(this.farolas[i]);
		}
	}
}
