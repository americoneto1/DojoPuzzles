package br.com.edsonmartins.maven;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.StringUtils;

public class QuebraDeLinha {
	
	private String frase;
	private int colunas;
	
	public QuebraDeLinha(String frase, int colunas) {
		this.frase = frase;
		this.colunas = colunas;
	}
	
	public String quebrarLinha() {	
		String linha = "";
		List<String> linhas = new ArrayList<String>();
		String[] palavras = this.frase.split(" ");
		int colunasRestantesNaLinha = this.colunas;		
		
		for(int i = 0, len = palavras.length; i < len; i += 1) {
			if( palavras[i].length() <= colunasRestantesNaLinha ) { //Cabe na linha
				linha += palavras[i];
				colunasRestantesNaLinha -= palavras[i].length();
			} else { //Não cabe na linha
				linhas.add(linha);
				linha = palavras[i];
				colunasRestantesNaLinha = this.colunas - palavras[i].length();
			}						
			if( i == len - 1 ) {
				linhas.add(linha);
			} else {
				linha += " ";
				colunasRestantesNaLinha -= 1;
			}			
		}
		return StringUtils.join(linhas.toArray(), "\n");
	}
}
