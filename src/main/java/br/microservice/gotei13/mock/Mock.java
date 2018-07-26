package br.microservice.gotei13.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.microservice.gotei13.domain.Divisao;
import br.microservice.gotei13.domain.Shinigami;

@Component
public class Mock {
	private List<Shinigami> shinigamis;
	private List<Divisao> divisoes;
	
	private void inicialize() {
		this.divisoes = new ArrayList<Divisao>();
		this.shinigamis = new ArrayList<Shinigami>();
	}
	
	private void addDivisao() {
		divisoes.add(new Divisao(1,		"一 番 队",		"Ichiban-tai"	));
		divisoes.add(new Divisao(2,		"二 番 队",		"Nibantai"		));
		divisoes.add(new Divisao(3,		"三 番 队",		"Sanbantai"		));
		divisoes.add(new Divisao(4,		"四 番 队",		"Yonbantai"		));
		divisoes.add(new Divisao(5,		"五 番 隊",		"Gobantai"		));
		divisoes.add(new Divisao(6,		"六 番 队",		"Rokubantai"	));
		divisoes.add(new Divisao(7,		"七 番 队",		"Nanabantai"	));
		divisoes.add(new Divisao(8,		"八 番 队",		"Hachibantai"	));
		divisoes.add(new Divisao(9,		"九 番 队",		"Kyūbantai"		));
		divisoes.add(new Divisao(10,	"十 番 队",		"Jūbantai"		));
		divisoes.add(new Divisao(11,	"十一 番 队",		"Jūichibantai"	));
		divisoes.add(new Divisao(12,	"十二 番 队",		"Jūnibantai"	));
		divisoes.add(new Divisao(13,	"十三 番 队",		"Jūsanbantai"	));
	}
		
	private void addShinigami() {
		shinigamis.add(new Shinigami(divisoes.get(0), 	"Kyoraku Shunsui", 			"Capitão",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(1), 	"Soi Fong", 				"Capitão",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(2), 	"Rōjūrō Ōtoribashi (Rose)", "Capitão",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(3), 	"Unohana Retsu", 			"Capitão",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(4), 	"Shinji Hirako", 			"Capitão",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(5), 	"Kuchiki Byakuya", 			"Capitão",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(6), 	"Komamura Sajin", 			"Capitão",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(7), 	"Desconhecido", 			"Capitão",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(8), 	"Muguruma Kensei", 			"Capitão",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(9), 	"Hitsugaya Tōshirō", 		"Capitão",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(10), 	"Zaraki Kenpachi", 			"Capitão",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(11), 	"Kurotsuchi Mayuri",		"Capitão",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(12), 	"Kuchiki Rukia", 			"Capitão",	"Empossado"));		
		
		shinigamis.add(new Shinigami(divisoes.get(0),	"Nanao Ise", 				"Tenente",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(1),	"Marechiyo Omaeda", 		"Tenente",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(2),	"Kira Izuru", 				"Tenente",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(3),	"Kotetsu Isane", 			"Tenente",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(4),	"Momo Hinamori", 			"Tenente",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(5),	"Abarai Renji", 			"Tenente",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(6),	"Iba Tetsuzaemon", 			"Tenente",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(7),	"Desconhecido", 			"Tenente",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(8),	"Hisagi Shuhei", 			"Tenente",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(9),	"Matsumoto Rangiku", 		"Tenente",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(10),	"Kusajishi Yachiru", 		"Tenente",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(11),	"Kurotsuchi Nemu", 			"Tenente",	"Empossado"));
		shinigamis.add(new Shinigami(divisoes.get(12),	"Desconhecido", 			"Tenente",	"Empossado"));
	}
		
	private void updateDivisoes() {
		for(int i = 0; i < 13; i++) {
			divisoes.get(i).getShinigamis().add(shinigamis.get(i));
			divisoes.get(i).getShinigamis().add(shinigamis.get(i+13));
		}
	}
	
	private void geradorDeDados() {
		this.inicialize();
		this.addDivisao();
		this.addShinigami();
		this.updateDivisoes();
	}
	
	public List<Shinigami> getShinigamis() {
		this.geradorDeDados();
		return shinigamis;
	}
	
	public List<Divisao> getDivisoes() {
		this.geradorDeDados();
		return divisoes;
	}
}