public class Estrategias {
	
	/**
	 * Retorna el numero de fruta que resulte mas cercana al personaje.
	 * 
	 * @param x: la posicion en X del personaje
	 * @param y: la posicion en Y del personaje
	 * @param x1: la posicion en X de la primera fruta
	 * @param y1: la posicion en Y de la primera fruta
	 * @param x2: la posicion en X de la segunda fruta
	 * @param y2: la posicion en Y de la segunda fruta
	 * @return 1 si la primera fruta es la más cercana, 2 en caso contrario.
	 */
	public int frutaMasCercana(int x, int y, int x1, int y1, int x2, int y2) {
		//Distancia entre el personaje y la primer fruta
		int distanciaConFruta1EnX = Math.abs(x - x1); //Math.abs() para obtener el valor absoluto de la diferencia entre ambas posiciones
		int distanciaConFruta1EnY = Math.abs(y - y1); // Idem
		int distanciaConFruta1Total = distanciaConFruta1EnX + distanciaConFruta1EnY;
		
		//Distancia entre el personaje y la segunda fruta
		int distanciaConFruta2EnX = Math.abs(x - x2); 
		int distanciaConFruta2EnY = Math.abs(y - y2); 
		int distanciaConFruta2Total = distanciaConFruta2EnX + distanciaConFruta2EnY;
		
		if (distanciaConFruta1Total < distanciaConFruta2Total) {
			return 1;
		}
		if (distanciaConFruta1Total > distanciaConFruta2Total) {
			return 2;
		}
		
		return 0; // No borré el return 0 en caso de que ambas frutas esten a la misma distancia con respecto al personaje
	}
	
	/**
	 * Saca por pantalla las instrucciones necesarias para llegar desde
	 * la posicion actual hasta la posicion objetivo.
	 * 
	 * Ejemplo:
	 * desplazarseHacia(0, 0, 1, 1)
	 * 
	 * Debe sacar por pantalla:
	 * ARRIBA
	 * DERECHA
	 *
	 * Ejemplo 2:
	 * desplazarseHacia(0, 0, -1, -1)
	 * 
	 * Debe sacar por pantalla:
	 * ABAJO
	 * IZQUIERDA
	 * 
	 * @param x: la posicion en X del personaje
	 * @param y: la posicion en Y del personaje
	 * @param xObj: la posicion en X del objetivo
	 * @param yObj: la posicion en Y del objetivo
	 */
	public void desplazarseHacia(int x, int y, int xObj, int yObj) {

		// Desplazamiento vertical
		int distanciaY = Math.abs(y - yObj);
		for (int iY = 0; iY < distanciaY; iY++) {
			if (yObj > y) { // Si yObj es mayor al punto de origen, los pasos serán hacia arriba, de lo contrario serán hacia abajo
				System.out.println("ARRIBA");
			} else if (yObj < y){
				System.out.println("ABAJO");
			}
		}
		
		// Desplazamiento horizontal
		
		int distanciaX = Math.abs(x - xObj);
		for (int iX = 0; iX < distanciaX; iX++) {
			if (xObj > x) { // Si xObj es mayor al punto x de origen, los pasos serán hacia la derecha, de lo contrario serán hacia la izquierda
				System.out.println("DERECHA");
			} else {
				System.out.println("IZQUIERDA");
			}
		}
				
		
		
	}

	/**
	 * Saca por pantalla las instrucciones necesarias para alejarse desde
	 * la posicion actual de la posicion del enemigo, a la posición opuesta.
	 * 
	 * Ejemplo:
	 * alejarseDe(0, 0, 1, 2) -> debe ir a la posición -1, -2
	 * 
	 * Debe sacar por pantalla:
	 * ABAJO
	 * ABAJO
	 * IZQUIERDA
	 *
	 * Ejemplo 2:
	 * alejarseDe(1, 0, -2, 1) -> debe ir a la posición (4, -1)
	 *
	 * Debe sacar por pantalla:
	 * ABAJO
	 * DERECHA
	 * DERECHA
	 * DERECHA	 
	 * 
	 * @param x: la posicion en X del personaje
	 * @param y: la posicion en Y del personaje
	 * @param xEnem: la posicion en X del enemigo
	 * @param yEnem: la posicion en Y del enemigo
	 */
	public void alejarseDe(int x, int y, int xEnem, int yEnem) {
		// Alejamiento vertical
	
		int distanciaY = Math.abs(y - yEnem);
		for (int iY = 0; iY < distanciaY; iY++) {
			if (yEnem > y) {
				System.out.println("ABAJO");
			} else {
				System.out.println("ARRIBA");
			}
		}
		
		// Alejamiento horizontal
		
		int distanciaX = Math.abs(x - xEnem);
		for (int iX = 0; iX < distanciaX; iX++) {
			if (xEnem > x) {
				System.out.println("IZQUIERDA");
			} else {
				System.out.println("DERECHA");
			}
		}
	}

}
