package br.com.fatec.pdi.operacao;

import br.com.fatec.pdi.visao.ImagemGUI;

/**
 * @author Victor Drulis Oliveira
 * @contact victordrulis@gmail.com
 */
public class Histograma {
	
    
    /**
     * Histograma da imagem dada sua frequencia de cinzas
     * 
     * @param imagem
     * @param frequenciaCinza
     * @return histograma
     */
    public int[] histograma(ImagemGUI imagem, int[] frequenciaCinza) {
    	
    	int[] histograma = new int[256];
    	
    	for (int i = 0; i < 256; i++) {
    		histograma[i] = frequenciaCinza[i] / (imagem.getAltura() * imagem.getLargura());
    	}
    		
    	return histograma;
    }

}
