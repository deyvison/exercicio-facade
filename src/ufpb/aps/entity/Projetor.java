package ufpb.aps.entity;

import ufpb.aps.interfaces.EquipamentoDeExibicao;
import ufpb.aps.interfaces.FonteDeImagem;

public class Projetor implements EquipamentoDeExibicao {
	
	private String nome;
	
	public Projetor() {
		this.nome = "Projetor";
	}
	public void ligar(){
		System.out.println("Projetor ligado!");
	}
	
	public void desligar(){
		System.out.println("Projetor desligado!");
	}

	@Override
	public String exibirImagem(FonteDeImagem fonte) {
		return fonte.gerarImagem();
	}
	
	public void setOrigemImagem(FonteDeImagem fonte){
		
	}
	
	public String getNome(){
		return this.nome;
	}
}
