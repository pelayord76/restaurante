

public class Start {

	public static void main(String[] args) {
		
		Restaurante asadorJose = new Restaurante();
		
		// parte 1
		asadorJose.listarComanda(0, "Chuleton");
		asadorJose.listarComanda(1, "Parrillada");
		asadorJose.listarComanda(2, "Plato combinado");
		
		// parte 2
		asadorJose.mostrarComandasPendientes();
		
		// parte 3
		asadorJose.eliminarComanda(0);		
		asadorJose.eliminarComanda(1);
		
		asadorJose.mostrarComandasPendientes();
	}
}
