package br.com.fatec.pdi.operacao;

import br.com.fatec.pdi.visao.ImagemGUI;

/**
 * Retorna escala de cinza baseada em algoritmos:
 * 
 * COMBINAÇÕES PARA ESCALA DE CINZA:
 * 
 * 		BT709 Grayscale:
 * 			Pixel cinza (i,j) = (0,2125.R ij + 0,7154.G ij + 0,0721B ij )
 *
 * 		RMY Grayscale:
 * 			Pixel cinza (i,j) = (0,5.R ij + 0,419.G ij + 0,081B ij )
 *
 * 		Y-Grayscale (YIQ/NTSC):
 * 			Pixel cinza (i,j) = (0,299.R ij + 0,587.G ij + 0,114B ij )
 * 
 *
 * @author Victor Drulis Oliveira
 * @contact victordrulis@gmail.com
 */
public class EscalaDeCinza {

	/**
     * Escala BT709
     * 
     * @param imagem
     * @return freqCinza
     */
    public int[] bt709(ImagemGUI imagem) {
    	int[] freqCinza = new int[256];
    	Double calculo;
    	int r = 0, g = 0, b = 0;
    	
    	for (int i = 0; i < imagem.getLargura(); i++) {
    		for (int j = 0; j < imagem.getAltura(); j++) {
    			r = imagem.getR(i, j);
    			g = imagem.getG(i, j);
    			b = imagem.getB(i, j);
    			
    			calculo = (0.2125 * r) + (0.7154 * g) + (0.0721 * b);
    			freqCinza[calculo.intValue()]++;
    		}
    	}
    	
    	return freqCinza;
    }
    
    /**
     * Escala RMY
     * 
     * @param imagem
     * @return freqCinza
     */
    public int[] rmy(ImagemGUI imagem) {
    	int[] freqCinza = new int[256];
    	Double calculo;
    	int r = 0, g = 0, b = 0;
    	
    	for (int i = 0; i < imagem.getLargura(); i++) {
    		for (int j = 0; j < imagem.getAltura(); j++) {
    			r = imagem.getR(i, j);
    			g = imagem.getG(i, j);
    			b = imagem.getB(i, j);
    			
    			calculo = (0.5 * r) + (0.419 * g) + (0.081 * b);
    			freqCinza[calculo.intValue()]++;
    		}
    	}
    	
    	return freqCinza;
    }
    
    /**
     * Escala Y-Grayscale (YIQ/NTSC).
     * 
     * @param imagem
     * @return freqCinza
     */
    public int[] yiqNtsc(ImagemGUI imagem) {
    	int[] freqCinza = new int[256];
    	Double calculo;
    	int r = 0, g = 0, b = 0;
    	
    	for (int i = 0; i < imagem.getLargura(); i++) {
    		for (int j = 0; j < imagem.getAltura(); j++) {
    			r = imagem.getR(i, j);
    			g = imagem.getG(i, j);
    			b = imagem.getB(i, j);
    			
    			calculo = (0.5 * r) + (0.419 * g) + (0.081 * b);
    			freqCinza[calculo.intValue()]++;
    		}
    	}
    	
    	return freqCinza;
    }
}
