package br.com.tinnova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.tinnova.bean.Votacao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("oi");
		Votacao objVotacao = new Votacao(1000L,800L,150L,50L);
		System.out.println("Percentagem votos validos:"+objVotacao.getPercentualValidos());
		System.out.println("Percentagem votos brancos:"+objVotacao.getPercentualBrancos());
		System.out.println("Percentagem votos nulos:"+objVotacao.getPercentualNulos());
		
		Integer[] dados = { 5,3,2,4,7,1,0,6 };
	    List<Integer> lista = Arrays.asList(dados);
	    bubbleSort(lista);
	    lista.stream().forEach(item -> {
	    	System.out.print(item+" ");
	    });
	    System.out.println("");
	    Integer fact = factorial(6);
	    System.out.println("O fatorial é "+fact);
	    Long numero = 13L;
	    Long A = somaDivisores(numero, 2L);
	    Long B = somaDivisores(numero, 3L);
	    Long C = somaDivisores(numero, 6L);
	    
	    System.out.println("Soma divisor de 2 e 3 é : "+(A+B-C));
		    
	    
	}
	public static void bubbleSort(List<Integer>lista){
		for(int i=0;i<lista.size();i++)
			for(int j=i+1;j<lista.size();j++)
				if(lista.get(i)>lista.get(j)) {
					Integer aux=lista.get(j);
					lista.set(j, lista.get(i));
					lista.set(i, aux);
				}
	}
	public static Integer factorial(Integer n) {
		if(n==0)return 1;
		return n*factorial(n-1);
	}
	private static Long somaDivisores(Long x, Long divisor) {
		Long soma = 0L;
		Long i=1L;
		while(i*divisor<=x) {
			soma += i*divisor;
			i++;
		}
		return soma;
	}
}
