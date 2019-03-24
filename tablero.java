package tp1;



public class tablero {
	
	private button [][] luces;
	
	public tablero(int filas, int columnas) {
		this.luces=new button[filas][columnas];
		
	}
   
	public void agregarButton(int fila,int columna) {
		luces[fila][columna]=new button();
		luces[fila][columna].cambiarNombre(fila, columna);
		lighOut.panel.add(luces[fila][columna]);
	}
}
