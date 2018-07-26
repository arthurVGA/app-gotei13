package br.microservice.gotei13.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.microservice.gotei13.domain.Shinigami;
import br.microservice.gotei13.service.ShinigamiService;

@RestController
@RequestMapping("/gotei13")
public class ShinigamiController {	
	
	@Autowired
	private ShinigamiService shinigamiService;
	
	@RequestMapping("/shinigamis")
	public List<Shinigami> getAll() {
		return shinigamiService.getAll();
	}
	
	@RequestMapping(value = "/shinigami/{idDivisao}", method = RequestMethod.GET)
	public List<Shinigami> getByDivisao(@PathVariable("idDivisao")Integer idDivisao) {
		return shinigamiService.getByDivisaoId(idDivisao);
	}
 }