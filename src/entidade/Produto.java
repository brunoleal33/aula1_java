package entidade;

public class Produto {
	public String name;
	public double preco;
	public int quant;
	
	public double valueTotalInStock(){
		return preco * quant;
	}
	public void addProduto(int quant){
		this.quant = this.quant + quant;
	}
	public void removProduto(int quant){
		this.quant = this.quant - quant;
	}

}
