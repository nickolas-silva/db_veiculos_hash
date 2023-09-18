package hash_enderecamento;

import entity.Veiculo;

public class No {

	Integer chave;
	public Veiculo valor;

	
	public No(Veiculo v) {
	  this.setChave(v.renavam);
		this.setValor(v);
	}
	
	public Integer getChave() {
		return chave;
	}

	public void setChave(Integer chave) {
		this.chave = chave;
	}

	public Veiculo getValor() {
		return valor;
	}

	public void setValor(Veiculo valor) {
		this.valor = valor;
	}

	
}