package br.com.gulliver.model;

import java.util.ArrayList;

public class Banco {

	static ArrayList<Hotel> lista = new ArrayList<Hotel>();
	
	static {
		lista.add(new Hotel(0, "IBIS Styles São Paulo Anhembi", "Av. Cruzeiro do Sul, 1709 - Santana", "São Paulo", "Sudeste"));
		lista.add(new Hotel(1, "Grand São Paulo Hotel", "123 Avenida Paulista", "São Paulo", "SP"));
		lista.add(new Hotel(2, "Hotel Luxo Paulistano", "456 Rua Consolação", "São Paulo", "SP"));
		lista.add(new Hotel(3, "São Paulo Plaza Hotel", "789 Avenida Brigadeiro Faria Lima", "São Paulo", "SP"));
		lista.add(new Hotel(4, "Hotel Parque Ibirapuera", "1010 Avenida Ibirapuera", "São Paulo", "SP"));
		lista.add(new Hotel(5, "Hotel Centro Histórico", "222 Rua São Bento", "São Paulo", "SP"));
	}
	
	static public ArrayList<Hotel> getLista() {
		return Banco.lista;
	}
	
	static public void adicionaHotel(Hotel h) {
		Banco.lista.add(h);
	}
	
	
	
}
