

import java.util.ArrayList;

public class Restaurante {

	private ArrayList<Comanda> comandas;

	public Restaurante() {
		comandas = new ArrayList<Comanda>();
	}

	public void listarComanda(int numeroComanda, String descripcion) {

		comandas.add(numeroComanda, new Comanda(descripcion));

		System.out.println("Comanda " + numeroComanda + " listada.");
	}

	public void mostrarComandasPendientes() {

		System.out.println("Comandas pendientes: ");

		for (Comanda comanda : comandas) {
			System.out.println(comanda);
		}
	}

	public void eliminarComanda(int numeroComanda) {

		comandas.remove(numeroComanda);

		System.out.println("Comanda " + numeroComanda + " eliminada");
	}
}
