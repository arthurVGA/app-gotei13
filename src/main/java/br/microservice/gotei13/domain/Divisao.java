package br.microservice.gotei13.domain;

import java.util.ArrayList;
import java.util.List;

public class Divisao {
	private Integer id;
	private String kanji;
	private String romanji;
	private List<Shinigami> shinigamis;
	
	public Divisao(Integer id, String kanji, String romanji) {
		this.id = id;
		this.kanji = kanji;
		this.romanji = romanji;
		this.shinigamis = new ArrayList<Shinigami>();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKanji() {
		return kanji;
	}
	public void setKanji(String kanji) {
		this.kanji = kanji;
	}
	public String getRomanji() {
		return romanji;
	}
	public void setRomanji(String romanji) {
		this.romanji = romanji;
	}

	public List<Shinigami> getShinigamis() {
		return shinigamis;
	}

	public void setShinigamis(List<Shinigami> shinigamis) {
		this.shinigamis = shinigamis;
	}
}