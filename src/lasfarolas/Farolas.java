package lasfarolas;

public class Farolas {
	private int pos;
	private int range;
	private boolean encendido;
	
	public Farolas(int pos, int range) {
		this.pos = pos;
		this.range = range;
	}
	
	public int getPos(){
		return pos;
	}
	
	public int getRange(){
		return range;
	}
	
	public boolean getEncendido(){
		return encendido;
	}
	
	public void setEncendido() {
		encendido=true;
	}
	
	public void setNoEncendido() {
		encendido=false;
	}
	
	@Override
	public String toString() {
		return  "Farol en la posicion: " + pos +
				"\nCon rango: " + range +
				"\nSe encuentra encendido: " + encendido;
		}
}
