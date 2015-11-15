package ufpb.aps.entity;

public class DVD {
	
	private String titulo;
	private String sinopse;
	private Integer duracao;
	
	public DVD(String titulo, String sinopse, Integer duracao){
		this.titulo = titulo;
		this.sinopse = sinopse;
		this.duracao = duracao;
	}
	
	public DVD(){
		this("Sem título","Sem sinipse",00);
	}

	@Override
	public String toString() {
		return "DVD [titulo=" + titulo + ", sinopse=" + sinopse + ", duracao=" + duracao + "]";
	}

	public String getTitulo() {
		return titulo;
	}
	
}
