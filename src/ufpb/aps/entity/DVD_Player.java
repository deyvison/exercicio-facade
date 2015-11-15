package ufpb.aps.entity;

import ufpb.aps.interfaces.EquipamentoDeExibicao;
import ufpb.aps.interfaces.EquipamentoDeSom;
import ufpb.aps.interfaces.FonteDeImagem;
import ufpb.aps.interfaces.FonteDeSom;

public class DVD_Player implements FonteDeSom, FonteDeImagem {
	
	
	public void ligar(){
		System.out.println("DVD Player ligado!");
	}
	
	public void desligar(){
		System.out.println("DVD Player desligado!");
	}
	
	
	public void play(){
		
	}
	
	public void pause(){
		
	}
	
	public void stop(){
		
	}
	
	public void ejetarDVD(){
		System.out.println("DVD ejetado!");
	}
	
	public void inserirDVD(DVD dvd){
		System.out.println("DVD inserido - "+dvd.getTitulo());
	}
	
	public void setOutput(EquipamentoDeExibicao imagem, EquipamentoDeSom som){
		System.out.println("Saida de imagem e som definidos para "+imagem.getNome()+" e "+som.getNome());
	}
	
	@Override
	public String gerarImagem() {
		return "Imagem gerada!";
	}
	
	@Override
	public String gerarSom() {
		return "Som gerado!";
	}
}
