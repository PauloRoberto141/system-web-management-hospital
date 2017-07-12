package modelo.dominio;

public class Preco {
	
	private Double valor;
	
	private TabelaDePrecoItem tabelaDePrecoItem;
	private Item item;
	
	public Preco(Double valor, TabelaDePrecoItem tabelaDePrecoItem, Item item){
		this.setValor(valor);
		this.setTabelaDePrecoItem(tabelaDePrecoItem);
		this.setItem(item);
		
	}
	
	//Getters e Setters
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public TabelaDePrecoItem getTabelaDePrecoItem() {
		return tabelaDePrecoItem;
	}

	public void setTabelaDePrecoItem(TabelaDePrecoItem tabelaDePrecoItem) {
		this.tabelaDePrecoItem = tabelaDePrecoItem;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Preco [valor=" + valor + ", tabelaDePrecoItem=" + tabelaDePrecoItem + ", item=" + item + "]";
	}
	
	

}
