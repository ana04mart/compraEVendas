package classes;

public class Vendas {
   
    public int dataVenda;
    public String produtoVendido;
    public int qntVendida;
    public double valorInicial;
    public double valoraPagar;
    
    public int getValorInicial() {
        return (int) valorInicial;
    }
 
    public void setValorInicial(Double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public int getValoraPagar() {
        return (int) valoraPagar;
    }
    public void setValoraPagar(Double valoraPagar) {
        this.valoraPagar = valoraPagar;
    }

    public int getDataVenda() {
        return dataVenda;
    }
     public void setDataVenda(int dataVenda) {
        this.dataVenda = dataVenda;
    }



    public String getProdutoVendido() {
        return produtoVendido;
    }
    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }



     public int getQntVendida() {
        return qntVendida;
    }
     public void setQntVendida(int qntVendida) {
        this.qntVendida = qntVendida;
    }
  
    
    public Vendas(String string, String string2, String string3, String string4, String string5) {
    }
    public Vendas(String string, String produtoVendido2, String string2) {
    }
    @Override
    public String toString() {
        return "Vendas [valorInicial=" + valorInicial + ", valoraPagar=" + valoraPagar + "]";
    }

    
    
    

    
}
