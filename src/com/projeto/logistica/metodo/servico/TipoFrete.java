package com.projeto.logistica.metodo.servico;

import com.projeto.logistica.servico.frete.Comum;
import com.projeto.logistica.servico.frete.Sedex;
import com.projeto.logistica.servico.frete.Sedex10;

public enum TipoFrete {

	NORMAL {
		@Override
		public Frete obterFrete() {
			return new Comum();
		}
	},
	SEDEX {
	@Override
		public Frete obterFrete() {
			return new Sedex();
		}
	},
	SEDEX10{
		@Override
		public Frete obterFrete() {
			return new Sedex10();
		}
	};

	public abstract Frete obterFrete();

}
