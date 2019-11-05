package com.projeto.logistica.servico.frete;

import com.projeto.logistica.metodo.servico.Frete;

public class Sedex implements Frete {

	public double calcularPreco(int distancia) {
		return distancia * 1.45 + 12;
	}
	
}
