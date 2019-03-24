package tp1;

public class controles {
	
	private tablero tabla;
	
public void crearTablero(int ancho, int alto){
	tabla =new tablero(ancho, alto);
	
	for(int fila=0; fila<ancho;fila++) {
		for(int columna=0;columna<alto;columna++ ) {
			tabla.agregarButton(fila, columna);
			
		}
	}
}

}

