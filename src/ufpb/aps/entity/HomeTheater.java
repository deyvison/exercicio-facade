package ufpb.aps.entity;

import ufpb.aps.interfaces.EquipamentoDeSom;
import ufpb.aps.interfaces.FonteDeSom;

public class HomeTheater implements EquipamentoDeSom {
	
	private String nome;
	
	
	public HomeTheater() {
		
		this.nome = "Home_Theater";
		
	}
	
	
	@Override
	public String emitirSom(FonteDeSom fonte) {
		// TODO Auto-generated method stub
		return fonte.gerarSom();
	}
	
	public void ligarCaixasDeSom(){
		System.out.println("Caixas de som ligadas!");
	}
	
	public void desligarCaixasDeSom(){
		System.out.println("Caixas de som deligadas!");
	}
	
	public void setVolume(int volume){
		System.out.println("Volume definido para "+volume);
	}
	
	public void ligar(){
		System.out.println("Home Theater ligado!");
	}
	
	public void desligar(){
		System.out.println("Home Theater desligado!");
	}
	
	public String getNome(){
		return this.nome;
	}

}
