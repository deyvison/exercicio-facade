package ufpb.aps.main;

import ufpb.aps.entity.DVD;
import ufpb.aps.facade.HomeTheaterFacade;

public class Main {
	
	public static void main(String[] args) {
		
		HomeTheaterFacade htf = new HomeTheaterFacade();
		
		System.out.println("Ligando sistema...");
		htf.ligarSistema(new DVD("Titanic","Uma linda história de amor", 180));
		
		System.out.println("\n\nDesligando o sistema...");
		htf.desligarSistema();
		
	}
}
