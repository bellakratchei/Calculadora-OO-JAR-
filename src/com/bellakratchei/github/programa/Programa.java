package com.bellakratchei.github.programa;

import com.bellakratchei.github.calculadora.Divisao;
import com.bellakratchei.github.calculadora.Multiplicacao;
import com.bellakratchei.github.calculadora.Soma;
import com.bellakratchei.github.calculadora.Subtracao;

/** Calculadora OO implementando conceitos de JAR e Javadoc
 * aprendidos na aula de Programação II
 * 
 * <p>
 * Esta calculadora está realizando as 
 * operações básicas (soma,subtração,divisão e multiplicação)
 * </p>
 * 
 * <blockquote><pre>
	 * Divisao.Dividir(100,50);
	 * Soma.Somar(100,25);
	 * Subtracao.Subtrair(100,90);
	 * Multiplicacao.Multiplicar(25,4);
	 * //O resultado da divisão é: 2
	 * //O resultado da soma é: 125
	 * //O resultado da subtração é: 10
	 * //O resultado da multiplicação é: 100
 * </pre></blockquote>
 * 
 * @see
 * e preciso fazer uma verificação na biblioteca Calculadora, importada para o projeto, 
 * pois está dando erro (exception in thread "main")
 * 
 * @author bellakratchei
 * 
 * @version 1.0
 * 
 */

public class Programa {

	public static void main(String[] args) {
		
		try { 
			System.out.println(Divisao.Dividir(100,50));
			System.out.println(Soma.Somar(100,25));
			System.out.println(Subtracao.Subtrair(100,90));
			System.out.println(Multiplicacao.Multiplicar(25,4)); 
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		 
	}

}
