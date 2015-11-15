package ufpb.aps.entity;

import ufpb.aps.interfaces.EquipamentoDeExibicao;
import ufpb.aps.interfaces.EquipamentoDeSom;
import ufpb.aps.interfaces.FonteDeImagem;
import ufpb.aps.interfaces.FonteDeSom;

public class Televisao implements FonteDeSom, FonteDeImagem, EquipamentoDeExibicao, EquipamentoDeSom {
	
	private String nome;
	
	public Televisao() {
		this.nome = "Televisão";
	}
	
	@Override
	public String exibirImagem(FonteDeImagem fonte) {
		return fonte.gerarImagem();
	}

	@Override
	public String gerarImagem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String gerarSom() {
		// TODO Auto-generated method stub
		return null;
	}

	public void ligar() {

	}
	
	public void desligar(){
		System.out.println("Televisão desligada!");
		
	}
	
	public void setVolume(int volume){
		
	}

	@Override
	public String emitirSom(FonteDeSom fonte) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	
}
