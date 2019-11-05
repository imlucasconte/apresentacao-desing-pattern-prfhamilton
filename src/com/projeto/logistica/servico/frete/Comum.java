package com.projeto.logistica.servico.frete;

import com.projeto.logistica.metodo.servico.Frete;

public class Comum implements Frete {

	public double calcularPreco(int distancia) {
		return distancia * 1.25 + 10;
	}
	
}
