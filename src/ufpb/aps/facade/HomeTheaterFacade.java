package ufpb.aps.facade;

import ufpb.aps.entity.DVD;
import ufpb.aps.entity.DVD_Player;
import ufpb.aps.entity.HomeTheater;
import ufpb.aps.entity.Projetor;
import ufpb.aps.entity.Televisao;

public class HomeTheaterFacade {

	private DVD_Player dvd_player;
	private Televisao televisao;
	private Projetor projetor;
	private HomeTheater home_theater;

	public HomeTheaterFacade() {

		this.dvd_player = new DVD_Player();
		this.televisao = new Televisao();
		this.projetor = new Projetor();
		this.home_theater = new HomeTheater();
	}

	
	public void ligarSistema(DVD dvd) {

		this.dvd_player.setOutput(this.projetor, this.home_theater);
		this.televisao.desligar();
		this.dvd_player.ligar();
		this.projetor.ligar();
		this.home_theater.ligar();
		this.home_theater.ligarCaixasDeSom();
		this.home_theater.setVolume(90);
		this.dvd_player.inserirDVD(dvd);

	}
	
	public void desligarSistema() {

		this.dvd_player.ejetarDVD();
		this.dvd_player.setOutput(this.televisao, this.televisao);
		this.dvd_player.desligar();
		this.projetor.desligar();
		this.home_theater.setVolume(0);
		this.home_theater.desligarCaixasDeSom();
		this.home_theater.desligar();

	}
	
	public void aumentarVolume(int volume) {
		this.home_theater.setVolume(volume);
	}

	public void diminuirVolume(int volume) {
		this.home_theater.setVolume(volume);
	}

	public void play() {
		this.dvd_player.play();
	}

	public void pause() {
		this.dvd_player.pause();
	}

	public void stop() {
		this.dvd_player.stop();
	}

}
