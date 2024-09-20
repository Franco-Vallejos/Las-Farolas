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
	public int getMaxPos() {
		return pos + range;
	}
	public int getMinPos() {
		return pos - range;
	}
	public boolean inRange(int pos) {
		return pos >= this.getMinPos() && pos <= this.getMaxPos();
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
		return  "---------------------------" +
				"\nFarol en la posicion: " + pos +
				"\nCon rango: " + range +
				"\nSe encuentra encendido: " + encendido;
				
		}
}
