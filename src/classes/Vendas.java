package classes;

import java.text.DateFormat;
import java.util.ArrayList;

import javax.xml.crypto.Data;

import util.ConvertendoDataEHora;

public class Vendas {

    private int dataVenda;
    private String produtoVendido;
    private int qntVendida;
    private double valorInicial;
    private double valoraPagar;
    

    private int codigoDoProduto;
    private ArrayList <Vendas> vendas; 
    
    public Vendas(String string, String produtoVendido, int qntVendida, double valorInicial, double valoraPagar, int codigoDoProduto) {
        this.dataVenda = dataVenda;
        this.produtoVendido = produtoVendido;
        this.qntVendida = qntVendida;
        this.valorInicial = valorInicial;
        this.valoraPagar = valoraPagar;
        this.codigoDoProduto = codigoDoProduto;
        
      
        this.vendas = new ArrayList <Vendas>();
    Vendas vendas = new Vendas(string, produtoVendido, qntVendida, valorInicial, valoraPagar, codigoDoProduto);
    this.vendas.add(vendas);     
    }
    
    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }


    public void setCodigoDoProduto(int codigoDoProduto) {
       
     this.codigoDoProduto = codigoDoProduto;
    }
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

   
    

    
    
    

    
}
