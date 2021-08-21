package classes;

public class Produtos {

    public static Object getProduts;
    private int codigo;
    private String nome;
    private int valor;
    private int quantidadeEstoque;
    
    
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int i) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
   public void setNome (String nome){

       this.nome = nome;
   }

    public int getValor() {
        return valor;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }
 
  
    public Produtos(int codigo, String nome, int valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Produtos() {
    }

    @Override
        public String toString() {
    return "Produtos [codigo=" + codigo + ", nome=" + nome + ", qntEmEstoque=" + ", valor=" + valor + "]";
    }

    public void setCodigo() {
    }

    public void setNome(int nextLine) {
    }

    public static void exibirProduto(Object prodBusca) {
    }

    public void setValor(String nextLine) {
    }
    
        



}