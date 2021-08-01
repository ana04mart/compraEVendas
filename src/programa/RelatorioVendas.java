package programa;
import java.util.Scanner;
import classes.Vendas;

public class RelatorioVendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);  
  
    String titulo;
    String periodoEmissao;
    int valorMedioDasVendas = 0;

    Vendas venda = new Vendas("04/03","leite","1","10.00","10.00");

    
            System.out.println("RELATÓRIO DE VENDA.");
    System.out.println("Informe a data da compra:");
       int data = sc.nextInt();
    System.out.println("Informe o código do produto:");
        int codigo = sc.nextInt();
    System.out.println("Informe o nome do produto:");
        String nome = sc.next();
   
    

    public static int nextLine() {
        return 0;
    }   
   sc.close();

}