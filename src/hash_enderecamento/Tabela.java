package hash_enderecamento;

import entity.Veiculo;

public class Tabela {

	Integer m;
	No tabela[];

	public Tabela(int tam) {
		this.m = tam;
		this.tabela = new No[this.m];
	}

	public int hash(int k) {

		return k % this.m;

	}

	public void inserir(Veiculo v) {

		int h = this.hash(v.renavam);

		while (tabela[h] != null) {

			if (tabela[h].chave == v.renavam)
				break;

			h = (h + 1) % this.m;
		}

		if (tabela[h] == null) {
			tabela[h] = new No(v);
		}

	}

	public No buscar(int k) {

		int h = this.hash(k);

		while (tabela[h] != null) {

			if (tabela[h].chave == k)
				return tabela[h];

			h = (h + 1) % this.m;
		}
		
		return null;

	}
	
	public void imprimir() {
		
		for (int i = 0; i < tabela.length; i++) {
			
			if(tabela[i] != null)
				System.out.println(i + " --> " + tabela[i].valor.toString());
			else
				System.out.println(i);
		}

	}

	public void remover(Integer k){
		int h = this.hash(k);

		if(tabela[h].valor != null){
			tabela[h] = null;
			System.out.println("EXCLUIDO COM SUCESSO");
		}
		else{
			System.out.println("Nao tem nada para excluir");
		}

	}

	public void editar(Veiculo v, Integer k){
		int h = this.hash(k);

		tabela[h].valor = v;
		
	}

	public int contVeiculos(){
		int qnt = 0;
		for(int i = 0; i < tabela.length; i++){
			if(tabela[i] != null){
				qnt++;
			}

		}
		return qnt;
	}

	

}