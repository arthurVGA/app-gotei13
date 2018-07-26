package br.microservice.gotei13.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.microservice.gotei13.domain.Shinigami;
import br.microservice.gotei13.mock.Mock;

public class ShinigamiService {
	@Autowired
	private Mock mock;

	public List<Shinigami> getAll() {
		return mock.getShinigamis();
	}
	
	public List<Shinigami> getByDivisaoId(Integer idDivisao) {
		List<Shinigami> listaTemporaria;
		listaTemporaria = new ArrayList<Shinigami>();
		
		for (Shinigami shinigami : mock.getShinigamis()) {
			if(shinigami.getDivisao().getId().equals(idDivisao)) {
				listaTemporaria.add(shinigami);
			}
		}
		return listaTemporaria;
	}
}