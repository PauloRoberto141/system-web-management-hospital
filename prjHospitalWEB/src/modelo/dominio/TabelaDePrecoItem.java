package modelo.dominio;

import java.util.Set;
import java.util.TreeSet;

public class TabelaDePrecoItem {
	
	private String nomeTabelaDePrecoItem;
	
	private Set<Item> listaItens;
	
	public TabelaDePrecoItem(String nome, Set<Item> listaItens){
		setNomeTabelaDePrecoItem(nome);
		this.listaItens = new TreeSet<Item>();
		for(Item i : listaItens)
			this.adicionarItem(i);
	}
	
	//Getters e Setters
	public String getNomeTabelaDePrecoItem() {
		return nomeTabelaDePrecoItem;
	}

	public void setNomeTabelaDePrecoItem(String nomeTabelaPrecoItem) {
		this.nomeTabelaDePrecoItem = nomeTabelaPrecoItem;
	}
	
	//
	public void adicionarItem(Item item){
		
	}
	

}
